package classes;

public class Customer {

    private int cusID;
    private String cusName;
    private String cusMobile;

    public Customer(int cusID, String cusName, String cusMobile) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.cusMobile = cusMobile;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

}
