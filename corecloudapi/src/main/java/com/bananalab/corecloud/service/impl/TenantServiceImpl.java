package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.Tenant;
import com.bananalab.corecloud.mybatis.mapper.TenantMapper;
import com.bananalab.corecloud.service.ITenantService;
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
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {

}
