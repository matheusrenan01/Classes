package Classes;

public class Cubo extends FormaTridimensional {
    private final double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * lado * lado;

    
    }
    @Override
    public double calcularVolume() {
        return lado * lado * lado;
}
}
