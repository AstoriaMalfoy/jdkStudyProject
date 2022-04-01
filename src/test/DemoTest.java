package test;

import java.util.Map;
import java.util.HashMap;

/**
 * @author litao34
 * @ClassName test.DemoTest
 * @Description TODO
 * @CreateDate 2022/3/30-10:18 AM
 **/
public class DemoTest {
    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
//        Map<String,String> testMap = new HashMap<>();
//        for ( int  i = 0; i < 100 ; i ++){
//            testMap.put( "ket" + i,"value" + i);
//        }
//        System.out.println(testMap);
        for (int i=10000;i<10000000;++i){
            System.out.println(i + "   " + tableSizeFor(i));
        }
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
