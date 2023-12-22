package com.opps;

class CabServiceProvider{
    //Implement your code here
    private String cabServiceName;
   private  int totalCabs;
private Object getcabServiceName;
   CabServiceProvider(String cabServiceName,int totalCabs){
   this.cabServiceName=cabServiceName;
   this.totalCabs=totalCabs;
   }
   String getcabServiceName(){
   return cabServiceName;
   }
   void setCabServiceName(String cabServiceName){
   this.cabServiceName=cabServiceName;
   }
   int getTotalCabs(){
   return totalCabs;
   }
   void setTotalCabs(){
   this.totalCabs=totalCabs;
   }
   double calculateRewardPrice(Driver driver){
   //double bonus=0;
   if(this.getcabServiceName().equals("Halo")){
   
   if(driver.getAverageRating()>=4.5 &&  driver.getAverageRating()<=5){
   double bonus= 10*driver.getAverageRating();
   return bonus;
   }
    else  if(driver.getAverageRating()>=4 &&  driver.getAverageRating()<=4.5){
   double bonus= 5*driver.getAverageRating();
   return bonus;

   }
   }
   
   else    if(this.getcabServiceName.equals("Aber")){
   
   if(driver.getAverageRating()>=4.5 &&  driver.getAverageRating()<=5){
   double bonus= 8*driver.getAverageRating();
   return bonus;

   }
    else  if(driver.getAverageRating()>=4 &&  driver.getAverageRating()<=4.5){
   double bonus= 3*driver.getAverageRating();
   return bonus;

   }
   }
   else {
	 double  bonus=0;
	    return bonus;

   }
   return 0.0;
   
   }
}

class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class Tester {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}
