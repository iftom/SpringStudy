package test.service.impl;

import test.dao.IAccountDao;
import test.dao.impl.AccountDaoImpl;
import test.factorydecoupling.BeanFactory;
import test.service.IAccountService;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/18
 * All Rights Reversed
 */
public class AccountService implements IAccountService {

private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

public AccountService() throws Exception {
        }


@Override
public void saveAccount() {
        accountDao.saveAccount();
        }
        }
