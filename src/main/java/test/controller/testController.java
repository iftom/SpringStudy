package test.controller;

import test.factorydecoupling.BeanFactory;
import test.service.IAccountService;
import test.service.impl.AccountService;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/18
 * All Rights Reversed
 */
public class testController {

    public static void main(String[] args) throws Exception {
        IAccountService iAccountService = (IAccountService)BeanFactory.getBean("accountService");
        iAccountService.saveAccount();
    }
}
