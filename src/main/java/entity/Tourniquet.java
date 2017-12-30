package entity;

import Helpers.Day;

import java.util.Date;

/**
 * Created by StasMaster on 30.12.17.
 */
public class Tourniquet {
    private int id;

    public Tourniquet() {
        this.id = hashCode();
    }


    public boolean pass(SkiPass skiPass) {
        if (!skiPass.isBlocked()) {
            return skiPass.getSkiPassStrategy().count(new Day());
        }
        return false;
    }

}
