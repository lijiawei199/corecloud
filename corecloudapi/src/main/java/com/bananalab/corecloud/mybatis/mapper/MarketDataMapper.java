package com.bananalab.corecloud.mybatis.mapper;

import com.bananalab.corecloud.mybatis.model.MarketData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-24
 */
public interface MarketDataMapper extends BaseMapper<MarketData> {
    //当天总客流
    @Select("select sum(flow) from market_data where time like '${time}%'")
    Integer dateFlow(@Param("time") String time);

    //当天总销售额
    @Select("select sum(sale) from market_data where time like '${time}%'")
    Integer dateSale(@Param("time") String time);
    @Select("select sum(${data}) from market_data where time like '${time}%' ")
    Integer getDataByTime(@Param("data") String data, String time);
}
