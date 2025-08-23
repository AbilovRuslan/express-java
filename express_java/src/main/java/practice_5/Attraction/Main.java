package practice_5.Attraction;

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        park.setAttraction(new RollerCoaster());
        park.showInfo();
        park.performMaintaince();

        park.setAttraction(new Carousel());
        park.showInfo();
        park.performMaintaince();
    }
}
