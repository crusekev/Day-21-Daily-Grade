package cruse.kevin;

public class Main
{

    public static void main(String[] args)
    {
        CellPhone MyPhone;
        MyPhone = new CellPhone();
        MyPhone.setManufacturer("Apple");
        MyPhone.setModelNumber("IPhone X");
        MyPhone.setRetailPrice(1000.00);
        System.out.println("The model number is: " + MyPhone.getModelNumber());
        CellPhone YourPhone;
        YourPhone = new CellPhone("Apple", "X", 1000.00);
    }

}