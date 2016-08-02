package com.example;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Created by localadmin on 7/29/16.
 */
@RestController
public class HelloWorldController {
   @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK") } )
   @RequestMapping(value = "/v1/hello", method = RequestMethod.GET)
    public String getGreeting() {
        return "hello world";
    }
}
