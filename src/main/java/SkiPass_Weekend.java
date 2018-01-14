public class SkiPass_Weekend extends SkiPass {
    public SkiPass_Weekend(Days amountOfDays){
        if(amountOfDays.Amount()>2){
            System.out.println("You can't choose more than two day in SkiPass Weekend." +
                    "If you wanna do that, you can choose SkiPass Weekday");
            this.setDayCounter(Days.DAYS_0);
            this.setRideCounter(Rides.RIDES_0);
            this.setWorked(false);
        } else {
            this.setDayCounter(amountOfDays);
            this.setRideCounter(Rides.INFINITY_RIDES);
        }

    }

    public SkiPass_Weekend(Rides amountOfRides){
        this.setRideCounter(amountOfRides);
        this.setDayCounter(Days.INFINITY_DAYS);
    }
}
