import java.io.*;

public class HitTheLottery {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        int count = 0;
        int[] div = {100, 20, 10, 5, 1};

        for (int i = 0; i < div.length; i++) {
            count += (num / div[i]);
            num = (num % div[i]);
        }
        System.out.println(count);
    }
}
