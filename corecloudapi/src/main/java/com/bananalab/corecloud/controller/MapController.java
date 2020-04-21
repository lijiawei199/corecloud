package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.MapApiDelegate;
import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MapController extends BaseDelegateImpl implements MapApiDelegate {

    @Autowired
    CleanerServiceImpl cleanerService;
    @Autowired
    StoreServiceImpl storeService;
    @Autowired
    GuardServiceImpl guardService;
    @Autowired
    DataServiceImply dataService;
    @Autowired
    EquipServiceImpl equipService;

    @Override
    public ResponseEntity<com.bananalab.corecloud.api.model.Cleanerlist> cleanerlist(String floore) {

        return cleanerService.cleanerlist(floore);
    }

    @Override
    public ResponseEntity<Elevatordetail> elevatordetail(Integer type) {
        return null;
    }

    @Override
    public ResponseEntity<Equipdetail> equipdetail(String fid) {
        return equipService.equipdetail(fid);
    }


    @Override
    public ResponseEntity<Equiplist> equiplist(Integer type, String floor) {
        return equipService.equiplist(type, floor);
    }

    @Override
    public ResponseEntity<Guardlist> guardlist(String floor) {
        return guardService.guardlist(floor);
    }

    @Override
    public ResponseEntity<Hotchart> hotchart(Integer type, Integer floor) {
        return dataService.hotchart(type, floor);
    }

    @Override
    public ResponseEntity<Monitordetail> monitordetail(Integer type) {
        return null;
    }

    @Override
    public ResponseEntity<Elevatordetail> recognizeretail(Integer type) {
        return null;
    }

    @Override
    public ResponseEntity<StoreList1> storelist(Integer type, String floor) {
        return null;
    }


    @Override
    public ResponseEntity<StoreList> totalData(String floor, String type, String time) {
        switch (type) {
            //0 客流量 1 销售额 2 坪效 3 集客力
            case "0":
                return storeService.peopleflowList(floor, 0);
            case "1":
                return storeService.salesListList(floor);
            case "2":
                return storeService.plateEffeList(floor);
            case "3":
                return storeService.collectPowList(floor);
            case "4":
                return storeService.peopleflowList(floor,2);

        }

        return storeService.peopleflowList(floor,-1);


    }


}
