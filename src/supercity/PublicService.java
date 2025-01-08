package supercity; 

public class PublicService
{
    private String serviceName;
    private String description;
    private double serviceBudget;

    public PublicService(String serviceName, String description, double serviceBudget)
    {
        this.serviceName = serviceName;
        this.description = description;
        this.serviceBudget = serviceBudget;
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public String getDescription()
    {
        return description;
    }

    public double getServiceBudget()
    {
        return serviceBudget;
    }

    public void setServiceBudget(double serviceBudget)
    {
        this.serviceBudget = serviceBudget;
    }

    @Override
    public String toString()
    {
        return "Послуги {" +"назва:'"+serviceName + '\'' +
               ", опис:'" + description + '\''+", бюджет: " + serviceBudget+'}';
    }
}
