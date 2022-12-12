package conversormonedas;

public class ConversoMonedas_Logica {
    double dEstadounidense=1;
    double euro=1.05;
    double pArgentino=320;
    double boliviano=6.90;
    double real=5.24;
    double dCanadiense=1.37;
    double pChileno=861.88;
    double pColombiano=4807;
    double cCostarricense=586.42;
    double pCubano=24;
    double pMexicano=19.78;
    double gParaguayo=7140.39;
    double sPeruano=3.84;        
    double pDominicano=55.15;
    double pUruguayo=39.08;
    double bVenezolano=13.58;
    
public double calcularCambio(String moneda, double cantidad){
        double resultado=0.0d;
        switch (moneda){
            case "Peso argentino":
                resultado=this.pArgentino * cantidad;
            break;    
        
            case "Boliviano":
                resultado=this.boliviano * cantidad;
            break;
            case "Real brasileño":
                resultado=this.real * cantidad;
            break;
            case "Dólar canadiense":
                resultado=this.dCanadiense * cantidad;
            break;
            case "Peso chileno":
                resultado=this.pChileno * cantidad;
            break;
            case "Peso colombiano":
                resultado=this.pColombiano * cantidad;
            break;
            case "Colón costarricense":
                resultado=this.cCostarricense * cantidad;
            break;
            case "Peso cubano":
                resultado=this.pCubano * cantidad;
            break;
            case "Dólar estadounidense":
                resultado=this.dEstadounidense * cantidad;
            break;
            case "Peso mexicano":
                resultado=this.pMexicano * cantidad;
            break;
            case "Guaraní paraguayo":
                resultado=this.gParaguayo * cantidad;
            break;
            
            case "Sol peruano":
                resultado=this.sPeruano * cantidad;
            break;
            
            case "Peso dominicano":
                resultado=this.pDominicano * cantidad;
            break;
            
            case "Peso uruguayo":
                resultado=this.pUruguayo * cantidad;
            break;
            case "Bolívar venezolano":
                resultado=this.bVenezolano * cantidad;
            break;
            case "Euro":
                resultado=this.euro * cantidad;
            break;
            
        }
        
        return resultado;
    }
}