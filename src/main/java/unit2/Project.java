package unit2;

public class Project {

    public static void main(String[] args) {
        int a = 5;

        String s = "ab";

        System.out.println(s.hashCode());
        s = s + "12";

        System.out.println(s.hashCode());

        String b = "ab12";

        // ==
        System.out.println(s==b);
        System.out.println(s.equals(b));
        System.out.println(s.hashCode()==b.hashCode());


        String a1 = "Java";
        String a2 = "Java";
        String a3 = "Java";

        System.out.println(a1.equals(a2)); // true
        System.out.println(a1.equals(a3)); // true

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());

        String a4 = new String("Java");
        System.out.println(a4.hashCode());
        System.out.println(a4.equals(a1));

        char[] array = a4.toCharArray();

        String text1 = new String(array,0,4);
        System.out.println(text1);

        System.out.println(text1.toUpperCase());
        System.out.println(text1.toLowerCase());

        String text2 = "I study Java wuth my teacher!!!";

        text2 = text2.replace("s","_");
        System.out.println(text2);

        text2 = text2.replace("_","s");
        System.out.println(text2);

        boolean logic = text2.startsWith("I study");
        System.out.println(logic);
        boolean logic2 = text2.endsWith("I study!!!");
        System.out.println(logic2);

        String text3 = "\t \t \n I study Java wuth my teacher!!! \t \t \n ";

        System.out.println(text3);

        String text4 = text3.trim();
        System.out.println(text4);

        String text5 = "I,study.Java,with_my teacher!!!";

        String[] arr = text5.split(",|\\.|\\,|_| ");

        // v.7
        for (String el : arr) {
            System.out.println(el);
        }

        StringBuilder sb = new StringBuilder("ab");
        System.out.println(sb.hashCode()+":" + sb);
        sb.append("12");

        System.out.println(sb.hashCode() + ":" + sb);


        StringBuffer sb1 = new StringBuffer("ba");
        sb1.append("12");
        System.out.println(sb1);


    }
}
