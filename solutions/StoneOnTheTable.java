import java.io.*;

public class StoneOnTheTable {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        String word = in.readLine();
        int count = 0;
        
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
