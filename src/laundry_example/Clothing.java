package laundry_example;

public class Clothing {

    // #region Class members
    private String article;
    private String color;
    private String size;
    private String material;
    private double cost;
    private int durability;
    private boolean isWet = false;
    private int stains = 0;
    // #endregion

    // #region Constructors
    public Clothing() {
        article = "jeans";
        color = "blue";
        size = "M";
        material = "cotton";
        cost = 30.00;
        durability = 50;
    }

    public Clothing(String article, String color, String size, String material,
            double cost, int durability) {
        this.article = article;
        this.color = color;
        this.size = size;
        this.material = material;
        this.cost = cost;
        this.durability = durability;
    }
    // #endregion

    // #region Getters and Setters

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getStains() {
        return stains;
    }

    public boolean isWet() {
        return isWet;
    }

    // #endregion

    // #region Methods

    public void wash() {
        isWet = true;
    }

    public void dry() {
        if (isWet) {
            durability -= 1;
            isWet = false;
            stains = 0;
        } else {
            System.err.println("Wash the cloth first!");
        }
    }

    public void stain() {
        stains += 1;
        durability -= 1;
    }

    public boolean isRaggedy() {
        return durability <= 10 ? true : false;
    }

    public boolean isComfy() {
        return durability >= 40 ? true : false;
    }

    public boolean isPresentable() {
        return durability >= 30 && stains < 3 ? true : false;
    }

    // #endregion

}
