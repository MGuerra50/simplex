public class Main {

    public static void imprime(float[] answers){
        System.out.print(" " + "z" + "        " + "x1" + "      " + "x2\n");
        for(int i = 0; i<answers.length;i++){
            System.out.print(answers[i] + "    ");
        }
    }
    public static void main(String[] args) {
        Control.control();
    }


}