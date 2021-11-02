
public class Building implements CarbonFootprint {
	
	 int noStorey;
	   float fuelUsed;
	  
	   Building(int n, float f)
	   {
	       noStorey = n;
	       fuelUsed = f;
	   }
	   
    @Override
    public String getCarbonFootprint() {
    	float cf = noStorey*fuelUsed;
        return "Building Carbon Footprint: " + cf;
  
    }
}
