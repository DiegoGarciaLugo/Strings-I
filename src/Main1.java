import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String respuesta = "";
    int aciertos = 0;

    String[] preguntas = {
            "Indica cual de las siguientes opciones no es un tipo primitivo en Java:\na. int\nb. char\nc. boolean\nd. String",
            "¿Qué palabra clave se usa para declarar una constante en Java?\na. const\nb. final\nc. static\nd. constant",
            "¿Cuál es el valor por defecto de una variable de tipo boolean en una clase?\na. true\nb. null\nc. 0\nd. false",
            "¿Qué tipo de dato se utiliza para almacenar un número decimal de doble precisión?\na. int\nb. float\nc. double\nd. long",
            "¿Cómo se escribe un comentario de una sola línea en Java?\na. // Comentario\nb. /* Comentario */\nc. # Comentario\nd. <!-- Comentario -->",
            "¿Cuál es el tamaño en memoria de un tipo int en Java?\na. 8 bits\nb. 16 bits\nc. 32 bits\nd. 64 bits",
            "¿Qué carácter debe ir al final de casi todas las instrucciones en Java?\na. :\nb. .\nc. ,\nd. ;",
            "¿Qué operador se utiliza para obtener el resto de una división entera?\na. /\nb. %\nc. *\nd. &",
            "¿Qué método de la clase String devuelve la longitud de una cadena de texto?\na. size()\nb. count()\nc. length()\nd. getLength()",
            "¿Qué método compara el contenido de dos objetos String ignorando mayúsculas y minúsculas?\na. equals()\nb. compareTo()\nc. equalsIgnoreCase()\nd. sameAs()",
            "¿Qué operador se usa para concatenar dos cadenas de texto en Java?\na. &\nb. +\nc. .\nd. *",
            "¿Qué resultado produce la expresión 10 / 4 si ambos números son int?\na. 2.5\nb. 3\nc. 2\nd. 0",
            "¿Qué operador representa la negación lógica en Java?\na. ~\nb. not\nc. !=\nd. !",
            "¿Qué sentencia se utiliza para salir inmediatamente de un bucle o de un bloque switch?\na. stop\nb. exit\nc. break\nd. return",
            "¿Qué bucle garantiza que el código interior se ejecute al menos una vez?\na. for\nb. while\nc. do-while\nd. foreach",
            "¿Qué palabra clave salta la iteración actual de un bucle y pasa a la siguiente?\na. skip\nb. continue\nc. next\nd. pass",
            "¿Qué tipo de dato NO se puede evaluar directamente en un switch tradicional de Java?\na. int\nb. char\nc. String\nd. double",
            "¿Cuál es el índice del primer elemento de un array en Java?\na. 0\nb. 1\nc. -1\nd. Depende del tipo de dato",
            "¿Qué propiedad se usa para saber cuántos elementos tiene un array llamado numeros?\na. numeros.size()\nb. numeros.length()\nc. numeros.length\nd. numeros.count",
            "¿Qué palabra clave indica que un método no devuelve ningún valor?\na. null\nb. empty\nc. void\nd. none",
            "¿Cómo debe declararse obligatoriamente el método principal para ejecutar un programa Java?\na. public void main(String[] args)\nb. public static void main(String[] args)\nc. static void main()\nd. private static int main(String args)",
            "¿Qué palabra clave se utiliza para crear una nueva instancia u objeto de una clase?\na. create\nb. class\nc. new\nd. instance",
            "¿Qué palabra clave se usa en Java para que una clase herede de otra?\na. implements\nb. inherits\nc. super\nd. extends",
            "¿Qué componente ejecuta el bytecode compilado de Java en cualquier sistema operativo?\na. JDK\nb. JVM\nc. IDE\nd. JAR",
            "¿Qué clase de la biblioteca estándar se usa habitualmente para leer datos introducidos por teclado?\na. System\nb. Reader\nc. Scanner\nd. Keyboard"
    };

    String[] respuestasCorrectas = {
            "d", "b", "d", "c", "a",
            "c", "d", "b", "c", "c",
            "b", "c", "d", "c", "c",
            "b", "d", "a", "c", "c",
            "b", "c", "d", "b", "c"
    };

    for (int i = 0; i < preguntas.length; i++) {
        System.out.println("\nPregunta " + (i + 1) + ":");
        System.out.println(preguntas[i]);
        respuesta = scanner.nextLine();

        if (respuesta.equals(respuestasCorrectas[i])) {
            System.out.println("Respuesta correcta!");
            aciertos++;
        } else if (respuesta.equals("a")) {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: " + respuestasCorrectas[i]);
        } else if (respuesta.equals("b")) {
            System.out.println("Respueta incorrecta, la respuesta correcta es: " + respuestasCorrectas[i]);
        } else if (respuesta.equals("c")) {
            System.out.printf("Respuesta incorrecta, la respueta correcta es: " + respuestasCorrectas[i]);
        } else if (respuesta.equals("d")) {
            System.out.printf("Respuesta incorrecta, la respuesta correcta es: " + respuestasCorrectas[i]);
        }
    }
    System.out.println("Has acabado el test, has tenido " + aciertos + " aciertos");

}