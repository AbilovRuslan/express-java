package practice_5.BotanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant){
        this.plant = plant;
    }

    public void maingainPlant(){
        plant.care();
    }

}
