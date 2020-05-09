public class str{
    public static void main(String[] args){
        String a = "A"+12;
        String b = 'A'+"12";
        String c = "A" + ('\t' + '\u0003');
        String d = 'A' + '1' + "2";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
