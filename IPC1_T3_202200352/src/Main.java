import java.util.ArrayList;

// Clase abstracta Figura
abstract class Figura {
    protected int numeroLados;

    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    public int getNumeroLados() {
        return numeroLados;
    }
}

// Subclase de Figura: Triangulo
class Triangulo extends Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        super(3); // Triángulo tiene 3 lados
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Subclase de Figura: Cuadrado
class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        super(4); // Cuadrado tiene 4 lados
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Subclase de Figura: Circulo
class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        super(0); // Círculo no tiene lados (en el contexto de la figura)
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una lista de Figuras
        ArrayList<Figura> figuras = new ArrayList<>();

        // Crear instancias de las subclases y agregarlas a la lista
        figuras.add(new Triangulo(5, 7));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));

        // Iterar sobre la lista e imprimir el nombre de la figura junto con el área calculada
        figuras.forEach((figura) -> {
            if (figura instanceof Triangulo) {
                System.out.println("Triangulo - Área: " + figura.calcularArea());
            } else if (figura instanceof Cuadrado) {
                System.out.println("Cuadrado - Área: " + figura.calcularArea());
            } else if (figura instanceof Circulo) {
                System.out.println("Circulo - Área: " + figura.calcularArea());
            }
        });
    }
}
