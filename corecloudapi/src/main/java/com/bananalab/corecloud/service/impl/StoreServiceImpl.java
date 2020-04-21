package com.bananalab.corecloud.service.impl;

import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.mybatis.mapper.MarketDataMapper;
import com.bananalab.corecloud.mybatis.mapper.StoreDataMapper;
import com.bananalab.corecloud.mybatis.mapper.StoreMapper;
import com.bananalab.corecloud.mybatis.mapper.TenantMapper;
import com.bananalab.corecloud.mybatis.model.*;
import com.bananalab.corecloud.service.IStoreService;
import com.bananalab.corecloud.util.SpringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-18
 */
@Service
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements IStoreService {
    private static int flow = 15984;
    private static int totalsale = 13;
    @Autowired
    TenantServiceImpl tenantService;
    @Autowired
    PotentialCustServiceImpl potentialCustService;
    @Autowired
    SubscriberServiceImpl subscriberService;
    @Autowired
    PicServiceImpl picService;
    @Autowired
    StoreMapper storeMapper;
    @Autowired
    StoreServiceImpl storeService;
    @Autowired
    MarketFormatServiceImpl marketFormatService;
    @Autowired
    TenantMapper tenantMapper;
    @Autowired
    StoreDataServiceImpl storeDataService;
    @Autowired
    StoreDataMapper storeDataMapper;
    @Autowired
    MarketDataMapper marketDataMapper;
    @Autowired
    IndexVoWrapper indexVoWrapper;

    @Override
    public ResponseEntity<Storedetails> storedetails(String fid) {
        QueryWrapper<Store> storeWrapper = new QueryWrapper<>();
        storeWrapper.eq("fid", fid);
        Store store = getOne(storeWrapper);
        StoreInfoVO storeInfoVO = new StoreInfoVO();
        Pic pic = picService.getById(store.getPicId());
        storeInfoVO.setPicName(pic.getName());
        storeInfoVO.setPicTel(pic.getTel());
        if (!"2".equals(store.getStatus())) {
            Tenant tenant = tenantService.getById(store.getTenantId());
            storeInfoVO.setTenantName(tenant.getName());
            storeInfoVO.setTenantTel(tenant.getTel());
            SpringUtil.copyPropertiesIgnoreNull(tenant, storeInfoVO);
        }
        SpringUtil.copyPropertiesIgnoreNull(store, storeInfoVO);
        Tenant tenant = tenantMapper.selectById(store.getTenantId());
        storeInfoVO.setLeaseTime(tenant.getLeaseStart() + "--" + tenant.getLeaseEnd());
        Storedetails storedetails = new Storedetails();
        storedetails.setCode(StatusCode.OK);
        storedetails.setData(storeInfoVO);

        return ResponseEntity.ok(storedetails);
    }

    @Override
    public ResponseEntity<Potcustlist> potcustlist(String fid) {
        Potcustlist potcustlist = new Potcustlist();
        List<PotCustVO> potCustVOList = new ArrayList<>();
        List<PotentialCust> potentialCustArray = new ArrayList<>();
        QueryWrapper<PotentialCust> wrapper = new QueryWrapper<>();
        wrapper.eq("fid", fid);
        potentialCustArray = potentialCustService.list(wrapper);

        for (PotentialCust potentialCust : potentialCustArray) {
            PotCustVO potCustVO = new PotCustVO();
            QueryWrapper<Store> storeQueryWrapper = new QueryWrapper<>();
            storeQueryWrapper.eq("fid", fid);
            Store store = getOne(storeQueryWrapper);
            Pic pic = picService.getById(store.getPicId());
            potCustVO.setPicname(pic.getName());

            BeanUtils.copyProperties(potentialCust, potCustVO);
            potCustVOList.add(potCustVO);
        }
        potcustlist.setCode(StatusCode.OK);
        potcustlist.setData(potCustVOList);
        return ResponseEntity.ok(potcustlist);
    }

//
//    @Override
//    public ResponseEntity<TotalData> sales(String floor) {
//        String string = getTimeString();
//        List<DataObjectSingle> dataObjectSingleList = storeDataMapper.mapGetSale(string, floor);
//        int total = 0;
//        for (DataObjectSingle dataObjectSingle : dataObjectSingleList) {
//            total = total + dataObjectSingle.getAmount();
//        }
//        DataObject dataObject = new DataObject();
//        dataObject.setTotal(total);
//        dataObject.setSingle(dataObjectSingleList);
//        TotalData totalData = new TotalData();
//        totalData.setCode(StatusCode.OK);
//        totalData.setData(dataObject);
//        return ResponseEntity.ok(totalData);
//    }
//
//    @Override
//    public ResponseEntity<TotalData> peopleflow(String floor) {
//        String string = getTimeString();
//        List<DataObjectSingle> dataObjectSingleList = storeDataMapper.mapGetFlow(string, floor);
//        int total = 0;
//        for (DataObjectSingle dataObjectSingle : dataObjectSingleList) {
//            total = total + dataObjectSingle.getAmount();
//        }
//
//       dataObjectSingleList.stream().filter(o->o.getAmount()<10000);
//        DataObject dataObject = new DataObject();
//        dataObject.setTotal(total);
//        dataObject.setSingle(dataObjectSingleList);
//        TotalData totalData = new TotalData();
//        totalData.setCode(StatusCode.OK);
//        totalData.setData(dataObject);
//        return ResponseEntity.ok(totalData);
//    }
//
//    @Override
//    public ResponseEntity<TotalData> plateEffe(String floor, String time) {
//        String string = getLikeTime(Integer.valueOf(time));
//        List<DataObjectSingle> dataObjectSingleList = storeDataMapper.mapGetEffect(string, floor);
//
//        DataObject dataObject = new DataObject();
//
//        dataObject.setSingle(dataObjectSingleList);
//        TotalData totalData = new TotalData();
//        totalData.setCode(StatusCode.OK);
//        totalData.setData(dataObject);
//        return ResponseEntity.ok(totalData);
//    }

    private String getTimeString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        return simpleDateFormat.format(calendar.getTime());
    }

//    @Override
//    public ResponseEntity<TotalData> collectPow(String floor, String time) {
//        String string = getLikeTime(Integer.valueOf(time));
//
//        List<DataObjectSingle> dataObjectSingleList = storeDataMapper.mapGetPower(string, floor);
//
//        DataObject dataObject = new DataObject();
//
//        dataObject.setSingle(dataObjectSingleList);
//        TotalData totalData = new TotalData();
//        totalData.setCode(StatusCode.OK);
//        totalData.setData(dataObject);
//        return ResponseEntity.ok(totalData);
//
//    }

    @Override
    public ResponseEntity<Translist> translist(String code) {
        return ResponseEntity.ok(getTranslist(code));
    }

    @Override
    public ResponseEntity<Ranklist> ranklist(String priority, String time) {
        List<StoreRankVO> storeRankVOS = new ArrayList<>();
        switch (priority) {
            case "0":
                storeRankVOS = storeDataMapper.getAllList(getTimeString());
                break;
            case "1":
                storeRankVOS = storeDataMapper.getEffectList(getTimeString());
                break;
            case "2":
                storeRankVOS = storeDataMapper.getPowerList(getTimeString());
                break;
        }
        int i = 100;
        for (StoreRankVO storeRankVO : storeRankVOS) {
            storeRankVO.setScore(i);
            i--;
        }

        Ranklist ranklist = new Ranklist();
        ranklist.setCode(StatusCode.OK);
        ranklist.setData(storeRankVOS);


        return ResponseEntity.ok(ranklist);
    }

    @Override
    public ResponseEntity<Myindex> index() {
        //包裝類
        IndexVO indexVO = indexVoWrapper.getWrappedIndexVo();
        Myindex index = new Myindex();
        index.setCode(StatusCode.OK);
        index.setData(indexVO);
        return ResponseEntity.ok(index);
    }


    @Override
    public ResponseEntity<Todaymsg> todaymsg() {

        // 0到期 1客流 2销售 3保安 4保洁
        String longMsg = String.format("近半小时您的商场又增加了455人,销售额提升了7820元");


        List<MsgVO> shortMsgs = new ArrayList<>();
        MsgVO saleMsg = new MsgVO();
        saleMsg.setType(2);
        saleMsg.setMsg("7-ELEVEn售出1576元");
        saleMsg.setTime("30秒前");
        saleMsg.setPos("位置:F1-A1");
        saleMsg.setFid("90712010124");
        shortMsgs.add(saleMsg);


        MsgVO time = new MsgVO();
        time.setType(0);
        time.setMsg("ZARA即将到期");
        time.setTime("1分钟前");
        time.setPos("位置:1楼A区");
        time.setFid("90712010183");
        shortMsgs.add(time);


        MsgVO time1 = new MsgVO();
        time1.setType(0);
        time1.setMsg("oppo专卖店即将到期");
        time1.setTime("5分钟前");
        time1.setPos("位置:1楼A区");
        time1.setFid("90712010159");
        shortMsgs.add(time1);


        MsgVO flowMsg = new MsgVO();
        flowMsg.setType(1);
        flowMsg.setMsg("商场一层进入877人,商场一层离开766人");
        flowMsg.setTime("2分钟前");
        shortMsgs.add(flowMsg);


        MsgVO guardMsg = new MsgVO();
        guardMsg.setType(3);
        guardMsg.setMsg("保安巡查人:张修闻");
        guardMsg.setTime("5分钟前");
        guardMsg.setPos("负责区域:F1");
        guardMsg.setFid("");
        guardMsg.setWorkTime("轮岗时间:18:00");
        guardMsg.setRegion("1043150101131|1043150101132|1043150101134|1043150101135|1043150101136|1043150101138");
        shortMsgs.add(guardMsg);


        MsgVO cleanMsg = new MsgVO();
        cleanMsg.setType(4);
        cleanMsg.setMsg("保洁值班人: 李慧兰");
        cleanMsg.setTime("5分钟前");
        cleanMsg.setPos("负责区域: A1-1");
        cleanMsg.setFid("");
        cleanMsg.setWorkTime("工作时间: 10:00");
        cleanMsg.setRegion("90712010124|90712010183|907120101123|90712010194|90712010184|90712010151|90712010165|90712010166|90712010115|90712010195|90712010159|90712010154|90712010150|");
        shortMsgs.add(cleanMsg);

        TodayMsgVO todayMsgVO = new TodayMsgVO();
        todayMsgVO.setTotalflow(marketDataMapper.dateFlow(getTimeString()));
        todayMsgVO.setTotalsales(marketDataMapper.dateSale(getTimeString()));
        todayMsgVO.setLongMSg(longMsg);
        todayMsgVO.setShortMsg(shortMsgs);
        Random random = new Random();
        flow = flow + random.nextInt(500);
        totalsale = totalsale + random.nextInt(500) + 500;
        Todaymsg todaymsg = new Todaymsg();
        todaymsg.setCode(StatusCode.OK);
        todaymsg.setData(todayMsgVO);
        return ResponseEntity.ok(todaymsg);


    }

    @Override
    public ResponseEntity<Brandlist> brandlist(String format, String floor, Integer pageNumber) {

        Page<BrandlistData> page = new Page<>(pageNumber, 15);
        IPage<BrandlistData> brandlistDataList = new Page<>();
        if (floor.equals("0") && format.equals("0")) {
            brandlistDataList = tenantMapper.selectAllPage(page);
        } else {
            if (floor.equals("0")) {
                brandlistDataList = tenantMapper.selectMyPageIgnoreFloor(page, format);
            } else {
                brandlistDataList = tenantMapper.selectMyPage(page, format, Integer.valueOf(floor));
            }
        }

        List<BrandlistData> brandlistData = brandlistDataList.getRecords();

        Brandlist brandlist = new Brandlist();
        brandlist.setCode(StatusCode.OK);
        brandlist.setData(brandlistData);
        return ResponseEntity.ok(brandlist);

    }

    @Override
    public ResponseEntity<Flowview> flowview() {
        FlowViewVO flowViewVO = new FlowViewVO();
        flowViewVO.setTotalflow(10172);
        flowViewVO.setYestflow(9757);
        flowViewVO.setPower(43);
        flowViewVO.setYestpower(41);
        flowViewVO.setTotalstore(327);
        flowViewVO.setUsedstore(232);
        flowViewVO.setTotalarea(8773);
        flowViewVO.setUsedarea(7221);
        Flowview flowview = new Flowview();
        flowview.setCode(StatusCode.OK);
        flowview.setData(flowViewVO);
        return ResponseEntity.ok(flowview);
    }

    @Override
    public List<FormatDistriVO> formatdistri() {
        List<FormatDistriVO> formatDistriVOS = new ArrayList<>();
        List<MarketFormat> marketFormats = marketFormatService.list();
        for (MarketFormat marketFormat : marketFormats) {
            FormatDistriVO formatdistri = new FormatDistriVO();
            int amount = storeMapper.getAmountByType(marketFormat.getTypeId());
            formatdistri.setBrands(marketFormat.getName());
            formatdistri.setAmount(amount);
            formatdistri.setPicUrl(marketFormat.getPicUrl());
            formatDistriVOS.add(formatdistri);
        }
        return formatDistriVOS;


    }

    @Override
    public ResponseEntity<Flowtop5> flowtop5() {
        List<StoreData> storeData = storeDataMapper.selectTOP5(getTimeString());
        List<Flowtop5Data> dataList = new ArrayList<>();
        for (StoreData storeDatum : storeData) {
            Flowtop5Data model = new Flowtop5Data();
            String fid = storeDatum.getFid();
            model.setName(storeMapper.getNameByFid(fid));
            model.setValue(storeDatum.getFlow());
            model.setPicUrl(storeMapper.getPicUrlByFid(fid));
            dataList.add(model);
        }
        Flowtop5 data = new Flowtop5();
        data.setCode(StatusCode.OK);
        data.setData(dataList);
        return ResponseEntity.ok(data);
    }

    @Override
    public ResponseEntity<Storetflowcompare> storetflowcompare(String renge, String date) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("region", renge);

        List<Store> stores = list(queryWrapper);
        List<StoretflowcompareData> dataList = new ArrayList<>();
        for (Store store : stores) {
            String fid = store.getFid();
            int value = storeDataMapper.getFlowByFid(getTimeString(), fid);
            StoretflowcompareData storetflowcompareData = new StoretflowcompareData();
            storetflowcompareData.setValue(value);
            storetflowcompareData.setName(storeMapper.getNameByFid(fid));
            dataList.add(storetflowcompareData);
        }
        Storetflowcompare storetflowcompare = new Storetflowcompare();
        storetflowcompare.code(StatusCode.OK);
        storetflowcompare.setData(dataList);
        return ResponseEntity.ok(storetflowcompare);
    }

    @Override
    public ResponseEntity<Search> search(String name) {
        SearchData searchData = new SearchData();
        name = name.trim();
        searchData.setFid(storeMapper.select(name));
        Search search = new Search();
        search.setCode(StatusCode.OK);
        search.setData(searchData);
        return ResponseEntity.ok(search);
    }

    @Override
    public ResponseEntity<StoreList> leaseTime(Integer floor) {
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectExpire(floor));
        stroeDateVo.setHigh(storeMapper.selectConcludeExpire(floor));
        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> rent(Integer floor) {
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectLowRent(floor));
        stroeDateVo.setMiddle(storeMapper.selectMiddleRent(floor));
        stroeDateVo.setHigh(storeMapper.selectHighRent(floor));
        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> storeuse(Integer floor) {
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectUsed(floor));
        stroeDateVo.setHigh(storeMapper.selectNotUsed(floor));
        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> peopleflowList(String floor, int i) {
        String date = getTimeString().substring(0, 7);
        if (i != 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, i);
            date = simpleDateFormat.format(calendar.getTime());
        }
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectLowDate(date, floor, "flow", 60));
        stroeDateVo.setMiddle(storeMapper.selectMiddleDate(date, floor, "flow", 60, 100));
        stroeDateVo.setHigh(storeMapper.selectHighDate(date, floor, "flow", 100));
        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> salesListList(String floor) {
        String date = getTimeString().substring(0, 7);
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setHigh(storeMapper.selectHighDate(date, floor, "sale", 8000));
        stroeDateVo.setLow(storeMapper.selectLowDate(date, floor, "sale", 6000));
        stroeDateVo.setMiddle(storeMapper.selectMiddleDate(date, floor, "sale", 4000, 6000));

        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> collectPowList(String floor) {
        String date = getTimeString().substring(0, 7);
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectLowDateAverage(date, floor, "flow", 50));
        stroeDateVo.setMiddle(storeMapper.selectMiddleDateAverage(date, floor, "flow", 50, 100));
        stroeDateVo.setHigh(storeMapper.selectHighDateAverage(date, floor, "flow", 100));

        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<StoreList> plateEffeList(String floor) {
        String date = getTimeString().substring(0, 7);
        StroeDateVo stroeDateVo = new StroeDateVo();
        stroeDateVo.setLow(storeMapper.selectLowDateAverage(date, floor, "sale", 30));
        stroeDateVo.setMiddle(storeMapper.selectMiddleDateAverage(date, floor, "sale", 30, 70));
        stroeDateVo.setHigh(storeMapper.selectHighDateAverage(date, floor, "sale", 70));

        return SpringUtil.respon(new StoreList(), stroeDateVo);


    }

    @Override
    public ResponseEntity<StoreList> storeValueList(String floor) {
        return null;
    }

    @Override
    public ResponseEntity<StoreList> storeTransList(String floor) {
        return null;
    }

    @Override
    public ResponseEntity<StoreCunsume> cunsume(String fid) {
        String getTime = SpringUtil.yyyyMM();
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.select("water,electric,gas");
        wrapper.eq("fid", fid);
        wrapper.like("time", getTime);

        List<StoreData> lists = storeDataMapper.selectList(wrapper);

        ConsumeVO cunsumeVo = new ConsumeVO();

        //设置水
        Integer waterSum = lists.stream().mapToInt(o -> o.getWater()).sum();
        ConsumeVOInner water = new ConsumeVOInner();
        water.setValue(waterSum);
        water.setState(waterSum > 100 ? 0 : 1);
        cunsumeVo.add(water);
        //设置电
        Integer electricSum = lists.stream().mapToInt(o -> o.getElectric()).sum();
        ConsumeVOInner electric = new ConsumeVOInner();
        electric.setValue(electricSum);
        electric.setState(electricSum > 100 ? 0 : 1);
        cunsumeVo.add(electric);

        //设置气
        Integer gasSum = lists.stream().mapToInt(o -> o.getGas()).sum();
        ConsumeVOInner gas = new ConsumeVOInner();
        gas.setValue(gasSum);
        gas.setState(gasSum > 100 ? 0 : 1);
        cunsumeVo.add(gas);
        return SpringUtil.respon(new StoreCunsume(), cunsumeVo);
    }

    @Override
    public ResponseEntity<StoreList> storeCunsumeList(String floor) {
        String time = SpringUtil.yyyyMM();
        StroeDateVo stroeDateVo = new StroeDateVo();

        List<StoreData> lists = storeDataMapper.cunsumeList(floor, time);
        List<String> low = new ArrayList<>();
        List<String> high = new ArrayList<>();
        for (StoreData storeData : lists) {
            if (storeData.getGas() > 470 || storeData.getElectric() > 1700 || storeData.getWater() > 280) {
                high.add(storeData.getFid());
                continue;
            }
            low.add(storeData.getFid());

        }
        stroeDateVo.setLow(low);
        stroeDateVo.setHigh(high);

        return SpringUtil.respon(new StoreList(), stroeDateVo);
    }

    @Override
    public ResponseEntity<Capital> capital(String month) {
        return null;
    }

    @Override
    public ResponseEntity<Capital> capital(Integer month) {
        CapitalVO capitalVO = new CapitalVO();
        Random random = new Random();
        if (month % 3 == 0) {
            capitalVO.setIncome(235);
            capitalVO.setPayed(87);
            //收益
            ArrayList<CapitalVODaily> daily = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                CapitalVODaily capitalVODaily = new CapitalVODaily();
                capitalVODaily.setValue(random.nextInt(12) + 10);
                daily.add(capitalVODaily);
            }
            capitalVO.setDaily(daily);
            //分类
            ArrayList<CapitalVODaily> classify = new ArrayList<>();
            CapitalVODaily capitalVODaily1 = new CapitalVODaily();
            capitalVODaily1.setValue(60);
            classify.add(capitalVODaily1);
            CapitalVODaily capitalVODaily2 = new CapitalVODaily();
            capitalVODaily2.setValue(30);
            classify.add(capitalVODaily2);
            CapitalVODaily capitalVODaily3 = new CapitalVODaily();
            capitalVODaily3.setValue(10);
            classify.add(capitalVODaily3);
            capitalVO.setClassify(classify);
        }
        if (month % 3 == 1) {
            capitalVO.setIncome(156);
            capitalVO.setPayed(87);
            //收益
            ArrayList<CapitalVODaily> daily = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                CapitalVODaily capitalVODaily = new CapitalVODaily();
                capitalVODaily.setValue(random.nextInt(7) + 10);
                daily.add(capitalVODaily);
            }
            capitalVO.setDaily(daily);
            //分类
            ArrayList<CapitalVODaily> classify = new ArrayList<>();
            CapitalVODaily capitalVODaily1 = new CapitalVODaily();
            capitalVODaily1.setValue(70);
            classify.add(capitalVODaily1);
            CapitalVODaily capitalVODaily2 = new CapitalVODaily();
            capitalVODaily2.setValue(15);
            classify.add(capitalVODaily2);
            CapitalVODaily capitalVODaily3 = new CapitalVODaily();
            capitalVODaily3.setValue(15);
            classify.add(capitalVODaily3);
            capitalVO.setClassify(classify);
        }
        if (month % 3 == 2) {
            capitalVO.setIncome(321);
            capitalVO.setPayed(65);
            //收益
            ArrayList<CapitalVODaily> daily = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                CapitalVODaily capitalVODaily = new CapitalVODaily();
                capitalVODaily.setValue(random.nextInt(10) + 22);
                daily.add(capitalVODaily);
            }
            capitalVO.setDaily(daily);
            //分类
            ArrayList<CapitalVODaily> classify = new ArrayList<>();
            CapitalVODaily capitalVODaily1 = new CapitalVODaily();
            capitalVODaily1.setValue(55);
            classify.add(capitalVODaily1);
            CapitalVODaily capitalVODaily2 = new CapitalVODaily();
            capitalVODaily2.setValue(35);
            classify.add(capitalVODaily2);
            CapitalVODaily capitalVODaily3 = new CapitalVODaily();
            capitalVODaily3.setValue(10);
            classify.add(capitalVODaily3);
            capitalVO.setClassify(classify);
        }
        return SpringUtil.respon(new Capital(),capitalVO);

    }

    //转化率排行
    private Translist getTranslist(String code) {
        String time = getLikeTime(Integer.valueOf(code));
        List<StoreTransVO> storeTransVOS = storeDataMapper.getTranslist(time);

        Translist translist = new Translist();
        translist.setCode(StatusCode.OK);
        translist.setData(storeTransVOS);

        return translist;
    }

    //商铺评级排行
    private Ranklist getRankListAll(Integer parameter, Integer range) {
        String time = getLikeTime(range);
        List<StoreRankVO> stores = new ArrayList<>();
        switch (parameter) {
            case 0:
                stores = storeDataMapper.getAllList(time);
                break;
            case 1:
                stores = storeDataMapper.getEffectList(time);
                break;
            case 2:
                stores = storeDataMapper.getPowerList(time);
                break;
        }
        Ranklist ranklist = new Ranklist();
        ranklist.setCode(StatusCode.OK);
        ranklist.setData(stores);
        return ranklist;
    }

    //获取时间参数LIKE
    private String getLikeTime(Integer code) {
        SimpleDateFormat format = new SimpleDateFormat();
        switch (code) {
            case 2:
                format = new SimpleDateFormat("yyyy");
                break;
            case 1:
                format = new SimpleDateFormat("yyyy-MM");
                break;
            case 0:
                format = new SimpleDateFormat("yyyy-MM-dd");
                break;

        }
        Calendar calendar = Calendar.getInstance();
        String time = format.format(calendar.getTime());
        return time;
    }


}

