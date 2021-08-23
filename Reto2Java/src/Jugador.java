public class Jugador extends Personaje {
    // ^ (Jugador hereda de Personaje)
    // Inserte acá los atributos

    private int numeroBotiquines = 0;

    // Inserte acá el método constructor

    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void usarBotiquin() {
        if (getNumeroBotiquines() != 0) {
            setNumeroBotiquines(getNumeroBotiquines() - 1);
        }else if (getVida() < 100) {
                setVida(getVida() + 5);
            }
        }
    

    public void recogerBotiquin() {
        setNumeroBotiquines(getNumeroBotiquines() + 1); 
    }

    public void moverDerecha(double d) {
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d) {
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d) {
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d) {
        setPosicionY(getPosicionY() - d);
    }

    public void golpear(Enemigo p) {
        p.setVida( p.getVida() - (getDamage() / calcularDistanciaRespectoPersonaje(p)) );
        p.evolucionar();
    }

    // Inserte acá los SETTERS Y GETTERS

    public int getNumeroBotiquines() {
        return this.numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

}