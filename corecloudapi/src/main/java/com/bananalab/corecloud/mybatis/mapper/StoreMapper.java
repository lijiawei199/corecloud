package com.bananalab.corecloud.mybatis.mapper;

import com.bananalab.corecloud.mybatis.model.Store;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-19
 */
public interface StoreMapper extends BaseMapper<Store> {
    @Select("select count(*) from store where type_id =#{typeId}")
    int getAmountByType(@Param("typeId") String typeId);

    @Select("select trim(b.brand) from store as a left join tenant as b on b.id=a.tenant_id where a.fid=#{fid} ")
    String getNameByFid(@Param("fid") String fid);
@Select("select a.fid  from store a left join tenant b on a.tenant_id=b.id where trim(brand)=#{name} ")
    String select(String name);
@Select("select build_url from store where tenant_id=#{tenantId}")
    Integer getBuildUrl(Integer tenantId);
    @Select("select pic_url from store where fid=#{fid}")
    String getPicUrlByFid(String fid);
@Select("select fid from store where tenant_id in (select id from tenant store where  timestampdiff(day,NOW(),lease_end) <90) and floor=#{floor} ")
List<String> selectExpire(Integer floor);

    @Select("select fid from store where tenant_id in (select id from tenant store where  timestampdiff(day,NOW(),lease_end) >90) and floor=#{floor} ")
    List<String> selectConcludeExpire(Integer floor);

    @Select("select fid from store where type_id <> 200000  and floor =#{floor} ")
    List<String> selectUsed(Integer floor);
    @Select("select fid from store where type_id = 200000  and floor =#{floor} ")
    List<String> selectNotUsed(Integer floor);
    @Select("select fid from store a left join tenant b on a.tenant_id=b.id where b.month_rent<40000  and a.floor =#{floor} ")
    List<String> selectLowRent(Integer floor);
    @Select("select fid from store a left join tenant b on a.tenant_id=b.id where 40000<b.month_rent and b.month_rent<50000  and a.floor =#{floor} ")
    List<String> selectMiddleRent(Integer floor);
    @Select("select fid from store a left join tenant b on a.tenant_id=b.id where 50000<b.month_rent  and a.floor =#{floor} ")
    List<String> selectHighRent(Integer floor);
       @Select("select fid from (select  a.fid,${data}  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}<#{num}) temp ")
    List<String> selectLowDate(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("num") Integer num);
    //  @Select("select fid from (select  a.fid,#{data}  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having #{data}>8000 ) temp ")
    @Select("select fid from (select  a.fid,${data}  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}>#{low} and ${data}<#{high} ) temp ")
    List<String> selectMiddleDate(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("low") Integer low,@Param("high") Integer high);
    @Select("select fid from (select  a.fid,${data}  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}>#{num}) temp ")
    List<String> selectHighDate(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("num") Integer num);


    @Select("select fid from (select  a.fid,${data},total_area  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}/total_area<#{num}) temp ")
    List<String> selectLowDateAverage(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("num") Integer num);
    //  @Select("select fid from (select  a.fid,#{data}  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having #{data}>8000 ) temp ")
    @Select("select fid from (select  a.fid,${data},total_area  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}/total_area<#{high} and ${data}/total_area>#{low} ) temp ")
    List<String> selectMiddleDateAverage(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("low") Integer low,@Param("high") Integer high);
    @Select("select fid from (select  a.fid,${data},total_area  from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'   and b.floor=#{floor} group by b.fid having ${data}/total_area>#{num}) temp ")
    List<String> selectHighDateAverage(@Param("date") String date, @Param("floor") String floor,@Param("data") String data,@Param("num") Integer num);



}
