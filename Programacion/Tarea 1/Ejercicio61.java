public class Ejercicio61 {
    public static void main (String[] args){
        byte b = 1;
        short s = 1000;
        long ln = 1231829312983l;
        int i = 27;
        int j = 3;
        float f = 33.33f;
        double d = 271.98;
        char c = (char) 'c'; // convierto el caracter 'c' en su valor ASCII

        // Resultados
        int resultado = c+i;
        int resultadoB = b+c;
        long resultadoC = j-4L; // para poder sumar un numero int y una variable long, debemos utilizar long para poder sumarlos
        float resultadoD = f-c; // lo mismo para float, ya que es un numero con decimal
        int resultadoE = b/c+s;
        float resultadoF = resultadoC * 2.5F; // utilizo la variable resultadoC para hacer el siguiente ejercicio
        double resultadoG = d+f;
        int resultadoH = c+c;
        long resultadoI = ln+c;
        int resultadoJ = 'a'+c;
        int resultadoK = s+j;
        int resultadoL = s*c;
        double resultadoM = i*f*2.5;
        double resultadoN = 2/i+2.0/j;
        System.out.println(resultado); // 99 +27
        System.out.println(resultadoB); // 99 +1 
        System.out.println(resultadoC);
        System.out.println(resultadoD);
        System.out.println(resultadoE);
        System.out.println(resultadoF);
        System.out.println(resultadoG);
        System.out.println(resultadoH);
        System.out.println(resultadoI);
        System.out.println(resultadoJ);
        System.out.println(resultadoK);
        System.out.println(resultadoL);
        System.out.println(resultadoM);
        System.out.println(resultadoN);
    }
}
