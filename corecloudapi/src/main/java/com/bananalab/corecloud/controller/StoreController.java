package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.StoreApiDelegate;
import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class StoreController extends BaseDelegateImpl implements StoreApiDelegate {

    @Autowired
    StoreServiceImpl storeService;


    @Override
    public ResponseEntity<Capital> capital(Integer month) {
        return storeService.capital(month);
    }

    @Override
    public ResponseEntity<StoreCunsume> cunsume(String fid) {
        return storeService.cunsume(fid);
    }

    @Override
    public ResponseEntity<StoreList> leaseTime(Integer floor) {
        return storeService.leaseTime(floor);
    }

    @Override
    public ResponseEntity<Potcustlist> potcustlist(String fid) {
        return storeService.potcustlist(fid);
    }

    @Override
    public ResponseEntity<Ranklist> ranklist(String priority, String time) {
        return storeService.ranklist(priority, time);
    }

    @Override
    public ResponseEntity<StoreList> rent(Integer floor) {
        return storeService.rent(floor);
    }

    @Override
    public ResponseEntity<StoreList> storeCunsumeList(String floor) {
        return storeService.storeCunsumeList(floor);
    }

    @Override
    public ResponseEntity<Storedetails> storedetails(String fid) {
        return storeService.storedetails(fid);
    }

    @Override
    public ResponseEntity<StoreList> storeuser(Integer floor) {
        return storeService.storeuse(floor);
    }


    @Override
    public ResponseEntity<Translist> translist(String time) {

        return storeService.translist(time);
    }


}
