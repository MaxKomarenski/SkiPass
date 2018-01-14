public class Turnstile {
    private int passed;
    private int notPassed;

    private SystemOfIssuance systemOfIssuance;

    Turnstile(SystemOfIssuance systemOfIssuance){
        passed = 0;
        notPassed = 0;
        this.systemOfIssuance = systemOfIssuance;
    }

    public boolean turnstile(SkiPass sp){
        if(!sp.isWorked()){
            System.out.println("Your SkiPass isn't worked.");
            notPassed += 1;
            return false;
        } else if(sp.getDayCounter().getAmountOfDays() < 1){
            System.out.println("You haven't days to use SkiPass.");
            block(sp);
            notPassed += 1;
            return false;

        } else if(sp.getRideCounter().getAmountOfRides() < 1){
            System.out.println("You haven't rides to use SkiPass.");
            block(sp);
            notPassed += 1;
            return false;
        }
        System.out.println("OK");
        passed += 1;
        sp.getDayCounter().setAmountOfDays(sp.getDayCounter().getAmountOfDays() - 1);
        sp.getRideCounter().setAmountOfRides(sp.getRideCounter().getAmountOfRides() - 1);
        return true;
    }

    public void block(SkiPass spBlock){
        spBlock.setWorked(false);
    }

    public int getNotPassed() {
        return notPassed;
    }

    public void setNotPassed(int notPassed) {
        this.notPassed = notPassed;
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public SystemOfIssuance getSystemOfIssuance() {
        return systemOfIssuance;
    }

    public void setSystemOfIssuance(SystemOfIssuance systemOfIssuance) {
        this.systemOfIssuance = systemOfIssuance;
    }
}
