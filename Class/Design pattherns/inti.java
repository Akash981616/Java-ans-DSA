/**
 * int
 */
public class inti {
    interface A {
        void show();

    }

    class B implements A {
        String name;

        B(String name) {
            this.name = name;
        }

        @Override
        public void show() {
            System.out.println("hey " + name);
        }

    }

    public static void main(String[] args) {
       

        int A[] = { 
3
-72 ,72, 8 };
        //int A[] = { -72, 72, 8 };
        
        System.out.println(solve(A,A.length));
       
    }

    private static String solve(int[] A, int N) {
        int arr[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];

            arr[i] = sum;
        }
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (index % 2 == 0) {
                if (arr[i] != 0) {
                    System.out.println(index);
                    return "NO";
                }

            }
            index++;
        }
        return  N%2==0&&sum==0?"YES":"NO";
    }

}

