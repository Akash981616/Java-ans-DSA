package CodeForStrategy;

import CodeForStrategy.Kicks.*;
import CodeForStrategy.Punch.IPunchingBehaviour;
import CodeForStrategy.Wrestling.IWrestlingBehaviour;

public class Fighter {
    IKickingBehaviour kb;
    IPunchingBehaviour pb;
    IWrestlingBehaviour wb;

    void fight() {
        pb.punch();
        kb.Kick();
        wb.wrestle();
    }
}









