import java.io.*;
import java.util.Scanner;

//file nesnesi dosyayi bellege almadan dosya uzerinden okuma yapar!
//buffer nesnesi dosyayi bellege alarak bellek uzerinden okuma yapar!
//ikisini de bu islemle icin kullanabilirsin!
public class Main {
    public static void main(String[] args) {
//        createFile();
//        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\nisai\\Desktop\\project\\javademos\\files\\students.txt");
        try {
            if(file.createNewFile()){ // if icerisindeki ifade dosya olusunca true olusmayinca false donudurur.
                System.out.println("Dosya olusturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\nisai\\Desktop\\project\\javademos\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adi: "+file.getName()); // dosya adi
            System.out.println("Dosya yolu: "+file.getAbsolutePath()); // dosya yolu
            System.out.println("Dosya yazilabilir mi?: "+file.canWrite()); // dosya yazilabilirligini verir
            System.out.println("Dosya okunabilir mi?: "+file.canRead()); // dosya okunabilirligini verir
            System.out.println("Dosya boyutu (byte): "+file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\nisai\\Desktop\\project\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\nisai\\Desktop\\project\\javademos\\files\\students.txt",true));
            //eklenen append:true ozelligi dosyanin mevcut halinin sonuna ekleme yapmamizi saglar
            //yoksa doyadaki verileri her seferinde sifirlariz
            writer.newLine();//yeni satir olusturmazsam devamina yazar
            writer.write("ahmet");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}