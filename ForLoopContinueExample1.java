package devsought.forloop;

public class ForLoopContinueExample1 {

  public static void main(String... args) {
        String[] countries = new String[]{"Kenya", "Japan", "US", "Netherlands", "South Africa"};
        String skipTarget = "US";
   
        for (int i = 0; i < countries.length; i++) {
            if (skipTarget.contentEquals(countries[i])) {               
                continue;
            }
            System.out.println("Visited " + countries[i]);
        }
       
    }
}
