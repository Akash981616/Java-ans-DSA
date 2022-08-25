package ChainOfResponsibity;

//policy bech rhe hain;
// sell piolicy acc to salary;
public class test {
    public static void main(String[] args) {
        Handler o1 = new RealHandler1(null);
        Handler o2 = new RealHandler2(o1);
        Handler o3 = new RealHandler3(o2);
        Request req = new Request(-10);
        o3.handleRequest(req);
    }

}

