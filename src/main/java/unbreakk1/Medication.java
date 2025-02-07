package unbreakk1;

public class Medication
{
    private String name;
    private double price;
    private boolean availability;

    // Constructor
    public Medication()
    {
        this.name = "";
        this.price = 0.0;
        this.availability = false;
    }
    public Medication(String name, double price, boolean availability)
    {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    // Getter methods
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public boolean getAvailability()
    {
        return availability;
    }

    @Override
    public String toString()
    {
        return "Medication{name='" + name + "', price=" + price + ", availability=" + availability + "}";
    }

}
