package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Capital;
import com.bananalab.corecloud.api.model.Potcustlist;
import com.bananalab.corecloud.api.model.Ranklist;
import com.bananalab.corecloud.api.model.StoreCunsume;
import com.bananalab.corecloud.api.model.StoreList;
import com.bananalab.corecloud.api.model.Storedetails;
import com.bananalab.corecloud.api.model.Translist;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link StoreApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public interface StoreApiDelegate {

    /**
     * @see StoreApi#capital
     */
    ResponseEntity<Capital> capital( Integer  month);

    /**
     * @see StoreApi#cunsume
     */
    ResponseEntity<StoreCunsume> cunsume( String  fid);

    /**
     * @see StoreApi#leaseTime
     */
    ResponseEntity<StoreList> leaseTime( Integer  floor);

    /**
     * @see StoreApi#potcustlist
     */
    ResponseEntity<Potcustlist> potcustlist( String  fid);

    /**
     * @see StoreApi#ranklist
     */
    ResponseEntity<Ranklist> ranklist( String  priority,
         String  time);

    /**
     * @see StoreApi#rent
     */
    ResponseEntity<StoreList> rent( Integer  floor);

    /**
     * @see StoreApi#storeCunsumeList
     */
    ResponseEntity<StoreList> storeCunsumeList( String  floor);

    /**
     * @see StoreApi#storedetails
     */
    ResponseEntity<Storedetails> storedetails( String  fid);

    /**
     * @see StoreApi#storeuser
     */
    ResponseEntity<StoreList> storeuser( Integer  floor);

    /**
     * @see StoreApi#translist
     */
    ResponseEntity<Translist> translist( String  time);

}
