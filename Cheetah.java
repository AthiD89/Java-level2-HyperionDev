class Cheetah extends Animal {
    private static String type;

    public Cheetah(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight, type);
        type(weight);
    }

    private void type(int weight) {
        return;

    }

    //toString methods to display values 
    public String toString(String lion) {
        String output = "Number of Teeth: " + numTeeth;
        output += "\nHas Spots :" + spots;
        output += "\nWeight:  " + weight + "kg";
        return output;
    }

}