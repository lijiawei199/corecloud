package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.HomeApiDelegate;
import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.api.model.Myindex;
import com.bananalab.corecloud.api.model.Search;
import com.bananalab.corecloud.api.model.Todaymsg;
import com.bananalab.corecloud.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Component
public class HomeController extends BaseDelegateImpl implements HomeApiDelegate {
    @Autowired
    StoreServiceImpl storeService = new StoreServiceImpl();


    @Override
    public ResponseEntity<Myindex> myindex() {
        return storeService.index();
    }

    @Override
    public ResponseEntity<Equiplist> remind(@Max(value = 10,message = "最大值10") @Min(1) Integer type) {
        System.out.println("`111111");

        return null;
    }

    @Override
    public ResponseEntity<Search> search(String name) {
        return storeService.search(name);
    }


    @Override
    public ResponseEntity<Todaymsg> todaymsg() {
        return storeService.todaymsg();

    }
}
