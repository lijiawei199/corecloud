package com.bananalab.corecloud.service;

import com.bananalab.corecloud.api.model.*;
import org.springframework.http.ResponseEntity;

public interface DataService {


    ResponseEntity<Flowtrend> flowtrend(Integer timerange, String data, String fid);

    ResponseEntity<Kpiview> kpiview(String thisTime, String lastTime, String week);

    ResponseEntity<Hotchart> hotchart(Integer type, Integer floor);


    ResponseEntity<Marketflowcompare> marketflowcompare(String startdate, String startTime);

    ResponseEntity<Storetflowcompare> storetflowcompare(String renge, String date);
}
