package ar.edu.unju.fi.ejercicio12.model;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    	public void setNombre (String nombre) {
    		this.nombre = nombre;
    	}
    	public String getNombre() {
    		return nombre; 
    	}

    public int calcularEdad() {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String obtenerSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        String signo = "";

        switch (mes) {
        case Calendar.MARCH:
            if (dia >= 21) {
                signo = "Aries";
            } else {
                signo = "Piscis";
            }
            break;
        case Calendar.APRIL:
            if (dia >= 20) {
                signo = "Tauro";
            } else {
                signo = "Aries";
            }
            break;
        case Calendar.MAY:
            if (dia >= 21) {
                signo = "Géminis";
            } else {
                signo = "Tauro";
            }
            break;
        case Calendar.JUNE:
            if (dia >= 21) {
                signo = "Cáncer";
            } else {
                signo = "Géminis";
            }
            break;
        case Calendar.JULY:
            if (dia >= 23) {
                signo = "Leo";
            } else {
                signo = "Cáncer";
            }
            break;
        case Calendar.AUGUST:
            if (dia >= 23) {
                signo = "Virgo";
            } else {
                signo = "Leo";
            }
            break;
        case Calendar.SEPTEMBER:
            if (dia >= 23) {
                signo = "Libra";
            } else {
                signo = "Virgo";
            }
            break;
        case Calendar.OCTOBER:
            if (dia >= 23) {
                signo = "Escorpio";
            } else {
                signo = "Libra";
            }
            break;
        case Calendar.NOVEMBER:
            if (dia >= 22) {
                signo = "Sagitario";
            } else {
                signo = "Escorpio";
            }
            break;
        case Calendar.DECEMBER:
            if (dia >= 22) {
                signo = "Capricornio";
            } else {
                signo = "Sagitario";
            }
            break;
        case Calendar.JANUARY:
            if (dia >= 20) {
                signo = "Acuario";
            } else {
                signo = "Capricornio";
            }
            break;
        case Calendar.FEBRUARY:
            if (dia >= 19) {
                signo = "Piscis";
            } else {
                signo = "Acuario";
            }
            break;
        default:
            signo = "No se ha podido determinar el signo zodiacal.";
            break;
    }
    
    return signo;
}

    public String obtenerEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH);
        String estacion = "";

        switch (mes) {
            case Calendar.DECEMBER:
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
                estacion = "Verano";
                break;
            case Calendar.MARCH:
            case Calendar.APRIL:
            case Calendar.MAY:
                estacion = "Otoño";
                break;
            case Calendar.JUNE:
            case Calendar.JULY:
            case Calendar.AUGUST:
                estacion = "Invierno";
                break;
            case Calendar.SEPTEMBER:
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estación no encontrada";
                break;
        }

        return estacion;
    }
}
