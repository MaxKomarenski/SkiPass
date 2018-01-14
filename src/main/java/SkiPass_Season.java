public class SkiPass_Season extends SkiPass {
    public SkiPass_Season(){
        this.setDayCounter(Days.SEASON);
        this.getDayCounter().setAmountOfDays(Days.SEASON.Amount());
        this.setRideCounter(Rides.INFINITY_RIDES);
        this.getRideCounter().setAmountOfRides(Rides.INFINITY_RIDES.Amount());
    }
}
