package num4;

public class Software {
	
	private int quantity;
	
	public Software(int q){
		quantity = q;
	}
	
	public double calculatePrice(){
		if (quantity >= 10 && quantity < 20){
			return quantity * 99 * .8;
		}
		else if (quantity >= 20 && quantity < 50){
			return quantity * 99 * 0.7;
		}
		else if (quantity >= 50 && quantity < 100){
			return quantity * 99 * .6;
		}
		else if (quantity >= 100){
			return quantity * 99 * .5;
		}
		else
			return quantity * 99;
	}
}
