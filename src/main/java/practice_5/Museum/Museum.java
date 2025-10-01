package practice_5.Museum;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showDescription() {
        System.out.println(exhibit.describe());
    }

    public void showPreserve() {
        exhibit.preserve();
    }
}
