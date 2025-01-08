package supercity;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport
{
    protected String name;
    protected List<String> routes;

    protected double fare;
    public Transport(String name, double fare)
    {
        this.name = name;
        this.fare = fare;
        this.routes = new ArrayList<>();
    }
@Override
    public String toString()
    {
        return "Transport{"+"type=" + getTransportType()+", name='" + name + '\'' +
               ", routes=" + routes + ", fare=" + fare + '}';
    }

    public abstract String getTransportType();

    public String getName()
    {
        return name;
    }
    public List<String> getRoutes()
    {
        return routes;
    }
    public double getFare()
    {
        return fare;
    }

    public void setFare(double fare)
    {
        this.fare = fare;
    }
    public void addRoute(String route)
    {
        routes.add(route);
    }
}
