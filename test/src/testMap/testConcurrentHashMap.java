package testMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenqian2
 * @version V1.0.0
 * @Title: testConcurrentHashMap
 * @Package testMap
 * @Description: TODO
 * @date 2018年02月09日 18:07
 * @since jdk1.8
 */
public class testConcurrentHashMap {
    public static void main(String[] args) {
        int d=5;
        Map<Integer,String> mymap=new ConcurrentHashMap<Integer, String>(2);
        mymap.put(3,"hello");
        System.out.println(mymap.get(3));
        for(int i=0;i<15;i++){
            mymap.put(4*i,"hello");
        }

    }
}
