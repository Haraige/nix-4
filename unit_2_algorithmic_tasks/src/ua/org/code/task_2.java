package ua.org.code;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ArrayList<Character> arr = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            arr.add(matcher.group().charAt(0));
        }

        Collections.sort(arr);

        try {
            int coun = 1;
            char cur_char = arr.get(0);
            arr.remove(0);
            for (char c: arr){
                if (cur_char == c) coun += 1;
                else {
                    System.out.println(cur_char + " - " + coun);
                    cur_char = c;
                    coun = 1;
                }
            }
            System.out.println(cur_char + " - " + coun);
        }
        catch (IndexOutOfBoundsException c) {
            System.out.println("");
        }
    }
}
