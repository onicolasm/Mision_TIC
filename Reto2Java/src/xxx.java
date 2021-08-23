
public class xxx {
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
       // Jugador j = new Jugador("Explorador", 'f', -1.0, -1.0, 130); 
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
       // Enemigo e = new Enemigo("Virico",'f', 1.0, 1.0, 120.0);              
        /*
        j.golpear(e);
        j.golpear(e); 
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);
        System.out.println();
        */

       
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        e.golpear(j);
        e.golpear(j);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        System.out.println();
        
        
        /*
        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin(); 
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);
        System.out.println();
        */
    }    

      
}
