package Ejercicio6_redSocial;

public class Main {
    public static void main(String[] args) {
        RedSocial red = new RedSocial();
        Usuario marta = new Usuario("marta_92");
        Usuario diego = new Usuario("diego.dev");

        red.enviarSolicitud(marta, diego);
        diego.mostrarBandeja();

        red.aceptarSolicitud(diego, marta);
        marta.mostrarBandeja();

        red.enviarSolicitud(marta, diego);
    }
}
