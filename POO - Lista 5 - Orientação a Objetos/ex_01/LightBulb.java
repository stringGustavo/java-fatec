import java.util.Random;

public class LightBulb {
	
	private String brand;
	private String model;
	private String type;

	public LightBulb () {
		brand = "undefined";
		model = "undefined";
		type = "undefined";
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}	
	
	public String getType() {
		return type;
	}
	
	public String onOff() {
		Random rnd = new Random();
		
		int state = rnd.nextInt(2);
		
		if(state == 0) {
			return "Status: Off";
		} else {
			return "Status: On";
		}
	}	
}

