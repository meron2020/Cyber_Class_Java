package OneDimensionalArrays.basic;

import java.util.*;
public class matrix
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter num");
        int n = reader.nextInt();
        boolean uni = false;
        int [][] m = new int [n][n];
        for (int i = 0; i< n; i++)
        {
            for (int j = 0; j< n; j++)
            {
                Random r = new Random();
                int num = r.nextInt();
                m[i][j] = num;
            }
        }
        int [] a = new int [n*n];
        int counter = 0;
        for (int i = 0; i< n; i++)
        {
            for (int j = 0; j< n; j++)
            {
                int nums = m[i][j];
                for (int x = 0; x<a.length; x++)
                {
                    if (nums == a[x])
                    {
                        uni = false;
                    }
                    else
                    {
                        for (int s = 0; s<n; s++)
                        {
                            for (int p = 0; p<n; p++)
                            {
                                if (m[s][p] == nums)
                                {
                                    a[counter] = nums;
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
