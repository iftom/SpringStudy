package test.dao.impl;

import test.dao.IAccountDao;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/18
 * All Rights Reversed
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存账户成功");
    }
}
