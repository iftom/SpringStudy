package dynamic_proxy.cglib;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/23
 * All Rights Reversed
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 模拟一个消费者
 */
public class Client {


    public static void main(String[] args) {
        final Producer producer = new Producer();


        Producer cglibProducer = (Producer) Enhancer.create(producer.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                        Object returnValue = null;
                        Float money = (Float)args[0];
                        if("saleProduct".equals(method.getName())){
                            returnValue =  method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });

        cglibProducer.saleProduct(10000F);
    }
}
