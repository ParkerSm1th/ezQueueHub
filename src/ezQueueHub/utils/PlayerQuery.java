package com.yeetdev.ezQueueHub.utils;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.bukkit.event.Listener;

public class PlayerQuery implements Listener {

    public static int op1;
    public static int tp1;

    public static int op2;
    public static int tp2;

    public static int op3;
    public static int tp3;

    public void Ping (int IP, int port){
        try {
            Socket sock = new Socket("127.0.0.1", 25565);

            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            DataInputStream in = new DataInputStream(sock.getInputStream());

            out.write(0xFE);

            int b;
            StringBuffer str = new StringBuffer();
            while ((b = in.read()) != -1) {
                if (b != 0 && b > 16 && b != 255 && b != 23 && b != 24) {
// Not sure what use the two characters are so I omit them
                    str.append((char) b);
                    System.out.println(b + ":" + ((char) b));
                }
            }

            String[] data = str.toString().split("§");
            String serverMotd = data[0];
            op1 = Integer.parseInt(data[1]);
            tp1 = Integer.parseInt(data[2]);


        } catch (UnknownHostException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Socket sock = new Socket("127.0.0.1", 25565);

            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            DataInputStream in = new DataInputStream(sock.getInputStream());

            out.write(0xFE);

            int b;
            StringBuffer str = new StringBuffer();
            while ((b = in.read()) != -1) {
                if (b != 0 && b > 16 && b != 255 && b != 23 && b != 24) {
// Not sure what use the two characters are so I omit them
                    str.append((char) b);
                    System.out.println(b + ":" + ((char) b));
                }
            }

            String[] data = str.toString().split("§");
            String serverMotd = data[0];
            op2 = Integer.parseInt(data[1]);
            tp2 = Integer.parseInt(data[2]);


        } catch (UnknownHostException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Socket sock = new Socket("137.74.90.75", 25567);

            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            DataInputStream in = new DataInputStream(sock.getInputStream());

            out.write(0xFE);

            int b;
            StringBuffer str = new StringBuffer();
            while ((b = in.read()) != -1) {
                if (b != 0 && b > 16 && b != 255 && b != 23 && b != 24) {
// Not sure what use the two characters are so I omit them
                    str.append((char) b);
                    System.out.println(b + ":" + ((char) b));
                }
            }

            String[] data = str.toString().split("§");
            String serverMotd = data[0];
            op3 = Integer.parseInt(data[1]);
            tp3 = Integer.parseInt(data[2]);


        } catch (UnknownHostException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
