import java.io.*;

public class Word {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String word = in.readLine();
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }

        System.out.println(upperCount > lowerCount ? word.toUpperCase() : word.toLowerCase());
    }    
}
