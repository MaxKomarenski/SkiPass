public class SkiPass_Weekdays extends SkiPass {
    public SkiPass_Weekdays(Days amountOfDays){
        this.setDayCounter(amountOfDays);
        this.setRideCounter(Rides.INFINITY_RIDES);
    }

    public SkiPass_Weekdays(Rides amountOfRides){
        this.setRideCounter(amountOfRides);
        this.setDayCounter(Days.INFINITY_DAYS);
    }
}
