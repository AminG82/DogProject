public class Dog {
    private String name;
    private Integer age;
    private Integer energy;

    public Dog(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
        energy = 100;
    }
    public String  getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isBlank()){
            System.out.println("name is not set!");
        }else {
            this.name = name;
        }

    }
    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0 && age <= 20) {     //a dog cant live more than 20 years
            this.age = age;
        }
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        if (energy >= 0 && energy <= 100) {
            this.energy = energy;
        }
    }



    public void bark() {
        if (energy <= 10) {
            System.out.printf(" %s is too tired. Needs to rest.%n", getName());
        } else {
            setEnergy(energy - 10);
            System.out.printf(" %s says Woof! (Energy left: %s)%n", getName(), getEnergy());
            //        Every bark costs **10 energy** (energy decreases).
        }

    }

    public void eat() {
        if (energy > 80) {
            System.out.printf(" %s is not hungry%n", name);
        } else {
            setEnergy(energy += 20);
            System.out.printf(" %s is eating! (Energy restored: %s)%n", getName(),getEnergy() );
            //        2. `eat()` → increases energy by **20** (max 100).
        }
    }

    public void play() {
        if (energy <= 30) {
            System.out.printf(" %s is too tired. Needs to rest.%n", getName());
        } else {
            setEnergy(energy -= 30);
            System.out.printf(" %s is playing fetch! (Energy left: %s)%n", getName(),getEnergy() );
            //        <name> is playing fetch! (Energy left: <energy>)
        }
    }

    public void sleep() {
        setEnergy(100);
        System.out.printf(" %s is sleeping! (Energy restored: %s)%n", getName(), getEnergy());
    }

    public static String dogInfo(Dog dog){
        return String.format("this dog name is : %s %n He/She is : %d years old! %n Energy level is : %d" ,dog.getName() ,dog.getAge() , dog.getEnergy());
    }
}
