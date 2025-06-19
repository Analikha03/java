package fom.index;

class Recipe{
	public void recipeR()
	{
		System.out.println("These are the recipes and instructions");
	}
}
class Cake extends Recipe{
	public void getIngredientsC()
	{
		System.out.println("flour"+"egg"+"chocolate");
	}
	public void getrecipeC()
	{
		System.out.println("mix batter"+"bake it in 120 *c"+"garnish it");
	}
}

class Pasta extends Recipe{
	public void getIngredientsP()
	{
		System.out.println("pasta"+"veggies"+"chesse");
	}
	public void getrecipeP()
	{
		System.out.println("boil it"+"saute it with veggies"+"garnish");
	}
}

class Soup extends Recipe{
	public void getIngredientS()
	{
		System.out.println("veggies"+"water"+"spices");
	}
	public void getrecipeS()
	{
		System.out.println("boil the veggies"+"add spices and water"+"garnish it");
	}
}



public class HirerachicalTask {

	public static void main(String[] args) {
		Cake obj1=new Cake();
		Pasta obj2=new Pasta();
		Soup obj3=new Soup();
		obj1.getIngredientsC();
		obj1.getrecipeC();
		obj2.getIngredientsP();
		obj2.getrecipeP();
		obj3.getIngredientS();
		obj3.getrecipeS();

	}

}
