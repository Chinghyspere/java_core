package java_core_2;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.io.*;

public class FileStream {

    public BufferedWriter outPutStream(BufferedReader s,File f){
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            char c[] = new char[1000];
            s.read(c,0,1000);
            bw.write(c,0,1000);
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }
    public BufferedReader inPutStream() throws IOException {
      /*  int i=0;
        char[] c = new char[1000];
        while(-1 !=in.read(c,0,30)) {
            System.out.println(String.copyValueOf(c));
        InputStreamReader in = new InputStreamReader(System.in);*/
       return new BufferedReader(new InputStreamReader(System.in));

    }


    public static void main(String args[]) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileStream fs = (FileStream) Class.forName("java_core_2.FileStream").newInstance();
        fs.outPutStream(fs.inPutStream(),new File("E:\\a.txt"));
    }

}
