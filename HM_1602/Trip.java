package HM_1602;

public enum Trip {
    Walk(118), Car(8), Fly(1),Train(5),Bike(37);
    private int time;
    Trip(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }
    public void dayDuration(Trip trip){
        if(trip.time<24){
            System.out.println("Ваша поездка продлится менее суток.");
        }
        else System.out.println("Ваша поездка продлится: " + trip.time/24 + " "+"дней");
    }
    public void hourDuration(Trip trip){
        System.out.println("Ваша поездка продлится: " + trip.time + " "+ "часов.") ;
    }
    public void minutDuration(Trip trip){
        System.out.println("Ваша поездка продлится: " + (trip.time*60) + " "+ "часов.") ;
    }
    public void secDuration(Trip trip){
        System.out.println("Ваша поездка продлится: " + ((trip.time*60)*60) + " "+ "секунд.") ;
    }




}
