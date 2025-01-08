package supercity;

public class BudgetReport
{
    private double expenses;

    private double incomes;

    private double oldBudget;
    private double newBudget;
    public BudgetReport(double expenses, double incomes, double oldBudget, double newBudget)
    {
        this.expenses = expenses;
        this.incomes = incomes;
        this.oldBudget = oldBudget;

        this.newBudget = newBudget;
    }

    public double getExpenses()
    {
        return expenses;
    }
    public double getIncomes()
    {
        return incomes;
    }
    public double getOldBudget()
    {
        return oldBudget;
    }
    public double getNewBudget()
    {
        return newBudget;
    }


    @Override
    public String toString()
    {
        return "звіт Бюджету \n{" +
               "витрати=" + expenses + ", доходи=" + incomes +
               ", старий бюджет=" + oldBudget + ", новий бюджет=" + newBudget + '}';
    }
}
