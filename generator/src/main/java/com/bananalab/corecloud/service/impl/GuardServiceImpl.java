package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.Guard;
import com.bananalab.corecloud.mybatis.mapper.GuardMapper;
import com.bananalab.corecloud.service.IGuardService;
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
public class GuardServiceImpl extends ServiceImpl<GuardMapper, Guard> implements IGuardService {

}
