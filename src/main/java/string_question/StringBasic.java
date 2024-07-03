package string_question;

public class StringBasic {
    public static void main(String[] args) {
        String s = " Yusuf Aziz ";
        String s1 = "Apple";
        int l = s.length();
        char c = s.charAt(1);
        int a = s.indexOf('s');
        int b = s.indexOf('u');
        int d = s.lastIndexOf('u');
        String e = s.trim();
        String f = s.toUpperCase();
        String g = s.toLowerCase();
        String h = s1.substring(1, 3);
        String i = s1.substring(2);
        System.out.println(l);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        String x = "Fatima";
        String y = "Zahra";
        System.out.println(x + " " + y);
        System.out.println(x.concat(" ").concat(y));
        String str = "hElal";
        String str1 = "helal";
        System.out.println(str.compareTo(str1));
        String m="Motashabehat";
        String n="Helal";
        System.out.println(m.compareTo(n));


    }
}
