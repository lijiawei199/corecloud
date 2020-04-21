package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.GuardVO;
import com.bananalab.corecloud.api.model.Guardlist;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.mybatis.mapper.GuardMapper;
import com.bananalab.corecloud.mybatis.model.Guard;
import com.bananalab.corecloud.service.IGuardService;
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
public class GuardServiceImpl extends ServiceImpl<GuardMapper, Guard> implements IGuardService {

    @Override
    public ResponseEntity<Guardlist> guardlist(String floor) {
        List<GuardVO> guardVOS = new ArrayList<>();
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("floor",floor);
           List<Guard> guards = list(wrapper);
           for (Guard guard : guards) {
               GuardVO guardVO = new GuardVO();
               SpringUtil.copyPropertiesIgnoreNull(guard, guardVO);
               guardVOS.add(guardVO);
           }

        Guardlist guardlist = new Guardlist();
        guardlist.setCode(StatusCode.OK);
        guardlist.setData(guardVOS);
        return ResponseEntity.ok(guardlist);
    }
}
