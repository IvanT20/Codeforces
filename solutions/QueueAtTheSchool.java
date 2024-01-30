import java.io.*;

public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] num = in.readLine().split(" ");
        char[] people = in.readLine().toCharArray();
        int t = Integer.parseInt(num[1]);

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if (people[j] == 'B' && people[j + 1] != 'B') {
                    people[j] = 'G';
                    people[j + 1] = 'B';
                    j++;
                }
            }
        }

        System.out.println(new String(people));

    }
}
