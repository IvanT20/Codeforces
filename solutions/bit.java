import java.io.*;

public class bit {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int n = Integer.parseInt((in.readLine()));
        
        for (int i = 0; i < n; i++) {
            String op = in.readLine();

            if (op.equals("--X") || op.equals("X--")) {
                x--;
            } else {
                x++;
            }
        }

        System.out.print(x);
    }
}
