package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.mybatis.model.Pic;
import com.bananalab.corecloud.mybatis.mapper.PicMapper;
import com.bananalab.corecloud.service.IPicService;
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
public class PicServiceImpl extends ServiceImpl<PicMapper, Pic> implements IPicService {

}
