import java.util.Scanner;
public class Listing_2_5 {
    public static void main(String[] args) {
       Scanner Keyword = new Scanner(System.in);
       Keyword.useDelimiter("##");
       String sentance1 = Keyword.next();
       System.out.println(sentance1);
    }
}
