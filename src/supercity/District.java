package supercity;
import java.util.ArrayList;
import java.util.List;


public class District
{
    private String name;

    private DistrictType type;
    private List<Building> buildings;

    public District(String name, DistrictType type)
    {
        this.name = name;
        this.type = type;
        this.buildings = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    public DistrictType getType()
    {
        return type;
    }

    public List<Building> getBuildings()
    {
        return buildings;
    }
    public void addBuilding(Building building)
    {
        buildings.add(building);
    }

    @Override
    public String toString()
    {
        return "квартал{" + "назва='" + name + '\'' +
               ", тип=" + type +", кількісиь будівель: " + buildings.size() +'}';
    }
}