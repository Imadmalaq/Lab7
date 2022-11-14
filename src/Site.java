public abstract class Site {
    protected static double TAX_RATE = 1.15;

    public Site() {
    }

    public double getBillableAmount(double _units, double _rate, double base, double taxRate) {
        return getBaseAmount(_units,_rate) + getTaxAmount(base,taxRate);
    }

    protected abstract double getTaxAmount(double base, double taxRate);

    protected abstract double getBaseAmount(double _units, double _rate);
}
