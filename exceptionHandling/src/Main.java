public class Main {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[6]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
//        } catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println(exception);
//            //birden cok catch bulogu olabilir
        }catch (Exception exception){
            System.out.println("Loglandi");
        } finally {
            //ister try ister catch blogu calissin her turlu finally de calisir
            System.out.println("Ben her turlu calisirim.");
        }
    }
}