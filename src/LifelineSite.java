public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    public LifelineSite(){
        _units = 5.0;
        _rate = 3.5;
    }

    @Override
    protected double getTaxAmount(double base, double taxRate) {
        double tax = getBaseAmount(base, taxRate);
        return tax;
    }

    @Override
    protected double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate * 0.2;
        return base;
    }
}
