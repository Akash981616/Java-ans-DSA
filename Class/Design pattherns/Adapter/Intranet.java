package Adapter;

import java.util.List;
/**
 * Intranet
 */
public class Intranet {
    IPhoneListSource source;

    public Intranet(IPhoneListSource source) {
        this.source = source;
    }

    public void printPhoneNumber() {
        List<String> phones = this.source.getPhoneNumber();
        System.out.println(phones);
    }

}

