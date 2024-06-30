public class Car {
    private int yearProduction;
    private String model;

    public Car(int yearProduction, String model) {
        setModel(model);
        setYearProduction(yearProduction);
    }

    public int compareTo(Car car) {
        if (this.yearProduction > car.yearProduction) {
            return 1;
        }
        if (this.yearProduction == car.yearProduction) {
            return 0;
        }
        if (this.yearProduction < car.yearProduction) {
            return -1;
        }
        return 0;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
