package exampleOne;

/**
 * Created by ronald on 16/09/16.
 */
public class Program {
    public static void main(String[] args) {
        String value = "Mario Brothers is the best";
        int game = 45;

        try {
            System.out.println(value.length());
            System.out.println(game / 0);
        } catch (Exception ex) {
            System.out.println("Exception thrown");
        } finally {
            System.out.println("Finally done");
        }
    }
}
