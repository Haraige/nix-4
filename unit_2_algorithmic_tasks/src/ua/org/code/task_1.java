package ua.org.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        ArrayList<Double> arr = new ArrayList<>();

        Pattern pattern = Pattern.compile("[0-9]+\\.\\d|[0-9]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            arr.add(Double.parseDouble(matcher.group()));
        }

        double res = 0;
        for (double i : arr){
            res += i;
        }

        System.out.println(res);
    }
}
