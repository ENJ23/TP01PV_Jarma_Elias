package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final double ADICIONAL_20 = 500;
    private final double ADICIONAL_30 = 750;
    private final double ADICIONAL_40 = 1000;

    public Pizza() {
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public double calcularPrecio() {
        if (diametro == 20) {
            if (ingredientesEspeciales) {
                precio = 4500 + ADICIONAL_20;
            } else {
                precio = 4500;
            }
        } else if (diametro == 30) {
            if (ingredientesEspeciales) {
                precio = 4800 + ADICIONAL_30;
            } else {
                precio = 4800;
            }
        } else if (diametro == 40) {
            if (ingredientesEspeciales) {
                precio = 5500 + ADICIONAL_40;
            } else {
                precio = 5500;
            }
        }
        return precio;
    }

    public void calcularArea() {
        area = Math.PI * (diametro / 2.0) * (diametro / 2.0);
    }
}
