public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static Week getByValue(int value) {
        Week[] all = Week.values();
        if (value > 0 && value <= all.length) {
            return all[value - 1];
        }
        return null;
    }
}
