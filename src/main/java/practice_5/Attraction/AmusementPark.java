package practice_5.Attraction;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showInfo() {
        System.out.println(attraction.info());
    }

    public void performMaintaince() {
        attraction.maintain();
    }
}
