// lion class
class Lion extends Animal {
    private static String type;

    // lion constructor and the attributes
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight, type);
        type(weight);
    }

    public String type(int weight) {
        // if else statement to get Animal weight
        super.setWeight(weight);
        if (weight <= 80) {
            type = "Cub";
            System.out.println("Cubb");

        } else if (weight >= 80 && weight <= 120) {
            type = "FeMale";
            System.out.println("FeMale");
        } else {
            type = "Male";
            System.out.println("Male");
        }
        return type;
    }

    //toString methods to display values
    public String toString(String lion) {
        String output = "Number of Teeth: " + numTeeth;
        output += "\nHas Spots :" + spots;
        output += "\nWeight:  " + weight + "kg";
        output += "\nLion Type: " + type;

        return output;
    }

}