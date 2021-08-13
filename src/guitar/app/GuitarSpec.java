package guitar.app;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Wood backWood, topWood;
    private Type type;
    private int numString;
    private String namString;

    public GuitarSpec() {
    }

    public GuitarSpec(Builder builder, String model, Type type, int numString, Wood backWood, Wood topWood,
            String namString) {
        this.model = model;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.type = type;
        this.numString = numString;
        this.namString = namString;
    }

    public boolean matches(GuitarSpec searchGuitarSpec) {
        if (this.builder != searchGuitarSpec.getBuilder()) {
            return false;
        }
        String molder = searchGuitarSpec.getModel().toLowerCase();
        if (molder != null && !molder.equals("") && !molder.equals(this.model.toLowerCase())) {
            return false;
        }
        if (this.type != searchGuitarSpec.getType()) {
            return false;
        }
        if (this.backWood != searchGuitarSpec.getBackWood()) {
            return false;
        }
        if (this.topWood != searchGuitarSpec.getTopWood()) {
            return false;
        }
        int numString = searchGuitarSpec.numString;
        if (numString != 0 && this.numString != numString) {
            return false;
        }

        return true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumString() {
        return numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    @Override
    public String toString() {
        return "GuitarSpec [backWood=" + backWood + ", builder=" + builder + ", model=" + model + ", namString="
                + namString + ", numString=" + numString + ", topWood=" + topWood + ", type=" + type + "]";
    }

}
