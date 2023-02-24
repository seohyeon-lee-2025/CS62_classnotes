public class Cat extends Animal {
	public int legs = 4;
	public static String species = "Cat";
	
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
		}

	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		Cat myCat = new Cat(); // reference is same type as object (both Cat)
		myCat.testClassMethod(); //invoking a hidden method
		myCat.testInstanceMethod(); //invoking an overridden method
		System.out.println(myCat.legs); //accessing a hidden field
		System.out.println(myCat.species); //accessing a hidden field 
		
		Animal yourCat = new Cat(); // reference of type Animal points to a Cat object
		yourCat.testClassMethod(); //invoking a hidden method. accesses a Cat + Animal static method with an Animal reference. 
		yourCat.testInstanceMethod(); //invoking an overridden method
		System.out.println(yourCat.legs); //accessing a hidden field
		System.out.println(yourCat.species); //accessing a hidden field
	}
}