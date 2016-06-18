/*
 * Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).
 * 
 * Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.
 * 
 * Input Format 
 * The first line contains T, the number of test cases. T test cases follow, each in a new line. 
 * Each test case contains two space-separated integers denoting A and B.
 * 
 * Output Format 
 * For each test case, print the required answer in a new line.
 * 
 * Constraints 
 * 1 <= T <= 100
 * 1 <= A <= B<= 10^9
 * 
 * Sample Input
 * 
 * 2
 * 3 9
 * 17 24
 * Sample output
 * 
 * 2
 * 0
 * Explanation 
 * Test Case #00: In range [3,9], 4 and 9 are the two square numbers. 
 * Test Case #01: In range [17,24], there are no square numbers.
 */
package sherlockandsquares;

import java.util.Scanner;

/**
 *
 * @author Slava
 */
public class SherlockAndSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] inputArray = new int[t][2];
        
        for(int a0 = 0; a0 < t; a0++){
            inputArray[a0][0] = in.nextInt();
            inputArray[a0][1] = in.nextInt();
        }
        
        for(int i = 0; i < t; i++){
            System.out.println(getSquareIntegersBetween(inputArray[i][0], inputArray[i][1]));
        }
    }
    
    private static int getSquareIntegersBetween(int a, int b)
    {
        int result = 0;
        double ceiled_sqrta = Math.ceil(Math.sqrt(a));
        double sqr_ceiled_sqrta = ceiled_sqrta * ceiled_sqrta;
        
        while(sqr_ceiled_sqrta >= a && sqr_ceiled_sqrta <= b)
        {
            result++;
            ceiled_sqrta++;
            sqr_ceiled_sqrta = ceiled_sqrta * ceiled_sqrta;
        }
                
        return result;
    }
}
