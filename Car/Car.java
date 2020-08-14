class CarBluePrint {
    protected String color;

    public CarBluePrint(String color) {
        this.color = color;
    } 

    public String getCarColor() {
        return this.color;
    }

    
}

class Car {
    public static void main(String args[]) {
        CarBluePrint newCar = new CarBluePrint("Pink");
        System.out.println("Car Color: " + newCar.getCarColor());
        setCarColorToBlue(newCar);
        System.out.println("Car Color: " + newCar.getCarColor());
    }

    public static void setCarColorToBlue(CarBluePrint c){
        c.color = "Blue";
    }
    
}