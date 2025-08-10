public class Puppy extends Dog{
    private boolean isTrained;

    public Puppy(String name , Integer age , boolean isTrained){
        super(name,age);
        this.isTrained = isTrained;
    }
    public void play(){
        System.out.println(getName() + " is now playing!");
    }

    @Override
    public void bark(){
        System.out.println(getName() + " says Yip!");
    }
}
