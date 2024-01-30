import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class team {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int counter = 0;

        for (int i = 0; i < num; i++) {
            String nums = in.readLine();
            if (nums.equals("1 1 0") || nums.equals("1 0 1") || nums.equals("0 1 1") || nums.equals("1 1 1")) {
                counter++;
            } 
        }
        System.out.println(counter);
    }
}
