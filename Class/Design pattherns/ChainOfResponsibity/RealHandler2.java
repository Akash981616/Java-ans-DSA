package ChainOfResponsibity;

public class RealHandler2 extends Handler {

    public RealHandler2(Handler next) {
        super(next);
        //TODO Auto-generated constructor stub
    }

    @Override
    void handleRequest(Request obj) {
        if (obj.state == 0) {
            System.out.println("All zero are Handled here");
        } else if (next != null) {
            System.out.println("Not a zero State delegating Forward");
            next.handleRequest(obj);
        }

    }

}

