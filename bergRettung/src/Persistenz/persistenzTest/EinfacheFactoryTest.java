
package Persistenz.persistenzTest;

import Persistenz.*;


public class EinfacheFactoryTest {

    public EinfacheFactoryTest() {
        personal();
        patient();
        equipment();
        einsatz();
        setup();
        
    }
    
    public void personal(){
        if(EinfacheFactory.createPersonalMapper().getClass() == PersonalJavaDBMapper.class){
            System.out.println("createPersonalMapper Test erfolgreich");
        }else{
            System.err.println("createPersonalMapper");
        }
    }
    public void patient(){
        if(EinfacheFactory.createPatientMapper().getClass() == PatientJavaDBMapper.class){
            System.out.println("createPatientMapper Test erfolgreich");
        }else{
            System.err.println("createPatientMapper");
        }
    }
    public void equipment(){
        if(EinfacheFactory.createEquipmentMapper().getClass() == EquipmentJavaDBMapper.class){
            System.out.println("createEquipmentMapper Test erfolgreich");
        }else{
            System.err.println("createEquipmentMapper");
        }
    }
    public void einsatz(){
        if(EinfacheFactory.createEinsatzMapper().getClass() == EinsatzJavaDBMapper.class){
            System.out.println("createEinsatzMapper Test erfolgreich");
        }else{
            System.err.println("createEinsatzMapper");
        }
    }
    public void setup(){
        if(EinfacheFactory.createSetupMapper().getClass() == SetupJavaDBMapper.class){
            System.out.println("createSetupMapper Test erfolgreich");
        }else{
            System.err.println("createSetupMapper");
        }
    }
    
    
    
}
