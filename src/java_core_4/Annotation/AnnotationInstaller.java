package java_core_4.Annotation;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import com.sun.org.apache.bcel.internal.generic.RET;

import java.lang.reflect.*;

public class AnnotationInstaller {
    public static void processAnnotation(Object obj) {
        try {
            Class<?> cl = obj.getClass();
            for (Method method : cl.getDeclaredMethods()) {
                SayHello s = method.getAnnotation(SayHello.class);
                if (s != null) {
                   /* Field f = cl.getDeclaredField(s.source());*/
                    method.setAccessible(true);
                    System.out.println(s.source());
                    /*saySomething(s.source(),obj);*/
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
