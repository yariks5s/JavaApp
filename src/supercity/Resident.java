package supercity; 

public class Resident
{
    private String fullName;
    private int age;
    private String phone;

    public Resident(String fullName, int age, String phone)
    {
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    public String getFullName()
    {
        return fullName;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhone()
    {
        return phone;
    }

    @Override
    public String toString()
    {
        return "Resident{"+"fullName='" + fullName + '\'' +
               ", age=" + age+", phone='" + phone + '\'' +'}';
    }
}
