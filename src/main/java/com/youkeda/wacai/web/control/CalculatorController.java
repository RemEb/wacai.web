package com.youkeda.wacai.web.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lcy
 * @date 2019/1/22 15:18
 */
@RestController
public class CalculatorController {

    @RequestMapping(path = "/add")
    public int add(@RequestParam("key1")int key1,@RequestParam("key2") int key2){

        return key1 + key2;
    }


}
