import java.io.*;

public class BearAndBigBrother {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = in.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int count = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }

        System.out.println(count);
    }
}
