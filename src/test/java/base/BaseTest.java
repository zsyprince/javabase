package base;
import static org.junit.Assert.*;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * <p>
 * manager层接口及其实现应当准守符合微医开发规约，当前已集成参数校验规则，详情请见
 * <a href="https://gi.guahao.cn/docbook/service/validation.html">
 * </p>
 *
 * @author zuosy
 * @version 1.0
 * @since 2020-09-22 14:00
 */
public class BaseTest {
    @Test
    public void test(){
        Map<String, String> map = new HashMap<>();
        Long longValue=1L;
        double doubleValue=longValue.doubleValue()/100;
        String bb ="";
    }
}
