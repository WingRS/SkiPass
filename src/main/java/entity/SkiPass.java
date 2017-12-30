package entity;

import SkipassStrat.Counters.SkiPassStrategy;

/**
 * Created by StasMaster on 18.12.17.
 */
public class SkiPass {


    private SkiPassStrategy skiPassStrategy;
    private final int id;
    private boolean isBlocked = false;
    private Customer customer;

    public SkiPass(Customer customer, SkiPassStrategy skiPassStrategy) {
        this.skiPassStrategy = skiPassStrategy;
        this.customer = customer;
        customer.addSkipass(this);
        this.id = hashCode();
    }


    public SkiPassStrategy getSkiPassStrategy() {
        return skiPassStrategy;
    }

    public void setSkiPassStrategy(SkiPassStrategy skiPassStrategy) {
        this.skiPassStrategy = skiPassStrategy;
    }

    public int getId() {
        return id;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkiPass skiPass = (SkiPass) o;

        if (id != skiPass.id) return false;
        if (isBlocked != skiPass.isBlocked) return false;
        if (!skiPassStrategy.equals(skiPass.skiPassStrategy)) return false;
        return customer.equals(skiPass.customer);
    }

    @Override
    public int hashCode() {

        int result = skiPassStrategy.hashCode();
        result = 31 * result + (isBlocked ? 1 : 0);
        return result;
    }
}
