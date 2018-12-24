package java_core_4.Annotation;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

public class TestAnnotation {

    @SayHello(source = "你是个大帅哥")
    public void sayHello(){
        AnnotationInstaller.processAnnotation(this);
    }

    @SayHello(source = "kcsd1")
    public void sayHello3(){
        AnnotationInstaller.processAnnotation(this);
    }


    @SayHello(source = "svdsvsdv")
    public void sayHello2(){
        AnnotationInstaller.processAnnotation(this);
    }

    public TestAnnotation(){
        System.out.println("构造器开始");

    }

    public static void main(String str[]){

        new TestAnnotation().sayHello();
    }
}
