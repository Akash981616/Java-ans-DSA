
import java.util.*;

public class Crypto {
    static abstract class Akash {
        int val = 108;

        abstract void showMessage();
    }

    static class A extends Akash {
        int val;

        public A() {

        }

        public void showMessage() {
            System.out.println("this is abstract Class");
        }

    }

    public static int findDuplicate(int[] nums) {
        if (nums.length == 0)
            return 0;
        int slow = 0, fast = 0;
        slow = nums[slow];

        fast = nums[nums[fast]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    static class Car {
        String part;

        public void getPart(String part) {
            this.part = part;
            System.out.println("Car has " + part);
        }
    }

    static class part {
        public String setPart () {
            return "engine";
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        part a = new part();
        bmw.getPart(a.setPart());
        System.out.println();
        // A obj = new A();

        // System.out.println(obj.val);
        // obj.showMessage();
        // int nums[] = { 1, 3, 4, 2, 2 };
        //System.out.println(findDuplicate(nums));
        Scanner scn = new Scanner(System.in);g


        // int n = 3;
        // int val = n + n - 1;
        
        // int iter = val;
    
        // for (int i = 0; i < n; i++) {
        //     int limit = val;

        //     for (int space = 0; space < i; space++) {
        //         System.out.print(" ");
        //     }
          
        //     for (int j = 0; j < iter; j++) {
        //         System.out.print(limit--);
        //     }
        //     ;
        //        if (iter % 2 == 0) {
        //         iter = iter / 2 ;
        //     } else {
        //         iter =(int) Math.floor(iter/2);
        //     }
            
        //     System.out.print("  " + iter + "oteradfadfdf     ");
        //     System.out.println();
        // }

    }

}

