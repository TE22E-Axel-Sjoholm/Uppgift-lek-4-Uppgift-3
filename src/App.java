import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        System.out.println("Mata in en följande delar efter varandra med mellanslag mellan varje del: Förnamn Efternamn Längd Vikt Ålder");
        String svar = tb.nextLine();

        int space1 = svar.indexOf(" ");
        int space2 = svar.indexOf(" ",(space1+1));
        int space3 = svar.indexOf(" ",(space2+1));
        int space4 = svar.indexOf(" ",(space3+1));

        String förnamn = svar.substring(0, space1);
        String efternamn = svar.substring(space1+1, space2);
        String längd = svar.substring(space2+1, space3);
        String vikt = svar.substring(space3+1, space4);
        String ålder = svar.substring(space4+1);


        System.out.println("Förnamn: "+förnamn);
        System.out.println("Efternamn: "+efternamn);
        System.out.println("Längd: "+längd);
        System.out.println("Vikt: "+vikt);
        System.out.println("Ålder: "+ålder);        

        int närmasteJämntÅlder = (Integer.parseInt(ålder) + 1) / 2 * 2;
        if((närmasteJämntÅlder-Integer.parseInt(ålder)) == 2){
            System.out.println("Det är 2 år tills du fyller jämt");
        } else{
            System.out.println("Det är "+(närmasteJämntÅlder-Integer.parseInt(ålder))+" år tills du fyller jämt.");
        }



        tb.close();
    }
}
