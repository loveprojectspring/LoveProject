package com.matthieu.api.Controller;

import com.matthieu.api.Service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class ApiController {

    @RequestMapping(value="/response", method = RequestMethod.GET
    )
    public Map getResponse() {

        ApiService apiService = new ApiService();
        return apiService.getRequest();

    }
}
