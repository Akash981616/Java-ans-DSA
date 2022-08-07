package Adapter;

import java.util.*;

//Adapter
public class EmployeAdapter implements IPhoneListSource {
    private EmpoyDetails emDS;

    public EmployeAdapter(EmpoyDetails ds) {
        this.emDS = ds;
    }

    @Override
    public List<String> getPhoneNumber() {
        List<String> emps = this.emDS.getEmpolye();
        List<String> phone = new ArrayList<>();
        for (String curr : emps) {
            String st[] = curr.split("-");
            String phoneNo = st[3];
            phone.add(phoneNo);
        }
        return phone;
    }
}


