package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.CleanerVO;
import com.bananalab.corecloud.api.model.Cleanerlist;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.mybatis.mapper.CleanerMapper;
import com.bananalab.corecloud.mybatis.model.Cleaner;
import com.bananalab.corecloud.service.ICleanerService;
import com.bananalab.corecloud.util.SpringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CleanerServiceImpl extends ServiceImpl<CleanerMapper, Cleaner> implements ICleanerService {
    public  CleanerServiceImpl(){
        System.out.println(1);
        System.out.println(2);
    }
    @Autowired
    CleanerMapper cleanerMapper;

    @Override
    public ResponseEntity<Cleanerlist> cleanerlist(String floor) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("floor", floor);
        List<Cleaner> cleanerList = list(queryWrapper);
        List<CleanerVO> cleanerVOS = new ArrayList<>();
        for (Cleaner cleaner : cleanerList) {
            CleanerVO cleanerVO = new CleanerVO();
            SpringUtil.copyPropertiesIgnoreNull(cleaner, cleanerVO);
            List<String> strings = cleanerMapper.getRegionList(cleaner.getRegion());
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : strings) {
                stringBuilder.append(string).append("|");
            }
            cleanerVO.setRegionList(new String(stringBuilder));
            cleanerVOS.add(cleanerVO);
        }
        Cleanerlist returnList = new Cleanerlist();
        returnList.setCode(StatusCode.OK);
        returnList.setData(cleanerVOS);


        return ResponseEntity.ok(returnList);
    }
}
