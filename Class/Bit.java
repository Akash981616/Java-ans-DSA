package Class;

class Bit {
   public static void main(String[] args) {
       System.out.println(setbit(1,2));
   }

private static int setbit(int num, int thbit) {
     num= num | (1<<thbit);
    return num ;
}
private static int onBit(int num, int thbit) {
    num= num & (1<<thbit);
   return num ;
}
}
