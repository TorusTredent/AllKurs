package Lessons.Lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class NewMain {
    public static void main(String[] args) {
//        try (FileOutputStream fos = new FileOutputStream("file.txt")) {
//            String str = "hello world";
//            int a;
//            byte[] array = str.getBytes(StandardCharsets.UTF_8);
//            for (int i = 0; i < array.length; i++) {
//                fos.write(array[i]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(FileOutputStream fileOutputStream = new FileOutputStream("file1.txt")){
//            FileInputStream fileInputStream = new FileInputStream("file.txt");
//
//            int a;
//            while((a = fileInputStream.read()) != -1){
//                fileOutputStream.write(a);
//            }
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try(FileWriter fileWriter = new FileWriter("fileWriter.txt")){
//            String str = "Tms";
//            fileWriter.write(str);
//        } catch(IOException e){
//            e.printStackTrace();
//        }

//        try (FileReader fileReader = new FileReader("fileWriter.txt")) {
//            int  a;
//            while ((a = fileReader.read()) != -1) {
//                System.out.println(a);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(BufferedReader bufferReader = new BufferedReader(new FileReader("fileWriter.txt"))){
////           String str = "Hello world";
////           bufferWriter.write(str);
//            System.out.println(bufferReader.readLine());
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        File file = new File("E:\\Kurs\\src\\Lessons\\Lesson10\\text.txt");
        System.out.println(file.getName());
    }
}
