class Animal {
    public void eat(){
        System.out.println("Omnivorous dieting");
    }
}
class Lion extends Animal{
    @Override
    public void eat() {
        System.out.println("Carnivorous dieting ");
    }
}
class Test{
    public static void main(String[] args) {
        Animal a=new Lion();
        a.eat();
    }
}
