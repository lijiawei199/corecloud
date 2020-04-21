package com.bananalab.corecloud.service;

import com.bananalab.corecloud.api.model.*;
import com.bananalab.corecloud.mybatis.model.Store;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 李佳伟
 * @since 2019-12-18
 */
public interface IStoreService extends IService<Store> {

    ResponseEntity<Storedetails> storedetails(String fid);

    ResponseEntity<Potcustlist> potcustlist(String fid);


//    ResponseEntity<TotalData> sales(String floor);
//
//    ResponseEntity<TotalData> peopleflow(String floor);
//
//    ResponseEntity<TotalData> plateEffe(String floor, String time);



//    ResponseEntity<TotalData> collectPow(String floor, String time);

    ResponseEntity<Translist> translist(String time);

    ResponseEntity<Ranklist> ranklist(String priority, String time);

    ResponseEntity<Myindex> index();

    ResponseEntity<Todaymsg> todaymsg();

    ResponseEntity<Brandlist> brandlist(String format, String floor, Integer page);

    ResponseEntity<Flowview> flowview();

    List<FormatDistriVO> formatdistri();

    ResponseEntity<Flowtop5> flowtop5();

    ResponseEntity<Storetflowcompare> storetflowcompare(String renge, String date);

    ResponseEntity<Search> search(String name);

    ResponseEntity<StoreList> leaseTime(Integer floor);

    ResponseEntity<StoreList> rent(Integer floor);

    ResponseEntity<StoreList> storeuse(Integer floor);



    ResponseEntity<StoreList> peopleflowList(String floor, int i);

    ResponseEntity<StoreList> salesListList(String floor);

    ResponseEntity<StoreList> collectPowList(String floor);

    ResponseEntity<StoreList> plateEffeList(String floor);


    ResponseEntity<StoreList> storeValueList(String floor);

    ResponseEntity<StoreList> storeTransList(String floor);

    ResponseEntity<StoreCunsume> cunsume(String fid);

    ResponseEntity<StoreList> storeCunsumeList(String floor);

    ResponseEntity<Capital> capital(String month);

    ResponseEntity<Capital> capital(Integer month);
}
