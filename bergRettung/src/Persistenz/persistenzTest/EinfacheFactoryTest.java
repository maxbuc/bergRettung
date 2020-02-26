
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
        }
    }
    public void patient(){
        if(EinfacheFactory.createPatientMapper().getClass() == PatientJavaDBMapper.class){
            System.out.println("createPatientMapper Test erfolgreich");
        }
    }
    public void equipment(){
        if(EinfacheFactory.createEquipmentMapper().getClass() == EquipmentJavaDBMapper.class){
            System.out.println("createEquipmentMapper Test erfolgreich");
        }
    }
    public void einsatz(){
        if(EinfacheFactory.createEinsatzMapper().getClass() == EinsatzJavaDBMapper.class){
            System.out.println("createEinsatzMapper Test erfolgreich");
        }
    }
    public void setup(){
        if(EinfacheFactory.createSetupMapper().getClass() == SetupJavaDBMapper.class){
            System.out.println("createSetupMapper Test erfolgreich");
        }
    }
    
    
    
}
