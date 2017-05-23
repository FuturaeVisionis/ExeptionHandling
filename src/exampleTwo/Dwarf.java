package exampleTwo;

import javafx.beans.binding.StringExpression;

/**
 * Created by ronald on 16/09/16.
 */
public class Dwarf {

    public void MyDwarf() {

        try {
            int frodo = 100;
            int boon = frodo/10;
            String name = "Bilbo";
            if (name.equals("Joyee")) ;

            System.out.println("First print statement in try block");

        } catch (ArithmeticException e) {
            System.out.println("Corresponding name. You cracked the code Hoss!!! ");
        }
        System.out.println("Game over!...");
    }

    public static void main(String[] args) {
        Dwarf dwarf = new Dwarf();
        dwarf.MyDwarf();
    }
}

