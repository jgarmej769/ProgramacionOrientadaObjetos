/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen2526;

public class EjemplosStringYCharacter {

    public static void main(String[] args) {

        System.out.println("=== MÉTODOS DE STRING ===\n");

        // 1. length()
        String s1 = "Hola";
        System.out.println("length(): " + s1.length()); // 4

        // 2. charAt()
        String s2 = "curso";
        System.out.println("charAt(2): " + s2.charAt(2)); // 'r'

        // 3. indexOf()
        String s3 = "programación";
        System.out.println("indexOf(\"ma\"): " + s3.indexOf("ma")); // 5

        // 4. lastIndexOf()
        String s4 = "banana";
        System.out.println("lastIndexOf(\"a\"): " + s4.lastIndexOf("a")); // 5

        // 5. isEmpty()
        String s5 = "";
        System.out.println("isEmpty(): " + s5.isEmpty()); // true

        // 6. equals()
        System.out.println("\"Hola\".equals(\"hola\"): " + "Hola".equals("hola")); // false

        // 7. equalsIgnoreCase()
        System.out.println("\"Hola\".equalsIgnoreCase(\"hola\"): " + "Hola".equalsIgnoreCase("hola")); // true

        // 8. toUpperCase()
        String s6 = "java";
        System.out.println("toUpperCase(): " + s6.toUpperCase()); // JAVA

        // 9. toLowerCase()
        String s7 = "CADENA";
        System.out.println("toLowerCase(): " + s7.toLowerCase()); // cadena

        // 10. trim()
        String s8 = "  hola  ";
        System.out.println("trim(): '" + s8.trim() + "'"); // 'hola'

        // 11. replace()
        String s9 = "casa";
        System.out.println("replace('a', 'o'): " + s9.replace('a', 'o')); // coso

        // 12. replaceAll()
        String s10 = "123-456-789";
        System.out.println("replaceAll(\"-\", \":\"): " + s10.replaceAll("-", ":")); // 123:456:789

        // 13. substring()
        String s11 = "programación";
        System.out.println("substring(0, 7): " + s11.substring(0, 7)); // program

        // 14. concat()
        String s12 = "Hola ".concat("mundo");
        System.out.println("concat(): " + s12); // Hola mundo

        // 15. contains()
        System.out.println("contains(\"Java\"): " + "curso de Java".contains("Java")); // true

        // 16. startsWith()
        System.out.println("startsWith(\"com\"): " + "computador".startsWith("com")); // true

        // 17. endsWith()
        System.out.println("endsWith(\".txt\"): " + "archivo.txt".endsWith(".txt")); // true

        // 18. compareTo()
        System.out.println("\"abc\".compareTo(\"abd\"): " + "abc".compareTo("abd")); // -1

        // 19. toCharArray()
        char[] arr = "hola".toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : arr) System.out.print(c + " ");
        System.out.println();

        // 20. valueOf()
        String numero = String.valueOf(123);
        System.out.println("valueOf(123): " + numero); // "123"

        // 21. split() -> EJEMPLO AÑADIDO
        String csv = "rojo,verde,azul";
        String[] colores = csv.split(","); // divide por la coma
        System.out.println("\nsplit(\",\") -> elementos:");
        for (int i = 0; i < colores.length; i++) {
            System.out.println("  [" + i + "] = " + colores[i]);
        }
        // Ejemplo con expresion regular y límite (preserva espacios si existen)
        String texto = "uno;dos;tres;cuatro";
        String[] partesLimitadas = texto.split(";", 3); // máximo 3 partes: las dos primeras separadas y el resto como última
        System.out.println("\nsplit(\";\", 3) -> elementos:");
        for (int i = 0; i < partesLimitadas.length; i++) {
            System.out.println("  [" + i + "] = " + partesLimitadas[i]);
        }

        // =====================================================
        System.out.println("\n=== MÉTODOS DE CHARACTER ===\n");
        // =====================================================

        // 1. isLetter()
        System.out.println("isLetter('a'): " + Character.isLetter('a')); // true

        // 2. isDigit()
        System.out.println("isDigit('5'): " + Character.isDigit('5')); // true

        // 3. isLetterOrDigit()
        System.out.println("isLetterOrDigit('!'): " + Character.isLetterOrDigit('!')); // false

        // 4. isWhitespace()
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(' ')); // true

        // 5. isUpperCase()
        System.out.println("isUpperCase('A'): " + Character.isUpperCase('A')); // true

        // 6. isLowerCase()
        System.out.println("isLowerCase('a'): " + Character.isLowerCase('a')); // true

        // 7. toUpperCase()
        System.out.println("toUpperCase('a'): " + Character.toUpperCase('a')); // 'A'

        // 8. toLowerCase()
        System.out.println("toLowerCase('Z'): " + Character.toLowerCase('Z')); // 'z'
    }
}

