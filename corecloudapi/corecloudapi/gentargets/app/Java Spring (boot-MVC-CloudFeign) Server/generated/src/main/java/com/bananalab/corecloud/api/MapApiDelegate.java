package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Cleanerlist;
import com.bananalab.corecloud.api.model.Elevatordetail;
import com.bananalab.corecloud.api.model.Equipdetail;
import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.api.model.Guardlist;
import com.bananalab.corecloud.api.model.Hotchart;
import com.bananalab.corecloud.api.model.Monitordetail;
import com.bananalab.corecloud.api.model.StoreList;
import com.bananalab.corecloud.api.model.StoreList1;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link MapApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public interface MapApiDelegate {

    /**
     * @see MapApi#cleanerlist
     */
    ResponseEntity<Cleanerlist> cleanerlist( String  floor);

    /**
     * @see MapApi#elevatordetail
     */
    ResponseEntity<Elevatordetail> elevatordetail( Integer  type);

    /**
     * @see MapApi#equipdetail
     */
    ResponseEntity<Equipdetail> equipdetail( String  fid);

    /**
     * @see MapApi#equiplist
     */
    ResponseEntity<Equiplist> equiplist( Integer  type,
         String  floor);

    /**
     * @see MapApi#guardlist
     */
    ResponseEntity<Guardlist> guardlist( String  floor);

    /**
     * @see MapApi#hotchart
     */
    ResponseEntity<Hotchart> hotchart( Integer  type,
         Integer  floor);

    /**
     * @see MapApi#monitordetail
     */
    ResponseEntity<Monitordetail> monitordetail( Integer  type);

    /**
     * @see MapApi#recognizeretail
     */
    ResponseEntity<Elevatordetail> recognizeretail( Integer  type);

    /**
     * @see MapApi#storelist
     */
    ResponseEntity<StoreList1> storelist( Integer  type,
         String  floor);

    /**
     * @see MapApi#totalData
     */
    ResponseEntity<StoreList> totalData( String  floor,
         String  type,
         String  time);

}
