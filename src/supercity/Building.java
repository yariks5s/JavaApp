package supercity;
import java.util.ArrayList;
import java.util.List;

public class Building
{
    private int id;

    private String address;
    private BuildingType type;

    private List<Resident> owners;

    private List<Resident> residents;

    public Building(int id, String address, BuildingType type)
    {
        this.id = id;
        this.address = address;

        this.type = type;
        this.owners = new ArrayList<>();

        this.residents = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }
    public String getAddress()
    {
        return address;
    }
    public BuildingType getType()
    {
        return type;
    }
    public List<Resident> getOwners()
    {
        return owners;
    }

    public List<Resident> getresidents()
    {
        return residents;
    }
    public void addOwner(Resident r)
    {
        owners.add(r);
    }

    public void addOccupant(Resident r)
    {
        if (type == BuildingType.RESIDENTIAL)
            residents.add(r);
        else
            System.out.println("❗️❗️Не можна додати життеля в нжитлову будівлю з такою даресою: " + address);
    }

    @Override
    public String toString()
    {
        return "будівля{" + "id=" + id + ", адреса='" + address + '\'' + ", тип=" + type +
               ", ownersCount=" + owners.size() + ", residentsCount=" + residents.size() + '}';
    }
}
