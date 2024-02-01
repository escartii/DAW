package lib_objetos;

public class Tiempo implements Comparable<Tiempo> {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor por defecto
    public Tiempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor con parametros
    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Getters y Setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // Metodo que suma
    public static void sumar(Tiempo t1, Tiempo t2, Tiempo t3) {
        t3.setHoras(t1.getHoras() + t2.getHoras());
        t3.setMinutos(t1.getMinutos() + t2.getMinutos());
        t3.setSegundos(t1.getSegundos() + t2.getSegundos());

        if (t3.getSegundos() >= 60) {
            t3.setMinutos(t3.getMinutos() + 1);
            t3.setSegundos(t3.getSegundos() - 60);
        }
        if (t3.getMinutos() >= 60) {
            t3.setHoras(t3.getHoras() + 1);
            t3.setMinutos(t3.getMinutos() - 60);
        }

        System.out.println(t3.toString());
    }

    // Metodo que resta
    public static void restar(Tiempo t1, Tiempo t2, Tiempo t3) {
        t3.setHoras(t1.getHoras() - t2.getHoras());
        t3.setMinutos(t1.getMinutos() - t2.getMinutos());
        t3.setSegundos(t1.getSegundos() - t2.getSegundos());

        if (t3.getSegundos() < 0) {
            t3.setMinutos(t3.getMinutos() - 1);
            t3.setSegundos(t3.getSegundos() + 60);
        }
        if (t3.getMinutos() < 0) {
            t3.setHoras(t3.getHoras() - 1);
            t3.setMinutos(t3.getMinutos() + 60);
        }

        System.out.println(t3.toString());
    }

    // Metodo toString para formatear la salida
    public String toString() {
        String horaString = (horas < 10) ? "0" + horas : String.valueOf(horas);
        String minutosString = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);
        String segundosString = (segundos < 10) ? "0" + segundos : String.valueOf(segundos);
        return horaString + "h " + minutosString + "m " + segundosString + "s";
    }

    private int getTotalSeconds() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    // Implementacion del metodo compareTo
    @Override
    public int compareTo(Tiempo other) {
        int totalSeconds1 = this.getTotalSeconds();
        int totalSeconds2 = other.getTotalSeconds();

        if (totalSeconds1 < totalSeconds2) {
            return -1;
        } else if (totalSeconds1 > totalSeconds2) {
            return 1;
        } else {
            return 0;
        }
    }
}
