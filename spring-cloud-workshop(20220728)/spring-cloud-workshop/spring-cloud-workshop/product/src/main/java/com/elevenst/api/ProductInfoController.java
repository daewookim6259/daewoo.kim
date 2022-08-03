package com.elevenst.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:8086")
@RestController
@RequestMapping("/productInfo")
public class ProductInfoController {
    @GetMapping(path = "{productId}")
    public String getProduct(@PathVariable String productId) {

        String prodesc = "";

        switch (productId)
        {
            case "112":
                prodesc = "요소수";
                break;

            case "113":
                prodesc = "엔진오일";
                break;

            default:
                prodesc = "등록되지 않은 상품";
                break;
        }

        return "[product id = " + productId + " : " + prodesc +"]";
    }
}
