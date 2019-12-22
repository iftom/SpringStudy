package dynamic_proxy.cglib;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/23
 * All Rights Reversed
 */
public class Producer {


    public void saleProduct(float money) {
        System.out.println("销售产品，并拿到钱:"+money);
    }


    public void afterService(float money) {
        System.out.println("提供售后服务，并拿到钱:"+money);
    }
}
