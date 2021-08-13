package guitar.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitarList;

    public Inventory() {
        this.guitarList = new ArrayList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, guitarSpec, price);
        guitarList.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitarList.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Iterator<Guitar> searchGuitar(GuitarSpec searchGuitarSpec) {
        List<Guitar> list = new ArrayList<Guitar>();
        for (Iterator<Guitar> i = guitarList.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if (guitarSpec.matches(searchGuitarSpec)) {

                list.add(guitar);
            }
        }
        return list.iterator();
    }

}