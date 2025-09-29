public class TimeConvert{
    public static void main(String[] args) {
        int totalSeconds = 3665;  

        int hours = totalSeconds / 3600;              
        int minutes = (totalSeconds % 3600) / 60;     
        int seconds = totalSeconds % 60;              
        System.out.println(totalSeconds + " seconds = " +
                           hours + " hour(s) " +
                           minutes + " minute(s) " +
                           seconds + " second(s)");
    }
}
