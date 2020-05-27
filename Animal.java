public class Animal {
   private String name = "Animal";
   public String favFood = "Food";
   
   //prevent subclass from overriding
   protected final  void changeName(String newName){
      this.name = newName;
   }
   
   // final prevents override
   protected final String getName() {
      return this.name;
   }
   
   public void eatStuff() {
      System.out.println("Yum " + favFood);
   }
   
   public void walkAround() {
      System.out.println(this.name + " walks around");
   }
   
   public Animal() {
      
   }
   
   public int Animal(int xyz){
      return 1;
   }
   
   public Animal(String name, String favFood){
      this.changeName(name);
      this.favFood = favFood;
   }
}