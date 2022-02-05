public class RemoveCharacterFromString {
   public static void main(String[] args) {
       String qs="aakaasah";
       String qs2="";
   removeCh(qs, qs2);
   }

private static void removeCh(String qs, String qs2) {
if(qs.isEmpty()){
    System.out.print("");
    return;
}
 char c=qs.charAt(0);
 if(c=='a'){
    removeCh(qs.substring(1), qs2); 
 }else{
    removeCh(qs.substring(1), qs2+c);  
 }
System.out.print(qs2);
}


}
