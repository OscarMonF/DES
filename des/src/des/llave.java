/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author Alumno
 */
public class llave {
    
    String iz="";
    String de="";
    String orgI = "";
    String orgD = "";
    String fin = "";
    String k = "";
    String bi ="";
    String redux = "";
    String b ="";
    
    
    
    public void aBinario (String clave){
        for (int i =0; i<16; i++){
            char tr;
            tr = clave.charAt(i);
            
            switch (tr){
                case '0':
                    bi = bi+"0000";
                    break;
                case '1':
                    bi = bi+"0001";
                    break;
                case '2':
                    bi = bi+"0010";
                    break;
                case '3':
                    bi = bi+"0011";
                    break;
                case '4':
                    bi = bi+"0100";
                    break;
                case '5':
                    bi = bi+"0101";
                    break;
                case '6':
                    bi = bi+"0110";
                    break;
                case '7':
                    bi = bi+"0111";
                    break;
                case '8':
                    bi = bi+"1000";
                    break;
                case '9':
                    bi = bi+"1001";
                    break;
                case 'a':
                    bi = bi+"1010";
                    break;
                case 'A':
                    bi = bi+"1010";
                    break;
                case 'b':
                    bi = bi+"1011";
                    break;
                case 'B':
                    bi = bi+"1011";
                    break;
                case 'c':
                    bi = bi+"1100";
                    break;
                case 'C':
                    bi = bi+"1100";
                    break;
                case 'd':
                    bi = bi+"1101";
                    break;
                case 'D':
                    bi = bi+"1101";
                    break;
                case 'e':
                    bi = bi+"1110";
                    break;
                case 'E':
                    bi = bi+"1110";
                    break;
                case 'f':
                    bi = bi+"1111";
                    break;
                case 'F':
                    bi = bi+"1111";
                    break;
                
            }
    }
        
        redux = ""+bi.charAt(56)+bi.charAt(48)+bi.charAt(40)+bi.charAt(32)+bi.charAt(24)+bi.charAt(16)+bi.charAt(8)+bi.charAt(0)
                                    +bi.charAt(57)+bi.charAt(49)+bi.charAt(41)+bi.charAt(33)+bi.charAt(25)+bi.charAt(17)+bi.charAt(9)+bi.charAt(1)
                                    +bi.charAt(58)+bi.charAt(50)+bi.charAt(42)+bi.charAt(34)+bi.charAt(26)+bi.charAt(18)+bi.charAt(10)+bi.charAt(2)
                                    +bi.charAt(59)+bi.charAt(51)+bi.charAt(43)+bi.charAt(35)+bi.charAt(62)+bi.charAt(54)+bi.charAt(46)+bi.charAt(38)
                                    +bi.charAt(30)+bi.charAt(22)+bi.charAt(14)+bi.charAt(6)+bi.charAt(61)+bi.charAt(53)+bi.charAt(45)+bi.charAt(37)
                                    +bi.charAt(29)+bi.charAt(21)+bi.charAt(13)+bi.charAt(5)+bi.charAt(60)+bi.charAt(52)+bi.charAt(44)+bi.charAt(36)
                                    +bi.charAt(28)+bi.charAt(20)+bi.charAt(12)+bi.charAt(4)+bi.charAt(27)+bi.charAt(19)+bi.charAt(11)+bi.charAt(3);
        
        for (int i =0;i<28;i++){
            iz = iz+redux.charAt(i);
        }
        for (int i =28;i<56;i++){
            de = de+redux.charAt(i);
        }
        
    }
    
   
    
    public String meter(int caja){
        if(caja==1){
            orgI = "";
                orgD = "";
                fin = "";
                
                for (int i =1;i<28;i++){
                   orgI = orgI+iz.charAt(i);
                }
                orgI = orgI+iz.charAt(0);
                
                for (int i =1;i<28;i++){
                   orgD = orgD+de.charAt(i);
                }
                    orgD = orgD+de.charAt(0);
                    
                 fin = orgI+orgD; 
                 
                 k = ""+fin.charAt(13)+fin.charAt(16)+fin.charAt(10)+fin.charAt(23)+fin.charAt(0)+fin.charAt(4)+fin.charAt(2)+fin.charAt(27)
                           +fin.charAt(14)+fin.charAt(5)+fin.charAt(20)+fin.charAt(9)+fin.charAt(22)+fin.charAt(18)+fin.charAt(11)+fin.charAt(3)
                           +fin.charAt(25)+fin.charAt(7)+fin.charAt(15)+fin.charAt(6)+fin.charAt(26)+fin.charAt(19)+fin.charAt(12)+fin.charAt(1)
                           +fin.charAt(40)+fin.charAt(51)+fin.charAt(30)+fin.charAt(36)+fin.charAt(46)+fin.charAt(54)+fin.charAt(29)+fin.charAt(39)
                           +fin.charAt(50)+fin.charAt(44)+fin.charAt(32)+fin.charAt(47)+fin.charAt(43)+fin.charAt(48)+fin.charAt(38)+fin.charAt(55)
                           +fin.charAt(33)+fin.charAt(52)+fin.charAt(45)+fin.charAt(41)+fin.charAt(49)+fin.charAt(35)+fin.charAt(28)+fin.charAt(31);
        }
        if(caja == 2 || caja==9 || caja == 16){
             iz="";
                de="";
                orgI = "";
                orgD = "";

                
                for (int i =0;i<28;i++){
                    iz = iz+fin.charAt(i);
                }
                for (int i =28;i<56;i++){
                    de = de+fin.charAt(i);
                }
                
                for (int i =1;i<28;i++){
                   orgI = orgI+iz.charAt(i);
                }
                orgI = orgI+iz.charAt(0);
                
                for (int i =1;i<28;i++){
                   orgD = orgD+de.charAt(i);
                }
                    orgD = orgD+de.charAt(0);
                    
                 fin = orgI+orgD; 
                 
                k = ""+fin.charAt(13)+fin.charAt(16)+fin.charAt(10)+fin.charAt(23)+fin.charAt(0)+fin.charAt(4)+fin.charAt(2)+fin.charAt(27)
                           +fin.charAt(14)+fin.charAt(5)+fin.charAt(20)+fin.charAt(9)+fin.charAt(22)+fin.charAt(18)+fin.charAt(11)+fin.charAt(3)
                           +fin.charAt(25)+fin.charAt(7)+fin.charAt(15)+fin.charAt(6)+fin.charAt(26)+fin.charAt(19)+fin.charAt(12)+fin.charAt(1)
                           +fin.charAt(40)+fin.charAt(51)+fin.charAt(30)+fin.charAt(36)+fin.charAt(46)+fin.charAt(54)+fin.charAt(29)+fin.charAt(39)
                           +fin.charAt(50)+fin.charAt(44)+fin.charAt(32)+fin.charAt(47)+fin.charAt(43)+fin.charAt(48)+fin.charAt(38)+fin.charAt(55)
                           +fin.charAt(33)+fin.charAt(52)+fin.charAt(45)+fin.charAt(41)+fin.charAt(49)+fin.charAt(35)+fin.charAt(28)+fin.charAt(31);
        }
        if(caja>2 && caja<9 || caja>9 && caja<16 ){
           iz="";
                de="";
                orgI = "";
                orgD = "";

                
                for (int i =0;i<28;i++){
                    iz = iz+fin.charAt(i);
                }
                for (int i =28;i<56;i++){
                    de = de+fin.charAt(i);
                }
                
                for (int i =2;i<28;i++){
                   orgI = orgI+iz.charAt(i);
                }
                orgI = orgI+iz.charAt(0)+iz.charAt(1);
                
                for (int i =2;i<28;i++){
                   orgD = orgD+de.charAt(i);
                }
                    orgD = orgD+de.charAt(0)+de.charAt(1);
                    
                 fin = orgI+orgD; 
                 
                k = ""+fin.charAt(13)+fin.charAt(16)+fin.charAt(10)+fin.charAt(23)+fin.charAt(0)+fin.charAt(4)+fin.charAt(2)+fin.charAt(27)
                           +fin.charAt(14)+fin.charAt(5)+fin.charAt(20)+fin.charAt(9)+fin.charAt(22)+fin.charAt(18)+fin.charAt(11)+fin.charAt(3)
                           +fin.charAt(25)+fin.charAt(7)+fin.charAt(15)+fin.charAt(6)+fin.charAt(26)+fin.charAt(19)+fin.charAt(12)+fin.charAt(1)
                           +fin.charAt(40)+fin.charAt(51)+fin.charAt(30)+fin.charAt(36)+fin.charAt(46)+fin.charAt(54)+fin.charAt(29)+fin.charAt(39)
                           +fin.charAt(50)+fin.charAt(44)+fin.charAt(32)+fin.charAt(47)+fin.charAt(43)+fin.charAt(48)+fin.charAt(38)+fin.charAt(55)
                           +fin.charAt(33)+fin.charAt(52)+fin.charAt(45)+fin.charAt(41)+fin.charAt(49)+fin.charAt(35)+fin.charAt(28)+fin.charAt(31); 
        }
        return k;
    }
}
