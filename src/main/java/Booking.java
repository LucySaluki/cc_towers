public class Booking {
    private int nights;
    private Bedroom bedroom;
    private int numberGuests;

    public Booking(int nights, Bedroom bedroom){
        this.nights=nights;
        this.bedroom = bedroom;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public double calculateBill(){
        return this.nights * this.bedroom.getRateFromEnum();
    }
}
