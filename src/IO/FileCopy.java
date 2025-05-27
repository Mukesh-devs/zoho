package IO;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String ss = "/home/zs-gsch01/Mukeshz/lab/problems/src/j/hello.txt";
//        fileInputtofileOutput(ss);
//        System.out.println(fileInputtoScanner(ss));
//        keyboardRead(ss);
        try {
            // Example: Launch Firefox
            Runtime.getRuntime().load("/home/zs-gsch01/Mukeshz/lab/problems/src/j/hello.txt");

            // Or any installed application, e.g.:
            // Runtime.getRuntime().exec("gedit");
            // Runtime.getRuntime().exec("gnome-terminal");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static void keyboardRead(String ss) throws IOException {
        FileOutputStream fout = new FileOutputStream(ss);
        Scanner sc = new Scanner(System.in);
        int str = System.in.read();
        while ( str != -1 ) {
            fout.write(str);
            str = System.in.read();
        }
        fout.close();
    }
    static String fileInputtoScanner(String str) throws IOException {
        FileInputStream fin = new FileInputStream(str);
        Scanner sc = new Scanner(fin);
        StringBuilder sb = new StringBuilder();
        while ( sc.hasNext()) {
            sb.append(sc.next());
            sb.append(" ");
        }
        fin.close();
        return sb.toString();
    }
    static void fileInputtofileOutput(String str) throws IOException {
        FileInputStream fin = new FileInputStream(str);
        FileOutputStream fout = new FileOutputStream("/home/zs-gsch01/Mukeshz/lab/problems/src/j/demo.txt");
        int s = fin.read();
        while(s!= -1) {
            fout.write(s);
            s = fin.read();
        }
        fin.close();
        fout.close();
    }
}
