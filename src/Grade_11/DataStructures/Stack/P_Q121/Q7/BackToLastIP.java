package Grade_11.DataStructures.Stack.P_Q121.Q7;

import java.util.Scanner;

import Grade_11.DataStructures.Stack.P_Q121.Stack;

public class BackToLastIP {
    public static String back(Stack<String> ips, String backType) {
        if (backType.equals("BackX")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many addresses back you would like to move >> ");
            int backNum = scanner.nextInt();
            if (backNum > 9 || backNum < 2) {
                return "";
            }
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
}
