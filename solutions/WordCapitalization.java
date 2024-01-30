import java.io.*;

public class WordCapitalization {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String word = in.readLine();

        System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
    }
}
