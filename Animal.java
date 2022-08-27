// main class Animal
public class Animal {
	// private data types and attributes
	protected int numTeeth = 0;
	protected boolean spots = false;
	protected int weight = 0;
	// added type string
	protected String type = "";
	
	// constructor and the attributes and data types
	public Animal(int numTeeth, boolean spots, int weight ,String type){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
		this.setType(type);
	}
	

	// getter method to get number of teeth
	public int getNumTeeth(){
		return numTeeth;
	}
	// setter method to set number of teeth
	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}
	// boolean to confirm  the animal has spots or not using getter and setter()
	public boolean getSpots() {
		return spots;
	}
	
	public void setSpots(boolean spots) {
		this.spots = spots;
	}
	// getter method to get animal weight
	public int getWeight() {
		return weight;
	}
	// setter method to set weight of an Animal
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// set Type field to set the animal type
	public void setType(String type) {
		this.type = type;
		
	}
	// get Type field to get animal type
	public String getType(String type) {
		//super.setWeight(weight);
		if(weight <= 80){
            type = "Cub"; 
        }
        else if(weight >=80 && weight <= 120){
            type = "Female";
        }
        else{
            type = "Male";
        }
        return type;
	}	
	//toString methods to display values 
	public String toString() {
	String output = "Number of Teeth: " + numTeeth;
	output += "\nHas Spots :" + spots;
	output += "\nWeight:  " + weight + "kg";
	output += "\nLion Type: " + type;
	
	return output;
	
	}
	
}
