package com.youkeda.wacai.web.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lcy
 * @date 2019/1/22 17:28
 */
@RestController
public class AccountingController {
    @RequestMapping(path = "/accounting")
    public String accounting(@RequestParam("key1") int cash, @RequestParam("key2") int income, @RequestParam("key3") int rent,
                             @RequestParam("key4") int charges, @RequestParam("key5") int eat) {
        int result = cash + income - rent - charges - eat;
        return "本月余额为："+ result;
    }
}
