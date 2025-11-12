package Classes;
public abstract class FormaBidimensional extends FormaGeometrica {
    public FormaBidimensional(String nome) {
        super(nome);
    }

    public abstract double calcularPerimetro();
    
}
