package designpatterns16.items;

public class Vaccine extends Consumable{
    protected Double dosageMl;

     public Vaccine(String name, String type, Double pricePerUnit, Double dosageMl) {
        super(name, type, pricePerUnit);
        this.dosageMl = dosageMl;
    }

    public Double getDosageMl() {
        return dosageMl;
    }

    public void setDosageMl(Double dosageMl) {
        this.dosageMl = dosageMl;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", pricePerUnit=" + pricePerUnit +
               ", dosageMl=" + dosageMl +
               '}';
    }
}
