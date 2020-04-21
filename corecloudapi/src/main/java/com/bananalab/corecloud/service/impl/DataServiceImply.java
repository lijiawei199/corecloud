package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.mybatis.mapper.MarketDataMapper;
import com.bananalab.corecloud.mybatis.mapper.StoreDataMapper;
import com.bananalab.corecloud.mybatis.model.Store;
import com.bananalab.corecloud.service.DataService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

@Service
public class DataServiceImply implements DataService {
    @Autowired
    StoreDataMapper storeDataMapper;
    @Autowired
    MarketDataMapper marketDataMapper;
    @Autowired
    StoreServiceImpl storeService;

    @Override
    public ResponseEntity<Flowtrend> flowtrend(Integer timerange, String data, String fid) {
        List<FlowTrendVO> list = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = null;
        switch (timerange) {
            case 0:
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                list = getTimeValue(1, 7, 10, data, fid, simpleDateFormat);
                break;
            case 1:
                simpleDateFormat = new SimpleDateFormat("yyyy-MM");
                list = getTimeValue(7, 4, 10, data, fid, simpleDateFormat);
                break;
            case 2:
                simpleDateFormat = new SimpleDateFormat("yyyy");
                list = getTimeValue(30, 12, 10, data, fid, simpleDateFormat);
                break;
        }
        Flowtrend flowtrend = new Flowtrend();
        flowtrend.setCode(StatusCode.OK);
        flowtrend.setData(list);
        return ResponseEntity.ok(flowtrend);
    }


    @Override
    public ResponseEntity<Kpiview> kpiview(String thisTime, String lastTime , String week) {
        List<KpiViewVO> kpiViewVOList = new ArrayList<>();
        KpiViewVO flow = new KpiViewVO();

        flow.setName("客流量(人次)");
        Integer thisFlow = storeDataMapper.dateFlow(thisTime);
        if (week.equals("1")){
            thisFlow=thisFlow*8;
        }
        flow.setThis(thisFlow.toString());
        Integer lastFlow = storeDataMapper.dateFlow(lastTime);
        if (week.equals("1")){
            lastFlow=lastFlow*6;
        }
        flow.setLast(lastFlow.toString());

        double than = ((double) (thisFlow - lastFlow) / (double) (thisFlow) * 100);
        flow.setThanlast((int) than);
        kpiViewVOList.add(flow);
        KpiViewVO power = new KpiViewVO();
        power.setName("集客力(人/m²)");
        Integer thisPower = thisFlow / 8796;
        power.setThis(thisPower.toString());
        Integer lastPower = lastFlow / 8796;
        power.setLast(lastPower.toString());

        double powerthan = ((double) (thisPower - lastPower) / (double) (thisPower) * 100);
        power.setThanlast((int) powerthan);
        kpiViewVOList.add(power);
        KpiViewVO sale = new KpiViewVO();
        sale.setName("销售额(元)");
        Integer thisSale = storeDataMapper.dateSale(thisTime);
        if (week.equals("1")){
            thisSale=thisSale*8;
        }
        sale.setThis(thisSale.toString());
        Integer lastSale = storeDataMapper.dateSale(lastTime);
        if (week.equals("1")){
            lastSale=lastSale*7;
        }
        sale.setLast(lastSale.toString());

        double saleThan = ((double) (thisSale - lastSale) / (double) (thisSale) * 100);
        sale.setThanlast((int) saleThan);
        kpiViewVOList.add(sale);

        KpiViewVO efiict = new KpiViewVO();
        efiict.setName("坪效(元/m²)");
        Integer thisEffect = thisSale / 8796;
        efiict.setThis(thisEffect.toString());
        Integer lastEffect = lastSale / 8796;
        efiict.setLast(lastEffect.toString());
        double efiictThan = ((double) (thisEffect - lastEffect) / (double) (thisEffect) * 100);
        efiict.setThanlast((int) efiictThan);
        kpiViewVOList.add(efiict);
        Kpiview kpiview = new Kpiview();
        kpiview.setCode(StatusCode.OK);
        kpiview.setData(kpiViewVOList);
        return ResponseEntity.ok(kpiview);
    }

    @Override
    public ResponseEntity<Hotchart> hotchart(Integer type, Integer floor) {
        Random random = new Random();
        List<HotchartData> hotcharts = new ArrayList<>();
        if (type == 0) {
            for (int x = 13370030; x < 13370208; x = x + 10) {
                for (int y = 3544472; y < 3544588; y = y + 10) {
                    HotchartData hotchartData = new HotchartData();
                    hotchartData.setX(x);
                    hotchartData.setY(y);
                    hotchartData.setValue(random.nextInt(100));
                    hotcharts.add(hotchartData);
                }
            }
            Hotchart hotchart = new Hotchart();
        }
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("floor", floor);
        List<Store> stores = storeService.list(wrapper);
        for (Store store : stores) {
            HotchartData hotchartData = new HotchartData();
            hotchartData.setX(Integer.valueOf(store.getXpos().substring(0, 8)));
            hotchartData.setY(Integer.valueOf(store.getYpos().substring(0, 7)));
            hotchartData.setValue(random.nextInt(100));
            hotcharts.add(hotchartData);
        }
        Hotchart hotchart = new Hotchart();
        hotchart.setCode(StatusCode.OK);
        hotchart.setData(hotcharts);
        return ResponseEntity.ok(hotchart);
    }

    @Override
    public ResponseEntity<Marketflowcompare> marketflowcompare(String startDate, String startTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar time = Calendar.getInstance();
        try {
            time.setTime(dateFormat.parse(startDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<List<Integer>> data = new ArrayList<>();
        for (int i = 0; i < 7; i++) {

            Integer hour = Integer.valueOf(startTime.substring(0, 2));
            for (int j = 0; j < 6; j++) {
                if (hour < 10) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    Integer value = marketDataMapper.dateFlow(dateFormat.format(time.getTime()) + " 0" + hour);
                    System.out.println(value);
                    integers.add(j);
                    integers.add(i);
                    integers.add(value);
                    data.add(integers);


                } else {
                    ArrayList<Integer> integers = new ArrayList<>();
                    Integer value = marketDataMapper.dateFlow(dateFormat.format(time.getTime()) + " " + hour);
                    integers.add(j);
                    integers.add(i);
                    integers.add(value);
                    data.add(integers);

                }
                hour++;

            }

            System.out.println(data.size());
            time.add(Calendar.DAY_OF_YEAR, 1);
        }
        Marketflowcompare marketflowcompare = new Marketflowcompare();
        marketflowcompare.code(StatusCode.OK);
        marketflowcompare.setData(data);
        return ResponseEntity.ok(marketflowcompare);
    }

    @Override
    public ResponseEntity<Storetflowcompare> storetflowcompare(String renge, String date) {

        return null;
    }

    //timerange时间间隔，time次数
    List<FlowTrendVO> getTimeValue(Integer timerange, Integer time, int range, String data, String fid, SimpleDateFormat simpleDateFormat) {
        SimpleDateFormat mmdd = new SimpleDateFormat("MM-dd");
        if (timerange == 30) {
            mmdd = new SimpleDateFormat("yyyy-MM");
        }
        List<FlowTrendVO> flowTrendVOList = new ArrayList<>();
        Random random = new Random();
        int start = -30 + random.nextInt(5);
        Calendar calendar = Calendar.getInstance();
        for (Integer i = 0; i < time; i++) {

            FlowTrendVO flowTrendVO = new FlowTrendVO();
            String times = mmdd.format(calendar.getTime());
            flowTrendVO.setTime(times);
            flowTrendVO.setValue(storeDataMapper.selectDayDateByFid(data, fid, simpleDateFormat.format(calendar.getTime())));
            start = start + random.nextInt(50) + range;
            flowTrendVOList.add(flowTrendVO);
            calendar.add(Calendar.DATE, -timerange);
        }
        return flowTrendVOList;
    }
}
