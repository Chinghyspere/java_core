package java_core_1;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_1 {

    public static void main(String args[]) throws IOException {
        String contexts = new String(Files.readAllBytes(Paths.get("E:\\Java高并发.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contexts.split("\\PL+"));


       /* for(String w:words){
            if(w.length()>12)count++;
            System.out.println(w);
        }*/

        /*words.forEach(s->{
            if(s.length()>12)count++;
        });*/

        long count =words.stream().filter(w->w.length()>12).count();

        System.out.println(count);
        System.out.println(Stream.generate(()->"hello").filter(s->s.equals("h")).count());
    }
}
