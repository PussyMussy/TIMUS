import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Trudnosti_localisati {
    public static void main(String str[]) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String result = getWordByNumber(Integer.parseInt(consoleReader.readLine()));
        consoleReader.close();
        if (!result.equals(""))
            System.out.println(result);
    }

}