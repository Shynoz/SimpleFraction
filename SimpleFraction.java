
public class SimpleFraction {
	int numerateur;
	int denominateur;
	
	
	public SimpleFraction (int num, int denum) {
		
		numerateur = num;
		denominateur = denum;
		
		
	}
	
	public String totring() {
		return "Numerateur : " + numerateur + " \nDenominateur : " + denominateur + "\n" + numerateur/denominateur ;
		
		
	}
	

}
