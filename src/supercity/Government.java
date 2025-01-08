package supercity; 

import java.util.ArrayList;
import java.util.List;

public class Government
{
    private String mayorName;
    private double cityBudget;
    private List<BudgetReport> reports;

    public Government(String mayorName, double initialBudget)
    {
        this.mayorName = mayorName;
        this.cityBudget = initialBudget;
        this.reports = new ArrayList<>();
    }

    public String getMayorName()
    {
        return mayorName;
    }

    public double getCityBudget()
    {
        return cityBudget;
    }


    public BudgetReport createBudgetReport(double expenses, double incomes)
    {
        double newBalance = cityBudget + incomes - expenses;
        BudgetReport report = new BudgetReport(expenses, incomes, cityBudget, newBalance);
        reports.add(report);

        cityBudget = newBalance;
        return report;
    }

    public List<BudgetReport> getReports()
    {
        return reports;
    }

    @Override
    public String toString()
    {
        return "Правління{" +"Мер:'" + mayorName + '\'' +
               ", виділений бюджет: " + cityBudget + ", кільксть звітів: " +reports.size() +'}';
    }
}
