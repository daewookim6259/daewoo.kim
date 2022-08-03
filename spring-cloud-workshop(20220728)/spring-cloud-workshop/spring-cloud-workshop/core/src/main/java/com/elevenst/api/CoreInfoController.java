package com.elevenst.api;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8081")
@RestController
@RequestMapping("/coreInfo")
public class CoreInfoController {
    @GetMapping(path = "{service}")
    public String getCoreInfo(@PathVariable String service) {

        String resultValue = "";

        switch (service)
        {
            case "WAS":
                resultValue = "Alive";
                break;

            case "DB":
                resultValue = "Dead";
                break;

            case "ALL":
                resultValue = "Alive,Dead";
                break;

            default:
                resultValue = "Undefined service";
                break;

        }

        return service + " : " + resultValue;
    }
}
