public class Jaguar {
    /* define instance variables */
    private String[] favoriteFoods;
    private int age;
    private String markings;
    private static final int totalFoods=3;

    public Jaguar()
    {
	this.age=0;
	this.favoriteFoods = new String[totalFoods];
	this.markings="solid";
    }
}
