package main.Java;

import java.util.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        // int i, n;
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));

    }

}

