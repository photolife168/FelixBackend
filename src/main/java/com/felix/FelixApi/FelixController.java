package com.felix.FelixApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by felixlin on 2016/12/10.
 */
@RestController
public class FelixController {


    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public List<Travel> sayHello() {
        List<Travel> travelList = new ArrayList<Travel>();

        Travel tokyo = new Travel();
        tokyo.setAreaName("Tokyo");
        tokyo.setAreaInfo("play to tykyo");
        Travel osaka = new Travel();
        osaka.setAreaName("Osaka");
        osaka.setAreaInfo("play to osaka");

        travelList.add(tokyo);
        travelList.add(osaka);

        return travelList;
    }
}
