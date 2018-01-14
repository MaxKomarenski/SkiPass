import java.util.Random;

public abstract class SkiPass {
    private Days dayCounter;
    private Rides rideCounter;
    private String id;
    private boolean worked;

    public SkiPass(){
        id = createID();
        worked = true;
    }

    public static String createID(){
        Random random = new Random();
        StringBuilder id = new StringBuilder();
        for(int i = 0; i < 10; i++){
            int num = random.nextInt(9);
            id.append(num);
        }
        return id.toString();
    }


    public String getId() {
        return id;
    }

    public int getAmountOfDays() {return dayCounter.getAmountOfDays();}

    public Days getDayCounter() {
        return dayCounter;
    }

    public void setDayCounter(Days dayCounter) {
        this.dayCounter = dayCounter;
    }

    public Rides getRideCounter() {
        return rideCounter;
    }

    public int getAmountOfRides() {return rideCounter.getAmountOfRides();}

    public void setRideCounter(Rides rideCounter) {
        this.rideCounter = rideCounter;
    }

    public boolean isWorked() {
        return worked;
    }

    public void setWorked(boolean worked) {
        this.worked = worked;
    }
}
