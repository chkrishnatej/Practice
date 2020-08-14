class Car {
    public String name;
    public int horsePower;

    public Car(String n, int hp) {
        this.name = n;
        this.horsePower = hp;
    }

    public void showDetails() {
        System.out.println("Car name: "+ this.name);
        System.out.println("Car HorsePower: " + this.horsePower);
    }
}

class Check {
    public static void main(String args[]) {
        Car newCar =new Car("Ferrari", 320);
        newCar.showDetails();
    }
}