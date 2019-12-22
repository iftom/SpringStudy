package dynamic_proxy.jdkproxy;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/23
 * All Rights Reversed
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个消费者
 */
public class Client {


    public static void main(String[] args) {
        final Producer producer = new Producer();

        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(Producer.class.getClassLoader(),
                Producer.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = null;
                        Float money = (Float)args[0];
                        if("saleProduct".equals(method.getName())){
                            returnValue =  method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
        proxyProducer.saleProduct(10000f);
    }
}
