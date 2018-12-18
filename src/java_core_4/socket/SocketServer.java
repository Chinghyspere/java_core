package java_core_4.socket;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String args[]) {
        try {

            ServerSocket server = new ServerSocket(8189);
            Socket s = server.accept();
            InputStream inputStream = s.getInputStream();
            OutputStream outputStream = s.getOutputStream();

            try (Scanner in = new Scanner(inputStream, "UTF-8")) {
                PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"), true);
                out.println("hello!!Enter BYE to EXIT!");
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    System.out.println(line);
                    out.println("ECHO: " + line);
                    if (line.trim().equals("BYE")) done = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
