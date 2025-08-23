package practice_5.Attraction;

public class RollerCoaster implements Attraction{
    @Override
    public String info(){
        return "Ты сейчас описаешься от восторга!!! ну или нет)))";
    }
    @Override
    public void maintain(){
        System.out.println("Сел? сам виноват! ПОЕХАЛИИИИИИ");
    }
}
