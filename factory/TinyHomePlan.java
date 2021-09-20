public class TinyHomePlan extends HousePlan{
   /**
    * creates a tiny house plan and passes the number of rooms, windows,and sqaure feet
    */
    public TinyHomePlan(){
        super(1,5,200);
    }
    /**
     * sets the materials for the tiny house plan
     */
    protected void setMaterials(){
        this.materials.add(0,"Lumber");
        this.materials.add(1,"Insulation");
        this.materials.add(2,"Metal Roofing");
        this.materials.add(3,"Hardware");
    }
    /**
     * sets the features for the tiny house plan
     */
    protected void setFeatures(){
        this.features.add("Natural Light");
        this.features.add("Creative Storage");
        this.features.add("Multipurpose areas");
        this.features.add("Mutli-use applications");
    }
    /**
     * turns the tiny house plan into a string showing the number of rooms, windows, and square feet.
     * also lists the materials and features in the house
     */
    public String toString(){
        return "\nTiny Home Plan \n"+super.toString()+this.getMaterials().get(0)+"\n- "+this.getMaterials().get(1)+"\n- "+this.getMaterials().get(2)+"\n- "+this.getMaterials().get(3)+"\n\nFeatures:\n- "+this.getFeatures().get(0)+"\n- "+this.getFeatures().get(1)+"\n- "+this.getFeatures().get(2)+"\n- "+this.getFeatures().get(3);
    }
}
