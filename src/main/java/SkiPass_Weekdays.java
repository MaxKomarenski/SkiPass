public class SkiPass_Weekdays extends SkiPass {
    public SkiPass_Weekdays(Days amountOfDays){
        this.setDayCounter(amountOfDays);
        this.getDayCounter().setAmountOfDays(amountOfDays.Amount());
        this.setRideCounter(Rides.INFINITY_RIDES);
        this.getRideCounter().setAmountOfRides(Rides.INFINITY_RIDES.Amount());

    }

    public SkiPass_Weekdays(Rides amountOfRides){
        this.setRideCounter(amountOfRides);
        this.getRideCounter().setAmountOfRides(amountOfRides.Amount());
        this.setDayCounter(Days.INFINITY_DAYS);
        this.getDayCounter().setAmountOfDays(Days.INFINITY_DAYS.Amount());

    }
}
