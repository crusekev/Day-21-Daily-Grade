package cruse.kevin;

public class CellPhone
{
    //field declarations
    private String Manufacturer;
    private String ModelNumber;
    private double RetailPrice;
    //constructors
    public CellPhone(String Manufact, String ModNum, double Retail)
    {
        Manufacturer = Manufact;
        ModelNumber = ModNum;
        RetailPrice = Retail;
    }
    public CellPhone()
    {
    }
    //method definitions
    public void setManufacturer(String Manufact)
    {
        Manufacturer = Manufact;
    }
    public void setModelNumber(String ModNum)
    {
        ModelNumber = ModNum;
    }
    public void setRetailPrice(double Retail)
    {
        RetailPrice = Retail;
    }
    public String getManufacturer()
    {
        return Manufacturer;
    }
    public String getModelNumber()
    {
        return ModelNumber;
    }
    public double getRetailPrice()
    {
        return RetailPrice;
    }
}
