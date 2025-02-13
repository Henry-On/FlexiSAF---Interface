
interface TimeCalculator {
    int HOURS_IN_A_DAY = 24;
    float calculateHours(float day);
    float convertHoursToMinutes(float hour);
}

class DayHours implements TimeCalculator {
    @Override
    public float calculateHours(float day) {
        float hours = day * (float)HOURS_IN_A_DAY;
        return hours;
    }

    public float convertHoursToMinutes(float hour) {
        return hour * 60;
    }

    public int hoursInOneDay() {
      return HOURS_IN_A_DAY;
    }
}

class HoursCalculator {
    public static void main(String[] args) {
        TimeCalculator day = new DayHours();
        System.out.println("Total hours in a half day day: " + day.calculateHours(0.5f));
        System.out.println("Total hours in a day: " + day.calculateHours(1));
        System.out.println("Total hours in 30 days: " + day.calculateHours(30));
        System.out.println("Total minutes in 1 day: " + day.convertHoursToMinutes(24));
    }
}
