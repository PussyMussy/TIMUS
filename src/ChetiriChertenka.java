
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class ChetiriChertenka {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());

        if ((n * (n + 1) / 2) % 2 == 0) {
            out.print("black");
        } else {
            out.print("grimy");
        }
        out.flush();
    }
}