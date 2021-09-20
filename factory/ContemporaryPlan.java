public class ContemporaryPlan extends HousePlan{
    /**
     * creates the contemporary plan and passes in the number of rooms, windows, and square feet
     */
    public ContemporaryPlan(){
        super(5,40,3000);
    }
    /**
     * sets the materials for the contemporary plan
     */
    protected void setMaterials(){
        this.materials.add(0,"Ceramic");
        this.materials.add(1,"High-Strength Alloys");
        this.materials.add(2,"Composites");
    }
    /**
     * sets the features for the contemporary plan
     */
    protected void setFeatures(){
        this.features.add("Oversized Windows");
        this.features.add("Unconventional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor Plan");
    }
    /**
     * turns the contemporary plan into a string showing the number of rooms, windows, and sqaure feet
     * also lists the materials and features in the contemporary house
     */
    public String toString(){
        return "\nContemporary Plan \n"+super.toString()+this.getMaterials().get(0)+"\n- "+this.getMaterials().get(1)+"\n- "+this.getMaterials().get(2)+"\n\nFeatures:\n- "+this.getFeatures().get(0)+"\n- "+this.getFeatures().get(1)+"\n- "+this.getFeatures().get(2)+"\n- "+this.getFeatures().get(3);
    }

    
}
