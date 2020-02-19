
package Persistenz;


public class EinfacheFactory {
    
    public static IPersonalMapper createPersonalMapper(){
        return new PersonalJavaDBMapper();
    }
    
    public static IPatientMapper createPatientMapper(){
        return new PatientJavaDBMapper();
    }
    
    public static IEquipmentMapper createEquipmentMapper(){
        return new EquipmentJavaDBMapper();
    }
            
    public static IEinsatzMapper createEinsatzMapper(){
        return new EinsatzJavaDBMapper();
    }
    
    public static ISetupMapper createSetupMapper(){
        return new SetupJavaDBMapper();
    }
}
