package Classes;

import java.util.ArrayList;
import java.util.List;

public class Teste {
  public static void main(String [] args) {
    List<FormaBidimensional> formas2D = new ArrayList<>();
    formas2D.add(new Circulo(5));
    formas2D.add(new Retangulo(4, 6));
    formas2D.add(new Quadrado(4));
    
    for (FormaBidimensional forma : formas2D) {
        System.out.println(forma.getNome() + ":");
        System.out.println("Área: " + forma.calcularArea());
        System.out.println("Perímetro: " + forma.calcularPerimetro());
        System.out.println();
    }
    List<FormaTridimensional> formas3D = new ArrayList<>();
    formas3D.add(new Cubo(3));
    for (FormaTridimensional forma : formas3D) {
        System.out.printf("Forma: %s%n", forma.getNome());
        System.out.printf(" -> Área Total da Superfície: %.2f%n", forma.calcularArea());
        System.out.printf(" -> Volume: %.2f%n", forma.calcularVolume());

  }
  }
    
}
