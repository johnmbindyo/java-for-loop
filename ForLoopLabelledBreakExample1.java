package devsought.forloop;

public class ForLoopLabelledBreakExample1 {

    public static void main(String... args) {
        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer loop"+(i+1));
            inner:
            for (int j = 0; j < 5; j++) {
                System.out.println(" Inner loop");
                break outer;
            } // end of inner loop
            //code below here will never execute
            System.out.println("Never executed line of code");
        }
        System.out.println("End");
    }
}
