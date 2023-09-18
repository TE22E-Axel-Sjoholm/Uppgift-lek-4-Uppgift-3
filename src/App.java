import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Mata in en följande delar efter varandra med mellanslag mellan varje del: Förnamn Efternamn Längd Vikt Ålder");
        String svar = tb.nextLine();
        System.out.println(svar);
        
        tb.close();
    }
}
