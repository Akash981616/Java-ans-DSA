package ChainOfResponsibity;

//policy bech rhe hain;
// sell piolicy acc to salary;
public class test {
    public static void main(String[] args) {
        Handler o1 = new RealHandler1(null);
        Handler o2 = new RealHandler2(o1);
        Handler o3 = new RealHandler3(o2);
        Request req = new Request(10);
        o3.handleRequest(req);
        System.out.println();

        if (2 < 32 && 10 < 12) {
            System.out.println(
                    "this is chain of responsiblity desing pattern . this pattern such dividing the responsibity into parts for example : => ");
            System.out.println(
                    "A agent for LIC wants for  sell his  polices then he divided his responsibility statergy   for rich, poor,");
        }
    }
}



