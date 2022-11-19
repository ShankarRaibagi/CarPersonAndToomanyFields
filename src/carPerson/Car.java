package carPerson;

public class Car {
    public String model;
    public int productionyear;

    public Car(String model, int productionyear){
        this.model = model;
        this.productionyear = productionyear;

    }

    public String getName()
    {
        return model;
    }

    public int getAge() {
        return productionyear;
    }

    @Override
    public String toString() {
        return ("The model is "+model + "in" + productionyear);
    }
}