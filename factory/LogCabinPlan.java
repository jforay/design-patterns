public class LogCabinPlan extends HousePlan{
    /**
     * creates a Log Cabin House Plan and passes the number of rooms, windows, and square feet
     */
    public LogCabinPlan(){
        super(2,10,1800);
    }
    /**
     * sets the materials for the log cabin house plan
     */
    protected void setMaterials(){

        this.materials.add(0,"Log Siding");
        this.materials.add(1,"Board and Batten Siding");
        this.materials.add(2,"White Pine");
    }
    /**
     * sets the features for the log cabin house plan
     */
    protected void setFeatures(){
        this.features.add(0,"Timbered Roof");
        this.features.add(1,"High Insulation");
        this.features.add(2,"Rustic Effect");
    }
    /**
     * turns Log cabin house plan into a string showing the number of windows, rooms, and sqaure feet.
     * also shows the materials and the features
     */
    public String toString(){
        return "Log Cabin \n"+super.toString()+this.getMaterials().get(0)+"\n- "+this.getMaterials().get(1)+"\n- "+this.getMaterials().get(2)+"\n\nFeatures:\n- "+this.getFeatures().get(0)+"\n- "+this.getFeatures().get(1)+"\n- "+this.getFeatures().get(2);

    }
    
    
}
