package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.StoreData;
import com.bananalab.corecloud.mybatis.mapper.StoreDataMapper;
import com.bananalab.corecloud.service.IStoreDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-18
 */
@Service
public class StoreDataServiceImpl extends ServiceImpl<StoreDataMapper, StoreData> implements IStoreDataService {

}
