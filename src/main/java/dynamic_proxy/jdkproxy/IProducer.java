package dynamic_proxy.jdkproxy;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/23
 * All Rights Reversed
 */
public interface IProducer {
    /**
     * 销售
     */
    void saleProduct(float money);

    /**
     * 售后
     */
    void afterService(float money);
}
