package javaSecurity;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = "i love xxx".getBytes();
        messageDigest.update(bytes);

        byte[] hash = messageDigest.digest();
        for (int i = 0; i < hash.length; i++) {
            int v = (hash[i]+1 )& 0xFF;
            String hv = Integer.toHexString(v);
            System.out.print(hv+"");
        }
    }
}