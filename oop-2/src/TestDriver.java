
import com.npru.se65.id65001.HumanBeing;

public class TestDriver {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(180);
		hb.setWeight(65);
		hb.calculateBMI();
		System.out.println("BMI :"+hb.getBmi());
		System.out.println(hb.analyzeBmi());
		
		

	}

}
