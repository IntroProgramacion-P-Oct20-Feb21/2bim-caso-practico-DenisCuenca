package casopractico;

import java.util.Scanner;

public class CasoPractico {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean bandera = true;
        String s, m, de;
        int i = 0, d;

        while (bandera) {
            System.out.println("Ingresa la cuenta que deseas crear:\n(1) Para crear Facebook.\n(2) Para crear Whatsapp.\n(3) Para crear Telegram. \n(4) Para crear Signal. \n(5) Para crear Instagram.\n(6) Para crear Flickr.\n(7) Para crear Twitter.\n(0) Para no crear cuenta");
            d = e.nextInt();
            switch (d) {
                case 1:
                    s = crearFacebook(e);
                    System.out.println(s);
                    break;
                case 2:
                    s = crearWhatsapp(e);
                    System.out.println(s);
                    break;
                case 3:
                    crearTelegram(e);
                    break;
                case 4:
                    s = crearSignal(e);
                    System.out.println(s);
                    break;
                case 5:
                    crearInstagram(e);
                    break;
                case 6:
                    s = crearFlickr(e);
                    System.out.println(s);
                    break;
                case 7:
                    crearTwitter(e);
                    break;
                case 0:
                    m = obtenerMensaje(i);
                    System.out.println(m);
                    bandera = false;
                    break;
                default:
                    System.out.println("Fuera de rango");
                    break;

            }
            i++;
        }

    }

    public static String crearFacebook(Scanner i) {
        String n, c, p, correo, cadena;
        int e;
        i.nextLine();
        System.out.println("Ingrese su nombre: ");
        n = i.nextLine();
        System.out.println("Ingrese su ciudad: ");
        c = i.nextLine();
        System.out.println("Ingrese su país: ");
        p = i.nextLine();
        System.out.println("Ingrese su correo electrónico: ");
        correo = i.nextLine();

        System.out.println("Ingrese su edad: ");
        e = i.nextInt();
        cadena = String.format("Cuenta de facebook con los datos:\nNombre de usuario: "
                + "%s   \nEdad: %d \nCiudad: %s  \nPaís: %s \nCorreo electrónico: %s\n",
                n, e, c, p, correo);
        return cadena;
    }

    public static void crearTwitter(Scanner t) {
        String n, name, lname, ciudad, p, i, c;
        int e;
        t.nextLine();
        System.out.println("Ingrese su nombre: ");
        n = t.nextLine();
        System.out.println("Ingrese su nombre de usuario:  ");
        name = t.nextLine();
        System.out.println("Ingrese su apellido:  ");
        lname = t.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = t.nextLine();
        System.out.println("Ingrese su país: ");
        p = t.nextLine();
        System.out.println("Ingrese su idioma:  ");
        i = t.nextLine();
        System.out.println("Ingrese su correo electrónico: ");
        c = t.nextLine();
        System.out.println("Ingrese su edad:  ");
        e = t.nextInt();

        System.out.printf("Cuenta de Twitter con los datos:	"
                + "\nNombre: %s \nNombre de usuario:  %s\nApellido: %s\nEdad: %d"
                + "\nCiudad:  %s  \nPaís: %s \nIdioma: %s \nCorreo electronico: %s\n",
                n, name, lname, e, ciudad, p, i, c);

    }

    public static String crearWhatsapp(Scanner t) {
        String n, ciudad, p, cadena;
        int e, phone;
        t.nextLine();
        System.out.println("Ingrese su nombre de usuario:  ");
        n = t.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = t.nextLine();
        System.out.println("Ingrese su país: ");
        p = t.nextLine();
        System.out.println("Ingrese su edad:  ");
        e = t.nextInt();
        System.out.println("Ingrese su número de telefono:  ");
        phone = t.nextInt();

        cadena = String.format("Cuenta de Whatsapp con los datos:"
                + "\nNombre de usuario: %s \n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n", n, phone, e, ciudad, p);

        return cadena;
    }

    public static void crearTelegram(Scanner t) {
        String n, ciudad, p, area;
        int phone;
        t.nextLine();
        System.out.println("Ingrese su nombre de usuario:  ");
        n = t.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = t.nextLine();
        System.out.println("Ingrese su país: ");
        p = t.nextLine();
        System.out.println("Ingrese su área de interés:  ");
        area = t.nextLine();
        System.out.println("Ingrese su número de telefono:  ");
        phone = t.nextInt();

        System.out.printf("Cuenta de Telegram con los datos:"
                + "\nNombre de usuario: %s \n"
                + "Número de teléfono: %d\n"
                + "Área de ínteres: %s\n"
                + "Ciudad: %s\n"
                + "País: %s\n", n, phone, area, ciudad, p);
    }

    public static String crearSignal(Scanner t) {
        String n, ciudad, p, cadena, hobby;
        int phone;
        t.nextLine();
        System.out.println("Ingrese su nombre de usuario:  ");
        n = t.nextLine();
        System.out.println("Ingrese su ciudad: ");
        ciudad = t.nextLine();
        System.out.println("Ingrese su país: ");
        p = t.nextLine();
        System.out.println("Ingrese su hobby principal:  ");
        hobby = t.nextLine();
        System.out.println("Ingrese su número de telefono:  ");
        phone = t.nextInt();

        cadena = String.format("Cuenta de Signal con los datos:"
                + "\nNombre de usuario: %s \n"
                + "Número de teléfono: %d\n"
                + "Hobby principal: %s\n"
                + "Ciudad: %s\n"
                + "País: %s\n", n, phone, hobby, ciudad, p);

        return cadena;
    }

    public static void crearInstagram(Scanner i) {
        String n, c, correo;
        int e;
        i.nextLine();
        System.out.println("Ingrese su nombre: ");
        n = i.nextLine();
        System.out.println("Ingrese su ciudad: ");
        c = i.nextLine();
        System.out.println("Ingrese su correo electrónico: ");
        correo = i.nextLine();
        System.out.println("Ingrese su edad: ");
        e = i.nextInt();
        System.out.printf("Cuenta de Instragram con los datos:\nNombre de usuario: %s \nEdad: %d \nCiudad: %s \nCorreo electronico: %s\n", n, e, c, correo);

    }

    public static String crearFlickr(Scanner i) {
        String n, correo, cadena;
        i.nextLine();
        System.out.println("Ingrese su nombre: ");
        n = i.nextLine();
        System.out.println("Ingrese su correo electrónico: ");
        correo = i.nextLine();
        cadena = String.format("Cuenta de Flickr con los datos: \nNombre de usuario: %s\nCorreo electrónico: %s", n, correo);
        return cadena;
    }

    public static String obtenerMensaje(int i) {
        String[] mensajeFinal = {"Campaña con poca afluencia", "Campaña moderada siga adelante", "Excelente campaña"};

        if (i <= 5 && i > 0) {
            return mensajeFinal[0];

        } else {
            if ((i >= 6) && (i <= 15)) {
                return mensajeFinal[1];

            } else {
                if (i == 0) {
                    return "No se creo cuenta alguna";
                } else {
                    if (i >= 16) {
                        return mensajeFinal[2];
                    }
                }
            }
        }
    }
}
