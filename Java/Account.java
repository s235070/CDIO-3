public class Account {
    int cash;

    public Account() {
        this.cash = 0;
    }

    public boolean addCash(int cash) {
        if (this.cash + cash < 0) {
            Bankruptcy.setBankruptcy();
            return false;
        }

        this.cash += cash;
        return true;
    }

    public int getCash() {
        return this.cash;
    }
}