import java.io.*;

public class WrongSubtraction {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = in.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int t = Integer.parseInt(nums[1]);

        for (int i = 0; i < t; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        
        System.out.println(n);
    }    
}
