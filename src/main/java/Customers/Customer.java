package Customers;

public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
            if(name != null && !name.isEmpty())
            this.name = name;
    }


}
