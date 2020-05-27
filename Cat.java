public class Cat extends Animal {
   
   public String favToy = "Yarn";
   public void playWith(){
      System.out.println("Yay " + favToy); 
   }
   
   public void walkAround() {
      System.out.println(this.getName() + " stalks around");
   }  
   
   public String getToy(){
      return this.favToy;
   }
      
   public Cat(String name, String favFood, String favToy){
      super(name, favFood);
      this.favToy = favToy;
   }
   
}