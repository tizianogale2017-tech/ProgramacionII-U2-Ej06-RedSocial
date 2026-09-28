package Ejercicio6_redSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private List<Usuario> listaAmigos = new ArrayList<>();
    private List<String> bandejaNotificaciones = new ArrayList<>();

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void recibirNotificacion(String mensaje) {
        bandejaNotificaciones.add(mensaje);
    }

    public void agregarAmigo(Usuario amigo) {
        if (!listaAmigos.contains(amigo)) {
            listaAmigos.add(amigo);
        }
    }

    public boolean esAmigoDe(Usuario otro) {
        return listaAmigos.contains(otro);
    }

    public void mostrarBandeja() {
        System.out.println("Bandeja de " + nombreUsuario + " (" + bandejaNotificaciones.size() + "):");
        for (String n : bandejaNotificaciones) {
            System.out.println("  - " + n);
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getCantidadAmigos() {
        return listaAmigos.size();
    }
}
