package ua.org.code;

import java.io.IOException;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int res_minutes = 540;
        res_minutes += a * 45;
        res_minutes += ((a - 1) / 2) * 15;
        res_minutes += ((a - 1) / 2 + (a - 1) % 2) * 5;

        int h = res_minutes / 60;
        int m = res_minutes % 60;
        System.out.println(h + " " + m);
    }
}
