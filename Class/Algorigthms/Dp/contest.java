import java.util.HashSet;

import javax.swing.AbstractAction;

/**
 * contest
 */
public class contest {

    static abstract class Employee {
        String name;
        int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        static void show() {
            System.out.println("hey how are " );
        }

        abstract void body();
    }

    static class softEmp extends Employee {

        softEmp(String name, int id) {
            super(name, id);

        }

        void body() {
            System.out.println("hey this is abstraction");
        }

    }

    public static void main(String[] args) {
        for(String curr:args)System.out.println(curr);
       
        Employee q = new softEmp("Akash", 1);

      
        q.body();
    }

}








