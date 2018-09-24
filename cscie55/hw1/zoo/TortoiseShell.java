public class TortoiseShell {
    /* define instance variables */
    private String[] favoriteFoods;
    private int age;
    private String markings;
    private static final int totalFoods=3;

    public TortoiseShell()
    {
	this.age=0;
	this.favoriteFoods = new String[totalFoods];
	this.markings="patches";
    }
}
