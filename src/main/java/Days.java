public enum Days{
    SEASON, DAYS_0, DAYS_1, DAYS_2, DAYS_3, DAYS_4, DAYS_5, INFINITY_DAYS;

    private int amountOfDays;

    Days(){

    }

    Days(int amountOfDays){
        this.amountOfDays = amountOfDays;
    }

    public Integer Amount() {
        switch (this){
            case SEASON: return 90;
            case DAYS_0: return 0;
            case DAYS_1: return 1;
            case DAYS_2: return 2;
            case DAYS_3: return 3;
            case DAYS_4: return 4;
            case DAYS_5: return 5;
            case INFINITY_DAYS:
                return Integer.MAX_VALUE;
            default: return  10;
        }
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }
}
