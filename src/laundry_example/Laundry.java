package laundry_example;

public class Laundry {

    // #region Class Members

    private Clothing[] clothes;
    private String washTemp = "mild";
    private String dryTemp = "mild";
    private double washTime = 40.00;
    private double dryTime = 40.00;

    // #endregion

    // #region Constructors

    public Laundry(Clothing[] clothes) {
        this.clothes = clothes;
    }

    public Laundry(Clothing[] clothes, String washTemp, String dryTemp,
            double washTime, double dryTime) {
        this.clothes = clothes;
        this.washTemp = washTemp;
        this.dryTemp = dryTemp;
        this.washTime = washTime;
        this.dryTime = dryTime;
    }

    // #endregion Constructors

    // #region Getters and Setters

    public Clothing[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothing[] clothes) {
        this.clothes = clothes;
    }

    public String getWashTemp() {
        return washTemp;
    }

    public void setWashTemp(String washTemp) {
        this.washTemp = washTemp;
    }

    public String getDryTemp() {
        return dryTemp;
    }

    public void setDryTemp(String dryTemp) {
        this.dryTemp = dryTemp;
    }

    public double getWashTime() {
        return washTime;
    }

    public void setWashTime(double washTime) {
        this.washTime = washTime;
    }

    public double getDryTime() {
        return dryTime;
    }

    public void setDryTime(double dryTime) {
        this.dryTime = dryTime;
    }

    // #endregion

    // #region Methods

    public void wash() {
        for (Clothing cloth : clothes) {
            cloth.wash();
        }

        try {
            Thread.sleep(100 * (int) washTime);
            // if washTime = 45.5, 4.5 seconds of wait!
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("The clothes are washed (washed in " + washTime + " minutes)");
    }

    public void dry() {
        for (Clothing cloth : clothes) {
            if (!cloth.isWet()) {
                cloth.wash();
            }
            cloth.dry();
        }
        try {
            Thread.sleep(100 * (int) dryTime);
            // if dryTime = 100.5, 10 seconds of wait!
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("The clothes are dry (dried in " + dryTime + " minutes)");
    }

    public boolean isColdCycle() {
        return dryTemp == "cold" && washTemp == "cold" ? true : false;
    }

    public boolean isWarmCycle() {
        return dryTemp == "warm" && washTemp == "warm" ? true : false;
    }

    public int loadSize() {
        return clothes.length;
    }

    // #endregion

}
