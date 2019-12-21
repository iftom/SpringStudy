package test.factorydecoupling;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/18
 * All Rights Reversed
 */
public class BeanFactory {

    private static Properties props;


    private static Map<String,Object> beanMap;

    static{
        try {
            props = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            beanMap = new HashMap<String,Object>();
            for(int i = 0;i<=1;i++){
                beanMap.put("accountService",Class.forName(props.getProperty("accountService")).newInstance());
                beanMap.put("accountDao",Class.forName(props.getProperty("accountDao")).newInstance());
            }
//            //取出配置文件中所有的Key
//            Enumeration keys = props.keys();
//            //遍历枚举
//            while (keys.hasMoreElements()){
//                //取出每个Key
//                String key = keys.nextElement().toString();
//                //根据key获取value
//                String beanPath = props.getProperty(key);
//                //反射创建对象
//                Object value = Class.forName(beanPath).newInstance();
//                //把key和value存入容器中
////                beanMap.put(key,value);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String beanName) throws Exception {
        return beanMap.get(beanName);
    }


}
