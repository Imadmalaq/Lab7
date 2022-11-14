public class ResidentialSite extends Site{
    private double _units;
    private double _rate;

    public ResidentialSite(){
        _units = 5.0;
        _rate = 3.5;
    }
    public double getBillableAmount(){
        double base = getTaxAmount(_units, _rate);
        double tax = getTaxAmount(base, Site.TAX_RATE);
        return base + tax;
    }

    private double getTaxAmount(double base, double taxRate) {
        double tax = getBaseAmount(base, taxRate);
        return tax;
    }

    private double getBaseAmount(double _units, double _rate) {
        double base = _units * _rate;
        return base;
    }
}
