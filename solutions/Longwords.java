import java.io.*;

public class Longwords {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        
        for (int i = 0; i < words.length; i++) {
            String word = in.readLine();
            if (word.length() < 11) {
                words[i] = word;
            } else {
                words[i] = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
            }
        }

        for (String word: words) {
            System.out.println(word);
        }
        
    }
}
