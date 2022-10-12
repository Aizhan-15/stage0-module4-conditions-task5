package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int year1 = 2020;
        if (year1 % 400 == 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
