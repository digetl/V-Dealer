package Customers;

public class Customer {
    private String name;
    private int phone;
    private double money;

    public Customer(String name, int phone, double money){
        this.name = name;
        this.phone = phone;
        this.money = money;
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

    public void setPhoneNumber(Integer phone) {

        if (phone instanceof Integer)
            this.phone = phone;
    }

    public double getMoney(){
        return this.money;
    }

    public void spendMoney(double cost){
        if (money >= cost)
        this.money -= cost;
    }



}
