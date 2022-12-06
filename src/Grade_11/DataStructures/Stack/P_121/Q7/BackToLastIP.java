package Grade_11.DataStructures.Stack.P_121.Q7;

import java.util.Scanner;

import Grade_11.DataStructures.Stack.Stack;

public class BackToLastIP {
    //My Solution
    public static String back(Stack<String> ips, String backType) {
        if (backType.equals("BackX")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many addresses back you would like to move >> ");
            int backNum = scanner.nextInt();
            int counter = 0;
            while (counter != backNum || !ips.isEmpty()) {
                ips.pop();
                counter++;
            }
            if (counter == backNum) {
                if (!ips.isEmpty()) {
                    return ips.top();
                }
                return "";
            }
        }
        else if (backType.equals("Back")) {
            if (!ips.isEmpty()) {
                return ips.top();
            }
            return "";
        }
        return "";
    }

    //Class Solution
    public static String goBack(Stack<String> s, String st) {
        if (st.equals("Back")) {
            if (s.isEmpty()) {
                return "";
            }
            return s.pop();
        }
        else {
            Scanner reader = new Scanner(System.in);
            System.out.println("How many times back?");
            int x = reader.nextInt();
            while (!s.isEmpty() && x > 1) {
                s.pop();
                x--;
            }
            if (s.isEmpty()) {
                return "";
            }
            return s.pop();
        }
    }
}
