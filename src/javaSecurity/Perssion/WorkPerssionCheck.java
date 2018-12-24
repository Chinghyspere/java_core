package javaSecurity.Perssion;
/*
 *
 *     @author Qmh
 *
 *   Yuan Li Bug Zhen Ai Sheng Ming
 */

import java.security.Permission;

public class WorkPerssionCheck extends Permission {
    private String action;


    public WorkPerssionCheck(String target,String action) {
        super(target);
        this.action = action;
    }

    @Override
    public boolean implies(Permission permission) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String getActions() {
        return action;
    }
}
