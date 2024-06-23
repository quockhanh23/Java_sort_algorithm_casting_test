import Test.Account;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestFileCSV {

    private static List<Account> innitData() {
        Account account1 = new Account("ไม้จัตวา", "ไม้จัตวา", "ไม้จัตวา", "1", "1", "1");
        Account account2 = new Account("1", "1", "1", "1", "1", "1");
        Account account3 = new Account("1", "1", "1", "1", "1", "1");
        Account account4 = new Account("1", "1", "1", "1", "1", "1");
        Account account5 = new Account("1", "1", "1", "1", "1", "1");
        Account account6 = new Account("1", "1", "1", "1", "1", "1");
        List<Account> list = new ArrayList<>();
        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);
        list.add(account5);
        list.add(account6);
        return list;
    }

    public static void main(String[] args) throws IOException {
        List<Account> list = innitData();
        try (FileOutputStream fos = new FileOutputStream("D:\\alo1212.csv")
        ) {
            fos.write(239);
            fos.write(187);
            fos.write(191);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(osw);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(String.valueOf(list.get(i)));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            osw.close();
            fos.close();
            long bytes = Files.size(Path.of("D:\\alo1212.csv"));
            System.out.println(bytes);
            String line = "שלום, hello, привет";
            OutputStream os = new FileOutputStream("D:\\alo2.csv");
            os.write(239);
            os.write(187);
            os.write(191);
            PrintWriter w = new PrintWriter(new OutputStreamWriter(os, "UTF-8"));
            w.print(line);
            w.flush();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
