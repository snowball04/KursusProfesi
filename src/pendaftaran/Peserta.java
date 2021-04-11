
package pendaftaran;

public class Peserta {
    public String cekKelayakan(int nilaiMatematika, int nilaiFisika, int nilaiKimia){
        
        String kelayakan = "layakIkutKursus";
        
        if ((nilaiMatematika >= 65 && nilaiFisika >= 55 && nilaiKimia >= 50) || (nilaiMatematika + nilaiFisika + nilaiKimia >= 190) || (nilaiMatematika + nilaiFisika >= 140)){ 
        }else{
              kelayakan = "tidakLayakIkutKursus";
            
        }
        return kelayakan;
    }
    
}
