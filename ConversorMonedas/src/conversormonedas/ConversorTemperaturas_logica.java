package conversormonedas;

public class ConversorTemperaturas_logica {
 
    public String kelvinTOcelsius(double kelvin){
        return String.valueOf(kelvin - 273.15 + "°K");
    }
    
    public String celsiusTOkelvin(double celsius){
        return String.valueOf(celsius + 273.15 + "°C");
    }
    
    public String fahrenheitTOkelvin(double fahrenheit){
        return String.valueOf((fahrenheit - 32) * 5/9 + 273.15);
    }
    
    public String kelvinTOfahrenheit(double kelvin){
        return String.valueOf((kelvin - 273.15)* 9/5 + 32);
    }
    
    public String celsiusTOfahrenheit(double celsius){
        return String.valueOf((celsius * 9/5) + 32);
    }
    public String fahrenheitTOcelsius(double fahrenheit){
        return String.valueOf((fahrenheit - 32) * 5/9);
    }
    
}
