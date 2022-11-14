public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    public LifelineSite(){
        _units = 5.0;
        _rate = 3.5;
    }
    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
