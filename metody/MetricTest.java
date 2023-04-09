package metody;

public class MetricTest {

    public static void main(String[] args) {
        LengthConverter converter = new LengthConverter();
        double m = 2.5;
        double mToCm = converter.metersToCm(m);
        double mToMm = converter.metersToMm(m);
        double cmToM = converter.cmToMeters(mToCm);
        double mmToM = converter.mmToMeters(mToMm);
        System.out.println(m + "m to " + mToCm + "cm i " + mToMm + "mm");
        System.out.println(mToCm + "cm to " + cmToM + "m");
        System.out.println(mToMm + "mm to " + mmToM +"m");
    }
    }

