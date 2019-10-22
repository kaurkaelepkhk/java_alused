public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    public double payEconomical() {
        return this.balance >= 2.50 ? this.balance -= 2.50 : this.balance;
    }
    public double payGourmet() {
        return this.balance >= 4.00 ? this.balance -= 4.00 : this.balance;
    }
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
