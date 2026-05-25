package String_Java_Programs;

public class Reverse_sentence {

    public static void main (String args[]) {

        String s = "try me and reverse";
        String[] s1 = s.split(" ");
        String rev = "";
        for (int i = s1.length - 1; i >= 0; i--) {
            rev = rev + s1[i] + " ";
        }
        System.out.println(rev);
    }
}
