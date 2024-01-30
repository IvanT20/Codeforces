import java.io.*;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String word = in.readLine();
        int count = (int) word.chars().distinct().count();

        System.out.println(count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
