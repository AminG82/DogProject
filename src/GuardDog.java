public class GuardDog extends Dog {

    private boolean isAngry;
    public GuardDog(String name , Integer age , boolean isAngry){
        super(name, age);
        this.isAngry = isAngry;
    }

    @Override
    public void bark(){
        System.out.println(getName() + " says haaaaaaaaaaaaa!");
    }
}
