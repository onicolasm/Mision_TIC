public class Personaje {

    // Inserte acá los atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    // Inserte acá el método constructor

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

   // public void golpear(Personaje p) {
     //   p.setVida( p.getVida() - (getDamage() / calcularDistanciaRespectoPersonaje(p)) );
    //}
    public void golpear(Personaje p) {
        p.setVida(p.getVida() - (getDamage() / calcularDistanciaRespectoPersonaje(p)));
    } 
   


    public void recibirImpacto(double d) {
       setVida(getVida() - d); 
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        return Math.sqrt(Math.pow(getPosicionX() - p.getPosicionX(),2) + Math.pow(getPosicionY() - p.getPosicionY(), 2 ));
    }
    
    //public double calcularDistanciaRespectoPersonaje(Personaje p) {
    //return (posicionX + posicionY) - (p.posicionX + p.posicionY);
    //}
    // Inserte acá los SETTERS Y GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return this.posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return this.posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        // if ((vida > 0) && (vida <= 100)) {
        this.vida = vida;
        if(getVida() < 0){
            this.vida = 0;
        }
    }

}