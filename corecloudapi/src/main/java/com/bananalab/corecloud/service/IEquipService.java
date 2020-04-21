package com.bananalab.corecloud.service;

import com.bananalab.corecloud.api.model.Equipdetail;
import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.mybatis.model.Equip;
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
public interface IEquipService extends IService<Equip> {

    ResponseEntity<Equiplist> equiplist(Integer type, String floor);


    ResponseEntity<Equipdetail> equipdetail(String fid);
}
