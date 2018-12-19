package java_core_1;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_test1 {

    public static void main(String args[]){
        List<String> list = Stream.of("sdfsfsdfsdfsfd,sdfsd,fs,df,sdfd,s,df".split(",")).collect(Collectors.toList());
        list.forEach(System.out::println);
        String ss = "sdkflsnvklsnvdlksavnklsadvnslavkdvkldsanvsd,svc,sv,s,dv,.asd.ab.sa.b,sa.b,s.a,bs,ab,s.b,sa.bs,ad.b,s.db,sdbkaewqg,rhg,er.b,d.v,df.bv,df.bv,db.enr,.,n.e";
        ss += ss;
        ss += ss;


        //获取前30个字符
        Stream<String> listss =Stream.of(ss.split("")).limit(30);
        listss.forEach(System.out::print);

        String sb = "12,421,23,41,2312,41,1,2,1,312,33,41,41,2,4,2154,23,5,235,23,13,24,23,42,42,34";
        Stream<String> st = Arrays.stream(sb.split(",")).sorted((o1,o2)->{
            int i = Integer.parseInt(o1)-Integer.parseInt(o2);
            return i;
        });
        st.forEach(System.out::println);
         Optional<String> op =Stream.of("asda","fsdf","sdfsdf").max((o1, o2) -> {
            return o1.length()-o2.length();
        });
        System.out.println(op.get());
    }
}
