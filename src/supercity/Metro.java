package supercity; 

public class Metro extends Transport
{
    private int numberOfCarriages;

    public Metro(String name, double fare, int numberOfCarriages)
    {
        super(name, fare);
        this.numberOfCarriages = numberOfCarriages;
    }

    public int getNumberOfCarriages()
    {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages)
    {
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public String getTransportType()
    {
        return "METRO";
    }

    @Override
    public String toString()
    {
        return "Метро {" +"назва: '"+name + '\'' +
               ", шляхи: " + routes +", плата: " +fare +
               ", к-сть вагонів: " + numberOfCarriages + '}';
    }
}
