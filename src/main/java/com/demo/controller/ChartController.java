package com.demo.controller;

import com.demo.RestResponse;
import com.demo.service.ChartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhangz1
 * @since 2022/5/10 18:22
 */
@CrossOrigin
@RestController
public class ChartController {
    @Resource
    private ChartService chartService;

    @ResponseBody
    @RequestMapping(value = "/dayCasesDeaths", method = RequestMethod.POST)
    public RestResponse dayCasesDeaths() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.dayCasesDeaths());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/dayAddCases", method = RequestMethod.POST)
    public RestResponse dayAddCases() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.dayAddCases());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/dayAddDeaths", method = RequestMethod.POST)
    public RestResponse dayAddDeaths() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.dayAddDeaths());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/stateCasesDeaths", method = RequestMethod.POST)
    public RestResponse stateCasesDeaths() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.stateCasesDeaths());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/top10Cases", method = RequestMethod.POST)
    public RestResponse top10Cases() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.top10Cases());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/top10Deaths", method = RequestMethod.POST)
    public RestResponse top10Deaths() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.top10Deaths());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/top10LeastCases", method = RequestMethod.POST)
    public RestResponse top10LeastCases() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.top10LeastCases());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/top10LeastDeaths", method = RequestMethod.POST)
    public RestResponse top10LeastDeaths() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.top10LeastDeaths());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/deathRate", method = RequestMethod.POST)
    public RestResponse deathRate() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.deathRate());
        return restResponse;
    }

    @ResponseBody
    @RequestMapping(value = "/top10DeathRate", method = RequestMethod.POST)
    public RestResponse top10DeathRate() {
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.top10DeathRate());
        return restResponse;
    }

    @RequestMapping(value = "/countyCasesDeaths", method = RequestMethod.POST)
    public RestResponse countyCasesDeaths(@RequestBody String state) {
        String plus = "+";
        String equals = "=";
        if (state.contains(plus)) {
            state = state.replace("+", " ");
        }
        if (state.contains(equals)) {
            state = state.replace("=", "");
        }
        RestResponse restResponse = new RestResponse();
        System.out.println("前端传来了" + state);
        restResponse.setStatus(200);
        restResponse.setMessage("success");
        restResponse.setData(chartService.countyCasesDeaths(state));
        return restResponse;
    }

}