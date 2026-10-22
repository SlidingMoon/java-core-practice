package fundamentals.day01;

public class PersonalFinanceCalculator {
    public static void main(String[] args) {

        double salary = 50000;
        double rent = 23300;
        double food = 10000;
        double transport = 2000;
        double otherExpenses = 6321;


        double totalExpenses = rent + food + transport + otherExpenses;
        double moneyLeft = salary - totalExpenses;
        double yearIncome = salary * 12;
        double yearExpenses = totalExpenses * 12;
        double yearSavings = yearIncome - yearExpenses;


        System.out.println("====MONTH====");
        System.out.println("Income: " + salary);
        System.out.println("Expenses: " + totalExpenses);
        System.out.println("Money left: " + moneyLeft);

        System.out.println("====YEAR====");
        System.out.println("Income: " + yearIncome);
        System.out.println("Expenses: " + yearExpenses);
        System.out.println("Savings " + yearSavings);

    }
}
