package com.bananalab.corecloud.api;

import com.bananalab.corecloud.api.model.Capital;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link MarketApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-21T10:26:04.927+08:00")

public interface MarketApiDelegate {

    /**
     * @see MarketApi#capital
     */
    ResponseEntity<Capital> capital();

}
