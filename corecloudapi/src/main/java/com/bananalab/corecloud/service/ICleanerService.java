package com.bananalab.corecloud.service;

import com.bananalab.corecloud.api.model.Cleanerlist;
import com.bananalab.corecloud.mybatis.model.Cleaner;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-18
 */
public interface ICleanerService extends IService<Cleaner> {

    ResponseEntity<Cleanerlist> cleanerlist(String floor);
}
