package laundry_example;

public class Laundromat {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("jeans", "black", "medium", "cotton", 40.00, 45);
        Clothing shorts = new Clothing("shorts", "camo", "large", "polyester", 28.00, 30);
        Clothing trunks = new Clothing("trunks", "blue", "medium", "nylon-poly blend", 20, 35);
        Clothing socks = new Clothing("socks", "white", "medium", "cotton-wool blend", 4.00, 15);
        Clothing graphicTee = new Clothing("t-shirt", "mixed", "large", "polyester", 15.00, 20);
        Clothing hat = new Clothing("headwear", "crimson", "medium", "hard-polyester", 25.00, 45);

        Clothing[] myClothes = { jeans, shorts, trunks, socks, graphicTee, hat };
        Laundry laundry = new Laundry(myClothes);

        // Setting up washing conditions
        laundry.setDryTemp("warm");
        laundry.setWashTemp("warm");
        laundry.setWashTime(40);
        laundry.setDryTime(60);

        // Washing
        laundry.wash();

        // Drying a single cloth
        graphicTee.dry();

        // Drying all clothes
        laundry.dry();

        // Checking durability of graphic tee, should be 18 since we dried it once
        // alone, and once with the load! (20-2)
        System.out.println("The durability of the graphic tee is: " + graphicTee.getDurability());

        System.out.println("____________________________________________________________________\n");

        // Testing out stains, presentability, and washing mechanics
        jeans.stain();
        jeans.stain();

        System.out.println("The jeans have " + jeans.getStains() + " stains.");

        String presentable = jeans.isPresentable() ? "Jeans are presentable" : "Jeans are not presentable";
        System.out.println(presentable);
        jeans.stain();
        presentable = jeans.isPresentable() ? "Jeans are presentable" : "Jeans are not presentable";
        System.out.println("1 stain later : " + presentable);

        jeans.wash();
        jeans.dry();

        System.out.println("After a wash and dry cycle the jeans have " + jeans.getStains() + " stains!");

        // The jeans were washed once in the initial laundry wash, stained thrice, and
        // then dried so the durability should be (45-1-3-1) 40
        System.out.println("However the durability of the jeans is now: " + jeans.getDurability() + ".");

        // The jeans do not have a durability under 40, so they will be comfy for now!
        String comfy = jeans.isComfy() ? "comfy!" : "not comfy :( ";

        System.out.println("The jeans are still " + comfy);

        jeans.stain();

        comfy = jeans.isComfy() ? "comfy!" : "not comfy :( ";

        // durabity of jeans after the stain should be 39 which is less than 40, so the
        // jeans should no longer be comfy!
        System.out.println("After 1 stain: The jeans are " + comfy);

        System.out.println("____________________________________________________________________\n");

        // Testing the raggedy method on a clothing item

        // After the laundry cycle the durability of the socks should be 15-1 = 14!
        System.out.println("The durability of the socks is " + socks.getDurability() + ".");
        // The socks should not be raggedy since their durability is greater than 10
        System.out.println("The socks are still " + (socks.isRaggedy() ? "raggedy" : "not raggedy"));

        socks.stain();
        socks.stain();
        socks.stain();
        socks.stain();

        // Now the durability of the socks is 14-4 = 10, which makes them raggedy!
        System.out.println("4 stains later: The socks are " + (socks.isRaggedy() ? "raggedy" : "not raggedy"));

        System.out.println("____________________________________________________________________\n");

    }
}
