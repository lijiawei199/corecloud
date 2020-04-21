package com.bananalab.corecloud.mybatis.mapper;

import com.bananalab.corecloud.mybatis.model.Cleaner;
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
public interface CleanerMapper extends BaseMapper<Cleaner> {

    @Select("select fid from store where region = #{region}")
    List<String> getRegionList(@Param("region") String region);
}
