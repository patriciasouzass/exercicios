package fundamentos;

public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float i = (float)1.547887458741; // casting
        System.out.println(i);

        int c = 120;
        byte d = (byte)c;

        System.out.println(d);
    }
}
