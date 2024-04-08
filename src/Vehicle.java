class Vehicle {
    public void drive(){
        System.out.println("Vehicle is drive");
    }
}
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("car is drive");
    }
    public void breakCar(){
        System.out.println("car is breaked");
    }
}
class Test2{
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.drive();
        Car c= (Car) v;
        c.drive();
        c.breakCar();
    }
}