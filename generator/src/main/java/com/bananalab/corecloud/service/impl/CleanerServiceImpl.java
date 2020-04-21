package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.Cleaner;
import com.bananalab.corecloud.mybatis.mapper.CleanerMapper;
import com.bananalab.corecloud.service.ICleanerService;
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
public class CleanerServiceImpl extends ServiceImpl<CleanerMapper, Cleaner> implements ICleanerService {

}
