
public class Enemigo extends Personaje {
    // ^ (Enemigo hereda de Personaje)
    // Inserte acá los atributos

    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    // Inserte acá el método constructor

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void evolucionar() {
        if (getVida() <= 30 && getEvolucionesAplicadas() == 0) {
            setDamage(getDamage() + 20);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
        }
        if (getVida() <= 10 && getEvolucionesAplicadas() == 1) {
            setResistencia(getResistencia() + 1);
            setEvolucionesAplicadas(getEvolucionesAplicadas() + 1);
        }
    }

    public void recibirImpacto(double d) {
        setVida(getVida() - (d / getResistencia()));
    }

    // Inserte acá los SETTERS Y GETTERS
    public int getEvolucionesAplicadas() {
        return this.evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return this.resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
