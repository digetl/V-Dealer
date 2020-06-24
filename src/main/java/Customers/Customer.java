package Customers;

public class Customer {
    private String name;
    private int phone;

    public Customer(String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty())
            this.name = name;
    }

    public int getPhoneNumber(){
        return this.phone;
    }
}
