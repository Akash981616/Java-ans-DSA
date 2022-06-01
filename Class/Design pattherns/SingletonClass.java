public class SingletonClass {
   //only one object we can create

   public class SingleObject {

      //create an object of SingleObject
      private static SingleObject instance;

      //make the constructor private so that this class cannot be
      //instantiated
      private SingleObject() {
      }

      //Get the only object available
      public static SingleObject getInstance() {
         return instance;
      }

      public void showMessage() {
         System.out.println("Hello World!");
      }
   }




     public static void main(String[] args) throws Exception {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }


}
