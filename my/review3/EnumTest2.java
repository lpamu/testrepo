package my.review3;
public class EnumTest2 {
    Day day;
    
    public EnumTest2(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest2 firstDay = new EnumTest2(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest2 thirdDay = new EnumTest2(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest2 fifthDay = new EnumTest2(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest2 sixthDay = new EnumTest2(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest2 seventhDay = new EnumTest2(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
