package com.bananalab.corecloud.controller;

import com.bananalab.corecloud.api.DataApiDelegate;
import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.ext.model.StatusCode;
import com.bananalab.corecloud.service.impl.DataServiceImply;
import com.bananalab.corecloud.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataController extends BaseDelegateImpl implements DataApiDelegate {
    @Autowired
    StoreServiceImpl storeService;
    @Autowired
    DataServiceImply dataService;

    @Override
    public ResponseEntity<Brandlist> brandlist(String format, String floor, Integer page) {
        return storeService.brandlist(format, floor, page);
    }

    @Override
    public ResponseEntity<Flowtop5> flowtop5() {
        return storeService.flowtop5();
    }

    @Override
    public ResponseEntity<Flowtrend> flowtrend(Integer timerange, String data, String fid) {
        return  dataService.flowtrend(timerange,data,fid);
    }


    @Override
    public ResponseEntity<Flowview> flowview() {

        return storeService.flowview();
    }

    @Override
    public ResponseEntity<Formatdistri> formatdistri() {
        List<FormatDistriVO> indexVOFormatdistris = storeService.formatdistri();
        Formatdistri formatdistri = new Formatdistri();
        formatdistri.setCode(StatusCode.OK);
        formatdistri.setData(indexVOFormatdistris);
        return ResponseEntity.ok(formatdistri);
    }

    @Override
    public ResponseEntity<Formatratio> formatratio() {
        return null;
    }

    @Override
    public ResponseEntity<Kpitrend> kpitrend() {
        return null;
    }

    @Override
    public ResponseEntity<Kpiview> kpiview(String thisTime, String lastTime,String week) {
        return dataService.kpiview(thisTime, lastTime,week);
    }

    @Override
    public ResponseEntity<Marketflowcompare> marketflowcompare(String startdate, String startTime) {
        return dataService.marketflowcompare(startdate, startTime);
    }


    @Override
    public ResponseEntity<Equiplist> nownotify() {
        return null;
    }


    @Override
    public ResponseEntity<Storetflowcompare> storetflowcompare(String floor, String renge, String date) {

        return storeService.storetflowcompare(renge, date);
    }
}
