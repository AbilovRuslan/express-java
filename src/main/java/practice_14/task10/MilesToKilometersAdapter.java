package practice_14.task10;

public class MilesToKilometersAdapter implements Distance {
    private Miles miles;
    public MilesToKilometersAdapter(Miles miles) { this.miles = miles; }
    public double getValue() { return miles.getValue() * 1.60934; }
}

