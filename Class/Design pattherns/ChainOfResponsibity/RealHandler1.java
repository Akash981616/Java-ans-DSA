package ChainOfResponsibity;

public class RealHandler1 extends Handler {

    public RealHandler1(Handler next) {
        super(next);
        //TODO Auto-generated constructor stub
    }

    @Override
    void handleRequest(Request obj) {
        if (obj.state > 0) {
            System.out.println("All state  greater than zero are Handled here");
        } else if (next != null) {
              System.out.println("Not a positive number moving delegating Forward");
            next.handleRequest(obj);  
        }
    }
}


