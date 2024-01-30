import java.io.*;

public class Watermelon {
    public static void main(String[] args) throws IOException {
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(in.readLine());

        if (i == 2) {
            System.out.print("NO");
        } else {
            System.out.print(i % 2 == 0? "YES": "NO");
        }

    }
}
