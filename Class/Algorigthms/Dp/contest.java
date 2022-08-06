import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

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
            System.out.println("hey how are ");
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
        int grid[][] = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        String s = new String("manshu");
        s.concat("fhfjfjhfj");
        System.out.println(s);//manshu

    }

   
}








