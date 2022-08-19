package devsought.forloop;

public class ForLoopBreakExample1 {

    public static void main(String... args) {
        String[] countries = new String[]{"Kenya", "Japan", "US", "Netherlands", "South Africa"};
        String target = "US";
        int targetPos = -1;
        for (int i = 0; i < countries.length; i++) {
            if (target.contentEquals(countries[i])) {
                targetPos = i + 1;
                break;
            }
            System.out.println("Visited " + countries[i]);
        }
        if (targetPos != -1) {
            System.out.println("Found target at position:" + targetPos);
        } else {
            System.out.println("Target not found in array");
        }
    }
}
