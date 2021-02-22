import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.runtime.options.Option;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import com.alibaba.fastjson.JSON;
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
public class Foo {
    public static void main(String[] args){
        Objects aa = null;
        if(!"".equals(aa)){
            System.out.printf("aaaaaaa");
        }
    }

    public static Integer double2Integer(Double val) {
        return double2Integer(val, null);
    }

    public static Integer double2Integer(Double val, Integer defaultVal) {
        return Optional.ofNullable(val).map(Double::intValue).orElse(defaultVal);
    }

    public static void jsonTest(){
        JSONObject object = new JSONObject();
        //string
        object.put("string","string");
        //int
        object.put("int",2);
        //boolean
        object.put("boolean",true);
        System.out.println(object.toString());
    }

    public void collect()
    {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
                map.put(0, "DM01-24_3"); //未知
                map.put(1, "DM01-24_4"); //无
                map.put(2, "DM01-24_3"); //高血压
                map.put(3, "DM01-24_3"); //糖尿病
                map.put(4, "DM01-24_3"); //冠心病
                map.put(5, "DM01-24_3"); //慢性阻塞性肺疾病
                map.put(6, "DM01-24_3"); //恶性肿瘤
                map.put(7, "DM01-24_3"); //脑卒中
                map.put(8, "DM01-24_2"); //严重精神障碍
                map.put(9, "DM01-24_3"); //结核病
                map.put(10, "DM01-24_3"); //肝炎
                map.put(11, "DM01-24_3"); //先天畸形
                map.put(12, "DM01-24_3"); //其他
    }

    /**
     * 计算年龄
     * @param birth yyyy-MM-dd
     * @return
     */
    public static int calcAge(String birth) throws ParseException {
        Date nowDate= new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate= simpleDateFormat.parse(birth);
        Calendar flightCal= Calendar.getInstance();
        flightCal.setTime(nowDate);
        Calendar birthCal= Calendar.getInstance();
        birthCal.setTime(birthDate);

        int y= flightCal.get(Calendar.YEAR)-birthCal.get(Calendar.YEAR);
        int m= flightCal.get(Calendar.MONTH)-birthCal.get(Calendar.MONTH);
        int d= flightCal.get(Calendar.DATE)-birthCal.get(Calendar.DATE);
        if(y<0){
            throw new RuntimeException("您老还没出生");
        }

        if(m<0){
            y--;
        }
        if(m>=0&&d<0){
            y--;
        }

        return y;
    }

    public void testStream(){
        List<String> symptomList = Arrays.asList("1,2,3,4,5,12".split(","));

        List<String> uniqueCharacters =
                symptomList.stream()
                        .map((w)->{
                            Integer wInt = Integer.parseInt(w);
                            if(wInt <= 9) {
                                wInt++;
                            }else {
                                wInt = 11;
                            }
                            return wInt+"";
                        })
                        .collect(Collectors.toList());
        System.out.print(uniqueCharacters);
    }

}
