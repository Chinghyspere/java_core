package java_core_4.socket;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTimeOut {
    public static void main(String args[]){
        try (Socket s =new Socket()
          ){
            s.connect(new InetSocketAddress("time-a.nist.gov", 13),6000);
            Scanner in = new Scanner(s.getInputStream(), "UTF-8");
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        }catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getCause());
        }
    }
}
