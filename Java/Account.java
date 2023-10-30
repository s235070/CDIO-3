public class Account {
    int cash;

    public Account() {
        this.cash = 0;
    }

    public void addCash(int cash) {
        if (this.cash + cash < 0)
            Bankruptcy.setBankruptcy();

        this.cash += cash;
    }

    public int getCash() {
        return this.cash;
    }
}