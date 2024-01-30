import java.io.*;

public class Translation {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String wordOne = in.readLine();
        String wordTwo = in.readLine();
        String newWordTwo = "";

        for (int i = 0; i < wordTwo.length(); i++) {
            newWordTwo = wordTwo.charAt(i) + newWordTwo;
        }

        System.out.println(wordOne.equals(newWordTwo) ? "YES" : "NO");
    }    
}
