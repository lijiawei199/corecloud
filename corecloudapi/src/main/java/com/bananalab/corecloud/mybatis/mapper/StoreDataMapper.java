package com.bananalab.corecloud.mybatis.mapper;

import com.bananalab.corecloud.api.model.DataObjectSingle;
import com.bananalab.corecloud.api.model.StoreRankVO;
import com.bananalab.corecloud.api.model.StoreTransVO;
import com.bananalab.corecloud.mybatis.model.StoreData;
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
public interface StoreDataMapper extends BaseMapper<StoreData> {
    @Select("select sum(flow) from store_data where time like '${time}%'")
    Integer dateFlow(@Param("time") String time);

    @Select("select sum(sale) from store_data where time like '${time}%'")
    Integer dateSale(@Param("time") String time);

    @Select("select sum(flow) from store_data where time like '${date}%'")
    int getFlowByDate(@Param("date") String date);

    //获取店铺当天流量
    @Select("select sum(flow) from store_data where time like '${date}%' and fid=#{fid}")
    int getFlowByFid(@Param("date") String date, @Param("fid") String fid);

    //客流量TOP5
    @Select("select a.fid,sum(flow) as flow,b.pic_url from store_data a left join store b on a.fid=b.fid where time like '${time}%'   group by fid  order by sum(flow) desc limit 5  ")
    List<StoreData> selectTOP5(@Param("time") String time);

    //转化率排行
    @Select("select c.floor,c.fid,a.brand as name,c.pic_url, b.rate,b.salevolume,b.flow " +
            "from tenant a " +
            "left join (select fid,sum(sale)/sum(flow) as rate,sum(sale) as salevolume,sum(flow) as flow from store_data where time like '${date}%'  group by fid   ) b " +
            "left join store c " +
            "on b.fid=c.fid" +
            " on a.id=c.tenant_id " +
            "  order by rate desc limit 10")
    List<StoreTransVO> getTranslist(@Param("date") String date);

    //坪效排行
    @Select("select  c.brand as name,b.pic_url,a.fid,b.floor,sum(a.sale)/b.total_area as plateaueffect,sum(flow)/b.total_area  as collectpower from store_data a left join  store b left join tenant c on b.tenant_id=c.id  on a.fid=b.fid where a.time like '${date}%' group by a.fid  order by sum(a.sale)/b.total_area desc limit 10")
    List<StoreRankVO> getEffectList(@Param("date") String date);

    //集客力排行
    @Select("select  c.brand as name,b.pic_url,a.fid,b.floor,sum(a.sale)/b.total_area as plateaueffect,sum(flow)/b.total_area  as collectpower from store_data a left join  store b left join tenant c on b.tenant_id=c.id  on a.fid=b.fid where a.time like '${date}%' group by a.fid  order by sum(a.flow)/b.total_area desc limit 10")
    List<StoreRankVO> getPowerList(@Param("date") String date);

    //综合排行
    @Select("select c.brand as name,b.pic_url, a.fid,b.floor,sum(a.sale)/b.total_area as plateaueffect,sum(flow)/b.total_area  as collectpower from store_data a left join  store b left join tenant c on b.tenant_id=c.id  on a.fid=b.fid where a.time like '${date}%' group by a.fid  order by sum(a.sale)/b.total_area+sum(a.flow)/b.total_area desc limit 10")
    List<StoreRankVO> getAllList(@Param("date") String date);

    //地图页店铺人流量
    @Select("select a.fid,sum(flow) as amount,b.xpos ,b.ypos from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'  and b.floor=#{floor} group by b.fid")
    List<DataObjectSingle> mapGetFlow(@Param("date") String date, @Param("floor") String floor);

    //地图页店铺销售额
    @Select("select a.fid,sum(sale) as amount,b.xpos ,b.ypos from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'  and b.floor=#{floor} group by b.fid")
    List<DataObjectSingle> mapGetSale(@Param("date") String date, @Param("floor") String floor);

    //地图页店铺坪效
    @Select("select a.fid,sum(sale)/b.total_area as amount,b.xpos ,b.ypos from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'  and b.floor=#{floor} group by b.fid")
    List<DataObjectSingle> mapGetEffect(@Param("date") String date, @Param("floor") String floor);

    //地图页店铺集客力
    @Select("select a.fid,sum(flow)/b.total_area as amount,b.xpos ,b.ypos from store_data a left join store  b on a.fid=b.fid  where time like '${date}%'  and b.floor=#{floor} group by b.fid")
    List<DataObjectSingle> mapGetPower(@Param("date") String date, @Param("floor") String floor);

    @Select("select sum(${data}) from store_data where time like '${time}%' and fid=#{fid} ")
    Integer selectDayDateByFid(@Param("data") String data, @Param("fid") String fid, @Param("time") String time);

@Select("SELECT fid,sum(water) as water,sum(electric) as electric,sum(gas) as gas\n" +
        " FROM store_data\n" +
        " WHERE fid in (select fid\n" +
        " FROM store\n" +
        " WHERE floor=#{floor}) and time like '%${time}%' group by fid")
    List<StoreData> cunsumeList(@Param("floor") String floor, @Param("time") String time);
}