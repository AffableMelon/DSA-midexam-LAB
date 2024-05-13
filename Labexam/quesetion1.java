package Labexam;
import java.util.Scanner;

public class quesetion1 {
    public static void main (String[] args){
        int[] nums1 = new int[args.length];
        int i = 0; 
        for (String string : args) {
            nums1[i] = Integer.parseInt(string);
            i++;
        }
        Scanner listen = new Scanner(System.in);
        System.out.println("Please enter the target: ");
        int target = listen.nextInt();
        listen.close();
        int appears = 0;

        for (int j = 0; j < nums1.length; j++){
            if (nums1[j] == target){
                appears++;
            }
        }
        int ret = (appears > 0) ? appears:-1;

        System.out.println(ret);

    }
}
