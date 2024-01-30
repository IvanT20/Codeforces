import java.io.*;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = in.readLine().split("\\+");
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i == nums.length - 1) {
                continue;
            } 
            System.out.print("+");  
        }

    }
}
