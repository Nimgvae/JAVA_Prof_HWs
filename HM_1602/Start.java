package HM_1602;
/*
Описание занятия: Представьте, что Вы живете в Берлине и собираетесь поехать в Мюнхен. Вам необходимо создать enum,
в котором будут такие варианты передвижения как: самолет, поезд, автомобиль, велосипед и пешком. Вам необходимо создать такой enum,
в котором в качестве конструктора задавалась бы продолжительность поездки, в зависимости от способа передвижения. Значение будет задаваться
в часах (дробное число, можно задать приближённое значение, либо попробовать найти лучший вариант на google maps).
Помимо этого, в этом enum необходимо создать метод для получения информации о продолжительности поездки в днях, часах, минутах и секундах (разными методами)
 */

public class Start {
    public static void main(String[] args) {
        Trip  trip1 =  Trip.Walk;
        trip1.dayDuration(trip1);
        trip1.hourDuration(trip1);
        trip1.secDuration(trip1);
    }
}
