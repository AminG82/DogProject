//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "jessi";
        d1.age = 6;

        Dog d2 = new Dog();
        d2.name = "fred";
        d2.age = 10;
    }
}

//        ## 🐶 **Dog Challenge – OOP Version**
//
//      You will create a `Dog` class with:
//
//        ### **Fields**
//
//        * `String name`
//        * `int age`
//        * `int energy` (starts at 100 when a dog is created)
//
//        ### **Methods**
//
//        1. `bark()` → prints:
//
//        ```
//        <name> says Woof! (Energy left: <energy>)
//        ```
//
//        Every bark costs **10 energy** (energy decreases).
//
//        2. `eat()` → increases energy by **20** (max 100).
//
//        3. `play()` → costs **30 energy**, prints:
//
//        ```
//        <name> is playing fetch! (Energy left: <energy>)
//        ```
//
//        4. `sleep()` → restores energy to **100**.
//
//        ---
//
//        ### **Rules**
//
//        * If the dog’s energy is **0 or less**, it should print:
//
//        ```
//          <name> is too tired. Needs to rest.
//  ```
//          * Don’t let energy go above 100.
//
//        ---
//
//        ### **Example Output**
//
//        ```plaintext
//  Buddy says Woof! (Energy left: 90)
//  Buddy is playing fetch! (Energy left: 60)
//  Buddy is playing fetch! (Energy left: 30)
//  Buddy is playing fetch! (Energy left: 0)
//  Buddy is too tired. Needs to rest.
//  Buddy is sleeping. Energy restored to 100!
//        ```
//
//        ---
//
//        💡 **Extra Twist:**
//  Make the `energy` field **private** and use **getters/setters**
