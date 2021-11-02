
public class Car implements CarbonFootprint
{
	   int km;
	   float fuelUsed;
	  
	   Car(int k, float f)
	   {
	       km = k;
	       fuelUsed = f;
	   }
	   
	   @Override
	   public String getCarbonFootprint()
	   {
	       float cf = km*fuelUsed;
	       return "Car Carbon Foot Print : " + cf;
	   }

	}