/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author KOMPUTER JARKOM 9
 */
public class ObjekMobil {
    
    public static void main (String[] args){
        MobilDiesel md = new MobilDiesel("VAJERO", 300, 0,"solar");
        MobilBensin mb = new MobilBensin("AVANZA", 500, 0,"solar");
//      
        md.infoMobilDiesel();
        mb.infoMobilBensin();
//        
//        
        
       
    }    
}
