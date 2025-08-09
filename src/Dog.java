public class Dog {
    public String name;
    public Integer age;
    private Integer energy = 100;

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void bark() {
        System.out.println(String.format(" %s says Woof! (Energy left: %s)", name, energy -= 10));
        //        Every bark costs **10 energy** (energy decreases).
    }

    public void eat() {
        if (energy > 80) {
            System.out.println(String.format(" %s is not hungry)", name));
        } else {
            System.out.println(String.format(" %s is eating! (Energy restored: %s)", name, energy += 20));
            //        2. `eat()` → increases energy by **20** (max 100).
        }
    }

    public void play() {
        if (energy <= 0) {
            System.out.println(String.format(" %s is too tired. Needs to rest.", name));
        } else {
            System.out.println(String.format(" %s is playing fetch! (Energy left: %s)", name, energy -= 30));
            //        <name> is playing fetch! (Energy left: <energy>)
        }
    }

    public void sleep(){
        System.out.println(String.format(" %s is sleeping! (Energy restored: %s)" , name , energy = 100 ));
    }

//    private void checkEnergy(){
//        if (energy <= 0 ){
//            System.out.println(String.format(" %s is too tired. Needs to rest.", name));
//        }
//    }
}
