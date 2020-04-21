package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.EquipVO;
import com.bananalab.corecloud.api.model.Equipdetail;
import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.mybatis.mapper.EquipMapper;
import com.bananalab.corecloud.mybatis.model.Equip;
import com.bananalab.corecloud.service.IEquipService;
import com.bananalab.corecloud.util.SpringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-18
 */
@Service
public class EquipServiceImpl extends ServiceImpl<EquipMapper, Equip> implements IEquipService {

    @Override
    public ResponseEntity<Equiplist> equiplist(Integer type, String floor) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("type_id", type);
        queryWrapper.eq("floor", floor);
        List<Equip> equips = list(queryWrapper);
        List<String> list = new ArrayList<>();
        for (Equip equip : equips) {
            list.add(equip.getFid());
        }
        Equiplist equiplist = new Equiplist();
        equiplist.setCode(StatusCode.OK);
        equiplist.setData(list);
        return ResponseEntity.ok(equiplist);


    }

    @Override
    public ResponseEntity<Equipdetail> equipdetail(String fid) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("fid", fid);
        Equip equip = getOne(wrapper);
        EquipVO equipVO = new EquipVO();
        SpringUtil.copyPropertiesIgnoreNull(equip, equipVO);
//        equipVO.setMtcTime(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(equip.getMtcTime()));
//        equipVO.setPlotTime(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(equip.getPlotTime()));
        Equipdetail equipdetail = new Equipdetail();
        equipdetail.setCode(StatusCode.OK);
        equipdetail.setData(equipVO);
        return ResponseEntity.ok(equipdetail);
    }
}
