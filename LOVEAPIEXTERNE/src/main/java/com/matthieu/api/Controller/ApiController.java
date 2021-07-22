package com.matthieu.api.Controller;

import com.matthieu.api.Service.ApiService;
import com.matthieu.api.dto.ApiDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class ApiController {

    private ApiDTO apiDTO;

    @RequestMapping(value="/response/{name1}/{name2}", method = RequestMethod.GET)
    public Map getResponse(@PathVariable String name1, @PathVariable String name2) {

        ApiService apiService = new ApiService();
        //apiDTO = new ApiDTO();
        return apiService.getRequestApiExterne(name1, name2);

    }
}
