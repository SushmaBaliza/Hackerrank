package main.Java;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

public class PatternSyntaxChecker
{

    public static void main(String[] args)
    {
        Pattern p;
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int i=0;i<testCases;i++)
        {
            String pattern = in.nextLine();
            try {
                p = Pattern.compile(pattern);
                System.out.println("valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }


    }
}
