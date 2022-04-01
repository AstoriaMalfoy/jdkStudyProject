import java.util.Map;
import java.util.HashMap;

/**
 * @author litao34
 * @ClassName DemoTest
 * @Description TODO
 * @CreateDate 2022/3/30-10:18 AM
 **/
public class DemoTest {
    public static void main(String[] args) {
        Map<String,String> testMap = new HashMap<>();
        for ( int  i = 0; i < 100 ; i ++){
            testMap.put( "ket" + i,"value" + i);
        }
    }
}
