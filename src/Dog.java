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
        if(energy <= 10){
            System.out.printf(" %s is too tired. Needs to rest.%n", name);
        }else {
            System.out.printf(" %s says Woof! (Energy left: %s)%n", name, energy -= 10);
            //        Every bark costs **10 energy** (energy decreases).
        }

    }

    public void eat() {
        if (energy > 80) {
            System.out.printf(" %s is not hungry%n", name);
        } else {
            System.out.printf(" %s is eating! (Energy restored: %s)%n", name, energy += 20);
            //        2. `eat()` → increases energy by **20** (max 100).
        }
    }

    public void play() {
        if (energy <= 30) {
            System.out.printf(" %s is too tired. Needs to rest.%n", name);
        } else {
            System.out.printf(" %s is playing fetch! (Energy left: %s)%n", name, energy -= 30);
            //        <name> is playing fetch! (Energy left: <energy>)
        }
    }

    public void sleep(){
        System.out.printf(" %s is sleeping! (Energy restored: %s)%n", name , energy = 100 );
    }

}
