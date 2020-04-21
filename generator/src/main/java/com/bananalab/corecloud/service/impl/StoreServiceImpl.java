package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.Store;
import com.bananalab.corecloud.mybatis.mapper.StoreMapper;
import com.bananalab.corecloud.service.IStoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李佳伟
 * @since 2020-04-16
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements IStoreService {

}
