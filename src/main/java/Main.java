public class Main {
    public static void main(String[] args) {
        SkiPass sp = new SkiPass_Weekend(Days.DAYS_2);
        System.out.println(sp.getDayCounter());
        System.out.println(sp.getRideCounter());
        System.out.println(sp.getId());
        System.out.println(sp.isWorked());

        System.out.println("-------------");

        Turnstile turnstile = new Turnstile(new SystemOfIssuance());
        turnstile.turnstile(sp);

        System.out.println("----------");
        SkiPass sp2 = new SkiPass_Weekend(Days.DAYS_3);
        turnstile.turnstile(sp2);

        System.out.println("----------");
        SkiPass sp3 = new SkiPass_Weekend(Days.DAYS_0);
        turnstile.turnstile(sp3);

    }
}
