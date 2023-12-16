package classes;

public class Item {

    private int itemID;
    private String itemName;
    private String supplierName;
    private String supplierAddress;
    private String supplierMobile;

    public Item(int itemID, String itemName, String supplierName, String supplierAddress, String supplierMobile) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierMobile = supplierMobile;
    }

    public String getSupplierMobile() {
        return supplierMobile;
    }

    public void setSupplierMobile(String supplierMobile) {
        this.supplierMobile = supplierMobile;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

}
