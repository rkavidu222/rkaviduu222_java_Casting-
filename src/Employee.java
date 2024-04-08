class Employee {
    String name;
    public void print(){
        System.out.println("Employee print method");
    }
}
class SE extends Employee{
    int age;

    @Override
    public void print() {
        System.out.println("SE print method");
    }
}
class Test3{
    public static void main(String[] args) {
        Employee e =new SE();
        e.name="Kavi";
        SE s=(SE) e;
        s.age=23;
        System.out.println("Employee name is :- "+s.name);
        System.out.println("Employee age is  :- "+s.age);
        s.print();

    }
}