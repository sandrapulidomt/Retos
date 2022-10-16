package Reto3y4.Controlador.Custom;

public class StarsAmount {
    private int stars;
    private int amount;

    public StarsAmount(int stars, int amount){
        this.stars = stars;
        this.amount=amount;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
