import java.io.*;

public class Tram {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int total = 0;
        int maxNum = 0;
        String[] num;

        for (int i = 0; i < n; i++) {
            num = in.readLine().split(" ");
            total -= Integer.parseInt(num[0]);
            total += Integer.parseInt(num[1]);
            
            if (total > maxNum) {
                maxNum = total;
            }
        }

        System.out.println(maxNum);
    }    
}
