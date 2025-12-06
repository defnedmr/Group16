package designpatterns16.items;

public class Serum extends Consumable{
    protected Double capacityMl;

    public Serum(String name, String type, Double pricePerUnit, Double capacityMl) {
        super(name, type, pricePerUnit);
        this.capacityMl = capacityMl;
    }

    public Double getCapacityMl() {
        return capacityMl;
    }

    public void setCapacityMl(Double capacityMl) {
        this.capacityMl = capacityMl;
    }

    @Override
    public String toString() {
        return "Serum{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", pricePerUnit=" + pricePerUnit +
               ", capacityMl=" + capacityMl +
               '}';
    }
}
