/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingles;

import java.util.Scanner;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
/**
 *
 * @author tct
 */
public class Ingles {

    /**
     * @param args the command line arguments
     */
    public Scanner entrada;
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String leer;
        VoiceManager manager =VoiceManager.getInstance();
        Voice voz =manager.getVoice("kevin16");
        voz.allocate();
        
        
        //voz.setRate(200);
        //System.out.printf(" %f",voz.getRate());
        
     int b,c;
     long  var;
        do{
        leer=entrada.nextLine();
        for(int i=0; i<1;i++){
           b=(int)((Math.random()*7)+1);
           //voz.allocate();
            //voz.speak(Integer.toString(b));
            //voz.deallocate();
          /* voz.speak(Integer.toString(16));
        voz.speak(Integer.toString(60));
         voz.speak(Integer.toString(15));
        voz.speak(Integer.toString(50));*/
            
        //System.out.print(b);

        switch (b){
                case 1:
                    //numero1_10(voz);
                    numero100000_999999(voz);
                    break;
                case 2:
                    //numero10_99(voz);
                    numero100000_999999(voz);
                    //numero1_10(voz);
                    break;
                case 3:
                    numero100000_999999(voz);
                    //numero1_10(voz);
                    break;
                case 4:
                    numero10000_99999(voz);
                    //numero1_10(voz);
                    break;
                case 5:
                    numero1000000_9999999(voz);
                    //numero1_10(voz);
                    break;
                case 6:
                    //numero100000_999999(voz);
                    numero1000000_9999999(voz);
                    //numero1_10(voz);
                    break;
                case 7:
                    numero1000000_9999999(voz);
                    //numero1000000_9999999(voz);
                    //numero1_10(voz);
                    break;                    
                default:
                    break;
        }
        
        }
        System.out.println("");
        }while(true);
        
    }
    static void numero1_10(Voice voz){
        int a;
        a=(int)((Math. random()*10)+1);//(del 0 al 9)+1
        voz.speak(Integer.toString(a));
        System.out.printf(" %d  "
                + "",a);
    }
     static void numero10_99(Voice voz){
        int a;
        a=(int)((Math. random()*90)+10);//
        voz.speak(Integer.toString(a));      
        System.out.printf(" %d  ",a);
    }
     static void numero100_999(Voice voz){
        int a;
        a=(int)((Math. random()*900)+100);//
        voz.speak(Integer.toString(a));
        System.out.printf(" %d  ",a);
    }
      static void numero1000_9999(Voice voz){
        int a;
        a=(int)((Math. random()*9000)+1000);//
        voz.speak(Integer.toString(a));
        System.out.printf(" %d  ",a);
    }
      static void numero10000_99999(Voice voz){
        int a;
        a=(int)((Math. random()*90000)+10000);//
        voz.speak(Integer.toString(a));
        System.out.printf(" %d  ",a);
    }
      static void numero100000_999999(Voice voz){
        long a;
        a=(long)((Math. random()*900000)+100000);//
        voz.speak(Long.toString(a));
        System.out.printf(" %d  ",a);
    }
      static void numero1000000_9999999(Voice voz){
        long a;
        a=(long)((Math. random()*9000000)+1000000);//
        voz.speak(Long.toString(a));
        System.out.printf(" %d  ",a);
    }
}
