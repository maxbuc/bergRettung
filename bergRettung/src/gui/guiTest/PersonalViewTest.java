package gui.guiTest;

import javax.swing.JFrame;
import bergrettung.PersonalVerwaltung;
import gui.PersonalView;
import javax.swing.JTextField;

public final class PersonalViewTest extends JFrame {

    private PersonalView view;

    public PersonalViewTest() {
        view = new PersonalView("test", new PersonalVerwaltung());
        
        getVornameText();
        getNachnameText();
        getGebdatText();
        
        
        view.dispose();
    }

    

    public void getVornameText() {
        if(view.getVornameText().isEmpty() && view.getVornameText().getClass()== "Das ist eindeutig ein String!!!".getClass()){
            System.out.println("getVornameText Test erfolgreich");
        }else{
            System.err.println("getVornameTest");
        }
    }

    public void getNachnameText() {
        if(view.getNachnameText().isEmpty() && view.getNachnameText().getClass()== "Das ist eindeutig ein String!!!".getClass()){
            System.out.println("getNachnameTest Test erfolgreich");
        }else{
            System.err.println("getNachnameTest");
        }
    }

    public void getIdText() {
        view.setIdText("0");
        if(view.getIdText()==0){
            view.setIdText("123");
            if(view.getIdText()==123){
                view.setIdText("test");
                if(view.getIdText()==0){
                    System.out.println("getIdText Test erfolgreich");
                }
            }
        }System.err.println("getIdText");
    }

    public void getGebdatText() {
        if(view.getGebdatText().equals("yyyy-mm-dd") && view.getGebdatText().getClass()== "Das ist eindeutig ein String!!!".getClass()){
            System.out.println("getGebdatTest Test erfolgreich");
        }else{
            System.err.println("getGebdatTest");
        }
    }

//    public String getQualifikationText() {
//        return qualifikationText.getText();
//    }
//
//    public JTextField getNachnameField() {
//        return nachnameText;
//    }
//
//    public JTextField getVornameField() {
//        return vornameText;
//    }
//
//    public JTextField getIdField() {
//        return idText;
//    }
//    
//    public JTextField getGebdatField(){
//        return gebdatText;
//    }
}
