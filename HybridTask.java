package fom.index;
//Base class
class Ingredient {
 void showIngredient() {
     System.out.println("Using basic ingredients: salt, oil, spices");
 }
}

//Derived class 1
class ItalianDish extends Ingredient {
 void makePasta() {
     System.out.println("Making Italian Pasta with tomato sauce");
 }
}

//Derived class 2
class MexicanDish extends Ingredient {
 void makeTaco() {
     System.out.println("Making Tacos with Mexican salsa");
 }
}

//Fusion class using hybrid inheritance pattern
class FusionDish extends ItalianDish {
 // Using composition to include MexicanDish behavior
 MexicanDish mexicanDish = new MexicanDish();

 void makeFusion() {
     System.out.println("Combining pasta and taco to create a Fusion Dish!");
     makePasta(); // from ItalianDish
     mexicanDish.makeTaco(); // from MexicanDish
 }
}

//Main class to run
public class HybridTask {
 public static void main(String[] args) {
     FusionDish fusion = new FusionDish();

     fusion.showIngredient(); // From Ingredient
     fusion.makeFusion();     // Uses methods from both Italian and Mexican dishes
 }
}