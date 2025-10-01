package practice_5.Museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.setExhibit(new Manuscript());
        museum.showDescription();
        museum.showPreserve();


        museum.setExhibit(new Sculpture());
        museum.showDescription();
        museum.showPreserve();
    }
}
