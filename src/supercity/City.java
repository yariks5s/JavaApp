package supercity;
import java.util.ArrayList;
import java.util.List;


public class City
{
    private String name;
    private Government government;
    private List<District> districts;
    private List<Building> buildings;

    private List<Resident> residents;
    private List<PublicService> services;

    private List<Transport> transports;
    private List<Event> events;

    public City(String name, Government government)
    {
        this.name = name;
        this.government = government;
        this.districts = new ArrayList<>();

        this.buildings = new ArrayList<>();
        this.residents = new ArrayList<>();
        this.services = new ArrayList<>();

        this.transports = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    public Government getGovernment()
    {
        return government;
    }

    public List<District> getDistricts()
    {
        return districts;
    }
    public List<Building> getBuildings()
    {
        return buildings;
    }

    public List<Resident> getResidents()
    {
        return residents;
    }

    public List<PublicService> getServices()
    {
        return services;
    }

    public List<Transport> getTransports()
    {
        return transports;
    }
    public List<Event> getEvents()
    {
        return events;
    }

    public void addDistrict(District d)
    {
        districts.add(d);
    }
    public void addBuilding(Building b)
    {
        buildings.add(b);
    }

    public void addResident(Resident r)
    {
        residents.add(r);
    }

    public void addService(PublicService service)
    {
        services.add(service);
    }
    public void addTransport(Transport t)
    {
        transports.add(t);
    }

    public void addEvent(Event e)
    {
        events.add(e);
    }

    public void printSummary()
    {
        System.out.println("Місто (імʼя): " + name);
        System.out.println("  Кварталів: " + districts.size());
        System.out.println("  будівль: " + buildings.size());
        System.out.println("  жителів: " + residents.size());
        System.out.println("  послуг : " + services.size());
        System.out.println("  транспортів: " + transports.size());
        System.out.println("  подій: " + events.size());
    }
}
