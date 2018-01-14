public enum Rides {
    RIDES_0, RIDES_10, RIDES_20, RIDES_50, RIDES_100, INFINITY_RIDES;

    public Integer Amount(){
        switch (this){
            case RIDES_0: return 0;
            case RIDES_10: return 10;
            case RIDES_20: return 20;
            case RIDES_50: return 50;
            case RIDES_100: return 100;
            case INFINITY_RIDES:
                return Integer.MAX_VALUE;
            default: return 0;
        }
    }
}
