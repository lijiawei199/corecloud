package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.mapper.MarketDataMapper;
import com.bananalab.corecloud.mybatis.model.MarketData;
import com.bananalab.corecloud.service.IMarketDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-24
 */
@Service
public class MarketDataServiceImpl extends ServiceImpl<MarketDataMapper, MarketData> implements IMarketDataService {

}
