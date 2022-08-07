package Adapter;

public class Test {
  public static void main(String[] args) {
    
    //PROVIDER
    EmpoyDetails ds = new EmpoyDetails();

    //ADAPTER
    EmployeAdapter adapter = new EmployeAdapter(ds);

    //CONSUMER AND DATASHOWING
    Intranet intra = new Intranet(adapter);
    intra.printPhoneNumber();

  }
}


