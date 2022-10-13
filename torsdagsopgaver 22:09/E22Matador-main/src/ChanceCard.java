public class ChanceCard {
    String text;
    int expenses;
    int income;

    public ChanceCard(String text, int expenses, int income) {
        this.text = text;
        this.expenses = expenses;
        this.income = income;
    }

    public String getText() {
        return text;
    }

    public int getExpenses() {
        return expenses;
    }

    public int getIncome() {
        return income;


        }
        @Override
    public String toString() {
        return "Chance card: " + text;
    }
}

