import java.util.ArrayList;

public abstract class Room {
    int capacity;
    ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity=capacity;
        this.guests= new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        if (this.guestCount()!=this.capacity){
        this.guests.add(guest);}
    }

    public int guestCount(){
        return this.guests.size();
    }

    public void removeGuests(){
        if (this.guestCount()>=1){
            this.guests.clear();
        }
    }

    public void removeSpecificGuest(Guest guest){
        if (this.guestCount()>=1){
            this.guests.remove(guest);
        }
    }
}
