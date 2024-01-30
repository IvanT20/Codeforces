import java.io.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] num = in.readLine().toCharArray();
        int count = 0;

        for (char letter: num) {
            if (letter == '4' || letter == '7') {
                count++;
            }
        }

        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }    
}
