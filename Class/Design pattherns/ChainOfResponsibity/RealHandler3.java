package ChainOfResponsibity;

public class RealHandler3 extends Handler {

    public RealHandler3(Handler next) {
        super(next);
        //TODO Auto-generated constructor stub
    }

    @Override
    void handleRequest(Request obj) {
        if (obj.state < 0) {
 System.out.println("All state  smaller than zero are Handled here");
} else if (next != null) {
              System.out.println("Not a negative State delegating Forward");
            next.handleRequest(obj);
        }

    }

}

