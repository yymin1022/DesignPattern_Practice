package observerPractice;

public class WhetherDataSubject {
	private float temperature = 25.0f;
	private float rainfall = 0.0f;
	
	private UmbrellaStore umbSeller;
	private ClothingStore clothingStore;
	// default constructor
	public WhetherDataSubject(UmbrellaStore us, ClothingStore cs) {
		this.umbSeller = us;
		this.clothingStore = cs;
	}
	
	public void setMeasurements(float temperature, float rainfall) {
		this.temperature = temperature;
		this.rainfall = rainfall;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
	}
	
	public void notifyDataSetChanged(){
		umbSeller.whetherChanged(rainfall); 
		clothingStore.whetherChanged(temperature);
	}
	
	public void currentState() {
		System.out.printf("===== Current state ===== \n Temperature : %.1f'c \n Rainfall : %.1fmm \n=========================\n",
				temperature, rainfall);
	}
}
