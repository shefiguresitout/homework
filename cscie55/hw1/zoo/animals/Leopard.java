public class Leopard {
    /* define instance variables */
    private String[] favoriteFoods;
    private int age;
    private String markings;
    private static final int totalFoods=3;

    public Leopard()
    {
	this.age=0;
	this.favoriteFoods = new String[totalFoods];
	this.markings="spots";
    }
}
