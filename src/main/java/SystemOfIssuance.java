import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SystemOfIssuance {
    private ArrayList<SkiPass> listOfAllSkiPasses;
    private HashMap<String, Days> daysHashMap;
    private HashMap<String, Rides> ridesHashMap;

    SystemOfIssuance(){
        listOfAllSkiPasses = new ArrayList<SkiPass>();
        daysHashMap = new HashMap<String, Days>();
        ridesHashMap = new HashMap<String, Rides>();

        daysHashMap.put("1", Days.DAYS_1);
        daysHashMap.put("2", Days.DAYS_2);
        daysHashMap.put("3", Days.DAYS_3);
        daysHashMap.put("4", Days.DAYS_4);
        daysHashMap.put("5", Days.DAYS_5);

        ridesHashMap.put("10", Rides.RIDES_10);
        ridesHashMap.put("20", Rides.RIDES_20);
        ridesHashMap.put("50", Rides.RIDES_50);
        ridesHashMap.put("100", Rides.RIDES_100);

    }

    public SkiPass getSkiPass(){
        SkiPass sp = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 1 if you wanna get SkiPass Weekday" +
                " Enter 2 if you wanna get Ski Pass Weekend" +
                " Enter 3 if you wanna get Ski Pass Season");
        String input = scanner.nextLine();
        if(input.equals("1")){
            sp = getSkiPass_Weekday();
        }else if(input.equals("2")){
            sp = getSkiPass_Weekend();
        }else if(input.equals("3")){
            sp = getSkiPass_Season();
        }
        listOfAllSkiPasses.add(sp);
        return sp;

    }

    public SkiPass_Weekend getSkiPass_Weekend(){
        System.out.println("___________________");

        System.out.println("You chosen a SkiPass Weekend now you should choose how many days you wanna have or " +
                "how many rides.");
        System.out.println("___________________");

        System.out.println("Please Enter:");
        System.out.println("if you enter 1 than you can choose amount of days and get infinity amount of rides.");
        System.out.println("if you enter 2 than you can choose amount of rides and get infinity amount of days.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("1")){
            System.out.println("___________________");
            System.out.println("To choose amount of day, enter 1 or 2.");
            String amountOfDays = scanner.nextLine();
            return new SkiPass_Weekend(daysHashMap.get(amountOfDays));
        } else if(input.equals("2")){
            System.out.println("___________________");
            System.out.println("To choose amount of rides, enter 10 20 50 or 100.");
            String amountOfRides = scanner.nextLine();
            return new SkiPass_Weekend(daysHashMap.get(amountOfRides));
        } else {
            return null;
        }

    }

    public SkiPass_Weekdays getSkiPass_Weekday(){
        System.out.println("___________________");

        System.out.println("You chosen a SkiPass Weekday now you should choose how many days you wanna have or " +
                "how many rides.");
        System.out.println("___________________");

        System.out.println("Please Enter:");
        System.out.println("if you enter 1 than you can choose amount of days and get infinity amount of rides.");
        System.out.println("if you enter 2 than you can choose amount of rides and get infinity amount of days.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("1")){
            System.out.println("___________________");
            System.out.println("To choose amount of day, enter 1 2 3 4 or 5.");
            String amountOfDays = scanner.nextLine();
            return new SkiPass_Weekdays(daysHashMap.get(amountOfDays));
        } else if(input.equals("2")){
            System.out.println("___________________");
            System.out.println("To choose amount of rides, enter 10 20 50 or 100.");
            String amountOfRides = scanner.nextLine();
            return new SkiPass_Weekdays(daysHashMap.get(amountOfRides));
        } else {
            return null;
        }
    }

    public SkiPass_Season getSkiPass_Season(){
        System.out.println("You chosen SkiPass Season, so now you have 90 of days and infinity amount of rides");
        return new SkiPass_Season();
    }



}
