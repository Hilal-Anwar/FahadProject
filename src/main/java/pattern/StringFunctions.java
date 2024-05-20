package pattern;

public class StringFunctions
{
    public static void main(String[] args) {
        String a="Hellow",b="Yellow";
        System.out.println(a.length()+b.length());
        System.out.println(a.concat(b));
        System.out.println(a.charAt(2)+a.charAt(1));
        System.out.println(b.charAt(a.indexOf('H')));
        System.out.println(a.lastIndexOf('l'));
        System.out.println(a.substring(2));
        System.out.println(a.substring(2,4));
        System.out.println(a.concat(b).substring(2,9));
    }
}
