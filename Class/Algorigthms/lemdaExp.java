package Class.Algorigthms;

/**
 * lemdaExp
 */
public class lemdaExp {

    interface car {
        void show();
    }

    public class tesla implements car {

        @Override
        public void show() {
            System.out.println("i am car");

        }

    }
   public static void main(String[] args) {
       tesla c1 = new tesla();
       c1.show();
   }
} 