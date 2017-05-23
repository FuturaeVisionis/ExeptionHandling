package exampleTwo;

/**
 * Created by ronald on 16/09/16.
 */
public class Dragon {

    private static void MyDragon() {
        try {
            int histor[] = new int[7];
            histor[6] = 30 / 9;
            System.out.println("First print statement in try block");

        } catch (ArithmeticException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundException");
        } catch (Exception e) {
            System.out.println("Warning: some other exception");
        }
        System.out.println("Out of try-catch block...");
    }

    public void dragonLady() {
        MyDragon();
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.dragonLady();
    }
}
