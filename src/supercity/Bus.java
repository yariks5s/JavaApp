package supercity;


public class Bus extends Transport
{
    private boolean isDoubleDecker;
    public Bus(String name, double fare, boolean isDoubleDecker)
    {
        super(name, fare);
        this.isDoubleDecker = isDoubleDecker;
    }

    public boolean isDoubleDecker()
    {
        return isDoubleDecker;
    }
    public void setDoubleDecker(boolean doubleDecker)
    {
        isDoubleDecker = doubleDecker;
    }

    @Override
    public String getTransportType()
    {
        return "BUS";
    }

    @Override
    public String toString()
    {
        return "Автобус{" +"імʼя='" + name + '\'' +
               ", шляхи=" +routes + ", плата=" + fare +
               ", чиПодвійний=" + isDoubleDecker +'}';
    }
}
