public class Main {
    public static void main(String[] args) {
        String[] students= new String[3];
        students[0]="Engin";
        students[1]="Derin";
        students[2]="Salih";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("----------------------");

        //for dongusu farkli kullanim !!
        for(String student:students){
            System.out.println(student);
        }
    }
}