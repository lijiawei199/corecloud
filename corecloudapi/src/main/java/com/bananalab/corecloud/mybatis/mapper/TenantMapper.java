package com.bananalab.corecloud.mybatis.mapper;

import com.bananalab.corecloud.api.model.BrandlistData;
import com.bananalab.corecloud.mybatis.model.Tenant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-19
 */
public interface TenantMapper extends BaseMapper<Tenant> {
    @Select("select b.brand,a.pic_url from store as a left  join tenant as b on  a.tenant_id=b.id where a.type_id=#{format} and a.floor=#{floor} ")
    IPage<BrandlistData> selectMyPage(IPage<BrandlistData> page, @Param("format") String format, @Param("floor") Integer floor);

    @Select("select b.brand,a.pic_url from store as a left  join tenant as b on  a.tenant_id=b.id  ")
    IPage<BrandlistData> selectAllPage(Page<BrandlistData> page);

    @Select("select b.brand,a.pic_url from store as a left  join tenant as b on  a.tenant_id=b.id where a.type_id=#{format}  ")
    IPage<BrandlistData> selectMyPageIgnoreFloor(Page<BrandlistData> page, String format);
}
