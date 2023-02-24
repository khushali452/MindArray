package core_java;

public class String_opn {
    public static void main(String[] args) {
        String s ="Hello World !";

        System.out.println("length :"+ s.length());
        System.out.println("is empty?"+s.isEmpty());

        //comparision methods
        //with string :HELLO WORLD !
        System.out.println(s.equals("HELLO WORLD !"));
        System.out.println(s.equalsIgnoreCase("HELLO WORLD !"));
        System.out.println(s.compareTo("HELLO WORLD !"));

        //searching methods

        System.out.println("contains HELLO WORLD ? "+s.contains("HELLO WORLD !"));
        System.out.println("contains Hello ?" + s.contains("Hello"));
        System.out.println("starts with Hello? "+s.startsWith("Hello"));
        System.out.println("ends with ! ?"+ s.endsWith("!"));
        System.out.println("index of or"+s.indexOf("or"));
        System.out.println("last index of o"+s.lastIndexOf("o"));

        //extract individual characters
        System.out.println("char at index 4"+ s.charAt(4));

        //extract substrings
        System.out.println("substring from 4th index"+s.substring(4));
        System.out.println("substring from 4 to 9 "+ s.substring(4,9));

        //case conversions
        //returns a copy of string as strings are immutable

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //trimmming starting and ending white spaces
        System.out.println(s.trim());

        //replace
        System.out.println("\ns.replaceAll(\"o\",\"r\") :"+s.replaceAll("o","r"));

        //static method : valueOF ...all above methods were instance methods
        System.out.println(String.valueOf(4.5));

    }
}
