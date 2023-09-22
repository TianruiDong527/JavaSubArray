import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] myArray = new int[num];
        for (int i = 0; i < num; i++) {
            myArray[i] = scan.nextInt();
        }
        int output  = 0;
        for (int i = 0; i < num; i++){
            int sum = myArray[i];
            if (sum<0) output++;
            for (int j = i + 1; j < num; j++){
                sum = sum + myArray[j];
                if (sum<0) output++;
            }
        }
        System.out.println(output);
    }
}

