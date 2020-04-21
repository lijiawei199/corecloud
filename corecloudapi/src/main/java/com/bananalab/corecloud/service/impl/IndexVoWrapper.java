package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.IndexVO;
import com.bananalab.corecloud.api.model.IndexVOFlow;
import com.bananalab.corecloud.api.model.IndexVOSpace;
import com.bananalab.corecloud.mybatis.mapper.MarketDataMapper;
import com.bananalab.corecloud.mybatis.mapper.StoreMapper;
import com.bananalab.corecloud.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Calendar;

@Service
public class IndexVoWrapper {
    @Autowired
    MarketDataMapper marketDataMapper;
    @Autowired
    StoreMapper storeMapper;

    private void wrapperSale(IndexVO indexVO) {
        DecimalFormat df = new DecimalFormat("0.00%");
        //當月
        String time = SpringUtil.yyyyMM();
        Integer sale = marketDataMapper.getDataByTime("sale", time);
        indexVO.getSale().setSameMonth(sale);
        //上月
        Calendar calender = Calendar.getInstance();
        calender.add(Calendar.MONTH, -1);
        Integer lastSale = marketDataMapper.getDataByTime("sale", SpringUtil.yyyyMM(calender));
        indexVO.getSale().setLastMonth(lastSale);
        //上月比
        double compare = Double.valueOf(sale-lastSale) / Double.valueOf(sale);
        indexVO.getSale().setMonthCompare(df.format(compare));
        //去年
        calender.add(Calendar.MONTH, 1);
        calender.add(Calendar.MONTH, -6);
        Integer lastYear = marketDataMapper.getDataByTime("sale", SpringUtil.yyyyMM(calender));
        indexVO.getSale().setLastyear(lastYear);
        //年環比
        double yearCompare = Double.valueOf(sale-lastYear) / Double.valueOf(sale);
        indexVO.getSale().setYearCompare(df.format(yearCompare));
    }

    private void wrapperFlow(IndexVO indexVO) {
        DecimalFormat df = new DecimalFormat("0.00%");

        //當月
        String time = SpringUtil.yyyyMM();
        Integer flow = marketDataMapper.getDataByTime("flow", time);
        indexVO.getFlow().setSameMonth(flow);
        //上月
        Calendar calender = Calendar.getInstance();
        calender.add(Calendar.MONTH, -1);

        Integer lastSale = marketDataMapper.getDataByTime("flow", SpringUtil.yyyyMM(calender));
        indexVO.getFlow().setLastMonth(lastSale);
        //上月比
        double compare = Double.valueOf(flow-lastSale) / Double.valueOf(flow);
        indexVO.getFlow().setMonthCompare(df.format(compare));
        //去年
        calender.add(Calendar.MONTH, 1);
        calender.add(Calendar.MONTH, -6);
        Integer lastYear = marketDataMapper.getDataByTime("flow", SpringUtil.yyyyMM(calender));
        indexVO.getFlow().setLastyear(lastYear);
        //年環比
        double yearCompare = Double.valueOf(flow-lastYear) / Double.valueOf(flow);
        String r = df.format(yearCompare);
        indexVO.getFlow().setYearCompare(r);
    }

    private void wrapperArea(IndexVO indexVO) {
        indexVO.getSpace().setUseAmount(154);
        indexVO.getSpace().setUserArea(53456);
        indexVO.getSpace().setReaminArea(3234);
        indexVO.getSpace().setRemainAmount(22);
    }

    public IndexVO getWrappedIndexVo() {
        IndexVO indexVO = new IndexVO();
        indexVO.setFlow(new IndexVOFlow());
        indexVO.setSpace(new IndexVOSpace());
        indexVO.setSale(new IndexVOFlow());

        wrapperSale(indexVO);
        wrapperFlow(indexVO);
        wrapperArea(indexVO);
        return indexVO;

    }
}