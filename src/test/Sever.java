package test;

import java.io.*;
import java.net.*;

/**
 * @author: wwx
 * @date: 2023/6/26 10:40
 * @describe:
 */
public class Sever {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(10000);
            byte[] by = new byte[1024*64];
            DatagramPacket dp = new DatagramPacket(by, by.length);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str + "--" + dp.getAddress());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null)
                ds.close();
        }
    }
}
