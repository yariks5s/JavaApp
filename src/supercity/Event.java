package supercity; 
import java.time.LocalDate;

public class Event
{
    private String title;

    private String description;

    private LocalDate date;

    private double budget;
    private District location;

    public Event(String title, String description, LocalDate date, double budget, District location)
    {
        this.title = title;
        this.description = description;
        this.date = date;
        this.budget = budget;
        this.location = location;
    }
    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }
    public LocalDate getDate()
    {
        return date;
    }

    public double getBudget()
    {
        return budget;
    }

    public District getLocation()
    {
        return location;
    }
    @Override
    public String toString()
    {
        return "подія\n{" +"назва='" + title + '\'' + ", опис='" + description + '\'' +
               ", дата=" + date +", бюджет на подвю=" + budget +
               ", розмішення=" + (location != null ? location.getName() : "Немає") +'}';
    }
}
