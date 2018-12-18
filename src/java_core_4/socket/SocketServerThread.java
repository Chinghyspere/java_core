package java_core_4.socket;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerThread {
    public static void main(String args[]) {
        try (ServerSocket s = new ServerSocket(8189)) {
            int i = 1;
            while (true) {
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                Runnable r = () -> {
                    try (OutputStream outputStream = incoming.getOutputStream();
                         InputStream inputStream = incoming.getInputStream()) {
                        Scanner in = new Scanner(inputStream, "UTF-8");
                        PrintWriter out = new PrintWriter(
                                new OutputStreamWriter(outputStream, "UTF-8"), true
                        );
                        out.println("Hello! Enter BYE to exit");

                        boolean done = false;
                        while(!done && in.hasNextLine()){
                            String line = in.nextLine();
                            out.println("[ECHO]----------------------->"+line);
                            if(line.equals("BYE")){
                                done=true;
                                in.close();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };
                Thread t = new Thread(r);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
