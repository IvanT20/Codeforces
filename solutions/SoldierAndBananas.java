import java.io.*;

public class SoldierAndBananas {
    public static void main(String[] args ) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = in.readLine().split(" ");
        int k = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);
        int w = Integer.parseInt(nums[2]);
        int sum = 0;

        sum = (((k * (w * w) + k * w)) / 2);

        System.out.println(sum - n > 0 ? sum - n : 0);
    }
}
