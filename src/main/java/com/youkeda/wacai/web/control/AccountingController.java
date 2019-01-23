package com.youkeda.wacai.web.control;

import com.youkeda.wacai.web.model.Accounting;
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
    public Accounting accounting(Accounting accounting) {
        int result = accounting.getCash() + accounting.getIncome() - accounting.getCharges()
                - accounting.getEat() - accounting.getKtv() - accounting.getRent() - accounting.getTreat();
        accounting.setBalance(result);
        return accounting;
    }
}
