package guitar.app;

import java.util.Iterator;

public class TestDriverGuitar {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        khoiTaoInventory(inventory);
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 120, Wood.ALDER,
                Wood.ALDER, "alo");

        Iterator<Guitar> iterator = inventory.searchGuitar(guitarSpec);
        if (iterator != null) {

            while (iterator.hasNext()) {
                Guitar guitar = (Guitar) iterator.next();
                System.out.println(guitar.toString());
            }
        } else {
            System.out.println("not found");
        }

    }

    private static void khoiTaoInventory(Inventory inventory) {

        inventory.addGuitar("11277", 3999.95,
                new GuitarSpec(Builder.COLLINS, "CJ", Type.ACOUSTIC, 229, Wood.INDIAN_ROSEWOOD, Wood.SITKA, "kaka"));
        inventory.addGuitar("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 120, Wood.ALDER, Wood.ALDER, "kak"));
        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 120, Wood.ALDER, Wood.ALDER, "ghe ghe"));
        inventory.addGuitar("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 321, Wood.MAHOGANY, Wood.ADRIONDACK, "ghe "));
        inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 034,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADRIONDACK, "ok d"));
        inventory.addGuitar("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 073, Wood.MAHOGANY, Wood.MAPLE, "hihi"));
        inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 2350,
                Wood.CEDAR, Wood.MAHOGANY, "haha"));
        inventory.addGuitar("77023", 6275.95, new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 330,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADRIONDACK, "hoho"));
        inventory.addGuitar("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 350, Wood.INDIAN_ROSEWOOD, Wood.CEDAR, "haha"));
        inventory.addGuitar("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 842, Wood.COCOBOLO, Wood.CEDAR, "lele"));
        inventory.addGuitar("6 29584", 2100.95, new GuitarSpec(Builder.RYAN, "Dave Navarro Signature", Type.ELECTRIC,
                9212, Wood.MAHOGANY, Wood.MAPLE, "co cc"));
    }
}