package entity;

import java.util.ArrayList;

/**
 * Created by StasMaster on 30.12.17.
 */
public class Customer {
    private String name;
    private String surname;
    private int id;
    private ArrayList<SkiPass> skiPasses = new ArrayList<>();


    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean addSkipass(SkiPass skiPass) {
        if(!skiPasses.contains(skiPass)) {
            skiPasses.add(skiPass);
            return true;
        }
        return false;
    }


    public ArrayList<SkiPass> getSkiPasses() {
        return  new ArrayList<>(skiPasses);
    }

    public SkiPass findSkipass(int id) {
        for (SkiPass skiSearch:
             skiPasses) {
            if(skiSearch.getId() == id) {
                return skiSearch;
            }

        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (!name.equals(customer.name)) return false;
        if (!surname.equals(customer.surname)) return false;
        return skiPasses.equals(customer.skiPasses);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + skiPasses.hashCode();
        return result;
    }
}
