package Ejercicio6_redSocial;

public class RedSocial {
    public void enviarSolicitud(Usuario remitente, Usuario receptor) {
        if (remitente == receptor) {
            System.out.println("No podés enviarte una solicitud a vos mismo.");
            return;
        }
        if (remitente.esAmigoDe(receptor)) {
            System.out.println(remitente.getNombreUsuario() + " y " + receptor.getNombreUsuario() + " ya son amigos.");
            return;
        }
        receptor.recibirNotificacion(remitente.getNombreUsuario() + " te envió una solicitud de amistad.");
        System.out.println("Solicitud enviada de " + remitente.getNombreUsuario() + " a " + receptor.getNombreUsuario() + ".");
    }

    public void aceptarSolicitud(Usuario receptor, Usuario remitente) {
        receptor.agregarAmigo(remitente);
        remitente.agregarAmigo(receptor);
        remitente.recibirNotificacion(receptor.getNombreUsuario() + " aceptó tu solicitud de amistad.");
        System.out.println(receptor.getNombreUsuario() + " aceptó la solicitud de " + remitente.getNombreUsuario() + ".");
    }
}
