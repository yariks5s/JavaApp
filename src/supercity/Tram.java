package supercity; 

public class Tram extends Transport
{
    private String lineColor;

    public Tram(String name, double fare, String lineColor)
    {
        super(name, fare);
        this.lineColor = lineColor;
    }

    public String getLineColor()
    {
        return lineColor;
    }

    public void setLineColor(String lineColor)
    {
        this.lineColor = lineColor;
    }

    @Override
    public String getTransportType()
    {
        return "TRAM";
    }

    @Override
    public String toString()
    {
        return "Трамвай{" +"назва: '" + name + '\'' +", шляхи: " + routes 
                +", плата: " + fare +", гілка: '"+lineColor + '\'' +'}';
    }
}
