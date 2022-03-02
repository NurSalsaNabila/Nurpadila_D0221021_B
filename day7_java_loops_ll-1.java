
package padila;
import java.util.*;
import java.io.*;


public class day7_java_loops_ll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            for(int j=0;j<n;j++){
                sum += ((int) Math.pow(2, j) * b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
    
}