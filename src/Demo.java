import java.io.*;


public class Demo {
    public static String read(String path) {

        boolean missingFile = false;
        StringBuilder stringBuilder = new StringBuilder();

//используем try с ресурсами для открытия файла по пути
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String currentString;
//построчно считываем файл
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
        } catch (IOException exc) {
            missingFile = true;
        } finally {
            if (missingFile) {          //Если файл не найден
                return "Проверьте наличие файла по указанному пути: \"" + path + "\"";
            } else                      //возвращаем вычитанный текст в строке
                return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(read("C:\\test.txt"));
    }
}