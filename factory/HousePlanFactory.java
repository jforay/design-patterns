public class HousePlanFactory {
    /**
     * creates a new houseplan with the type that is passed in the parameters, then sets the materials and features, and returned the new house plan
     * @param type the type of house plan
     * @return the new house plan 
     */
    public static HousePlan createHousePlan(String type){
        HousePlan housePlan;
        
        if(type.equals("log cabin")){
           
           housePlan = new LogCabinPlan();
        }
        else if(type.equals("Tiny Home")){
           
            housePlan = new TinyHomePlan();
        }
        else if(type.equals("contemporary home")){
            
            housePlan = new ContemporaryPlan();
        }
        else{
            housePlan = new LogCabinPlan();
        }
        housePlan.setFeatures();
        housePlan.setMaterials();
        return housePlan;        
    }

}
