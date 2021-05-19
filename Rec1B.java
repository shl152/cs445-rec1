public class Rec1B {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter some arguments when running this");
        } else {
            System.out.println("You entered " + args.length + " arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}

