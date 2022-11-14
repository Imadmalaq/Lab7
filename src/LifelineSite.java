public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    public LifelineSite(){
        _units = 5.0;
        _rate = 3.5;
    }
    private double getTaxAmount(double base, double taxRate, double x) {
        double tax = getBaseAmount(base, taxRate, x);
        return tax;
    }

    private double getBaseAmount(double _units, double _rate, double x) {
        double base = _units * _rate * x;
        return base;
    }
}
