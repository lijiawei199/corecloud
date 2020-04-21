package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Equiplist;
import com.bananalab.corecloud.api.model.Myindex;
import com.bananalab.corecloud.api.model.Search;
import com.bananalab.corecloud.api.model.Todaymsg;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link HomeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T11:23:54.562+08:00")

public interface HomeApiDelegate {

    /**
     * @see HomeApi#myindex
     */
    ResponseEntity<Myindex> myindex();

    /**
     * @see HomeApi#remind
     */
    ResponseEntity<Equiplist> remind( Integer  type);

    /**
     * @see HomeApi#search
     */
    ResponseEntity<Search> search( String  name);

    /**
     * @see HomeApi#todaymsg
     */
    ResponseEntity<Todaymsg> todaymsg();

}
