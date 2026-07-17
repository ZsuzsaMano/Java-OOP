package s3;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWorkday;

    private Weekday(boolean isWorkday) {
        this.isWorkday = isWorkday;
    }

    public Weekday[] weekArr = Weekday.values();
    int l = weekArr.length;

    public Weekday nextDay(Weekday day) {
        int i = day.ordinal();
        return weekArr[(i + 1) % l];
    }

    public Weekday previousDay(Weekday day) {
        int i = day.ordinal();
        return weekArr[(i - 1) % l];
    }

    @Override
    public String toString() {
        switch (this) {
            case MONDAY:
                return "Mo";
            case TUESDAY:
                return "Tu";
            case WEDNESDAY:
                return "We";
            case THURSDAY:
                return "Th";
            case FRIDAY:
                return "Fr";
            case SATURDAY:
                return "Sa";
            case SUNDAY:
                return "Su";
            default:
                return "";
        }
    }

    public boolean isWorkday(Weekday day) {
        return day.isWorkday;
    }

}
