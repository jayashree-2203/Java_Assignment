package assignment_arrays;

public class Bird_Watcher {
    private final int[] birdsPerDay;

    public Bird_Watcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int days) {
        int total = 0;
        days = Math.min(days, birdsPerDay.length);
        for (int i = 0; i < days; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                count++;
            }
        }
        return count;
    }
}
