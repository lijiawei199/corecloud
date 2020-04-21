package com.bananalab.corecloud.service;

import com.bananalab.corecloud.api.model.Guardlist;
import com.bananalab.corecloud.mybatis.model.Guard;
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
public interface IGuardService extends IService<Guard> {

    ResponseEntity<Guardlist> guardlist(String floor);
}
