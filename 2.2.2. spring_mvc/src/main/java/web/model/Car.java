package web.model;

public class Car {
    private String carModel;
    private int madeYear;
    private int horsesPower;

    public Car(String carModel, int madeYear, int horsesPower) {
        this.carModel = carModel;
        this.madeYear = madeYear;
        this.horsesPower = horsesPower;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public int getHorsesPower() {
        return horsesPower;
    }

    public void setHorsesPower(int horsesPower) {
        this.horsesPower = horsesPower;
    }

    public String toString() {
        return getCarModel() + " " + getMadeYear() + " " + getHorsesPower();
    }
}
