import java.io.*;

public class nextround {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] value = in.readLine().split(" ");
        int k = Integer.parseInt(value[1]);
        int counter = 0;
        String[] nums = in.readLine().split(" ");

        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) > 0 && Integer.parseInt(nums[i]) >= Integer.parseInt(nums[k - 1])) {
                counter++;
            }
        }
        System.out.println(counter);
    }    
}
