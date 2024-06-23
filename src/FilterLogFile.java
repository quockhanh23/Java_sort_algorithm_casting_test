

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilterLogFile {

    static String fileName = "D:\\Users\\SGSVCMC9\\Downloads\\liferay.2024-05-28.log";

    public static void getDate(String value) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(value)) {
                    int check = line.indexOf("1570905");
                    if (check > 0) {
                        String newLine = line.substring(10, 23).trim();
                        list.add(newLine);
                        System.out.println(newLine);
                    }
                }
            }
            System.out.println(list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void export(List<String> startLines) {
        String csvFileName = "D:\\Users\\SGSVCMC9\\Downloads\\output.csv";
        try (FileWriter csvWriter = new FileWriter(csvFileName)) {
            for (String startLine : startLines) {
                csvWriter.write(startLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

//        getDate("[Get FundingsList API][START]");
//        getDate("[Funding][Get FundingsList API][END]");
//
//        getDate("[CFDCWL][getCWLList API][START]");
//        getDate("[CFDCWL][getCWLList API][END]");
//
//        getDate("[FXConversion][QueryFxTnx][START]");
        getDate("[FXConversion][QueryFxTnx][END]");
    }


    public static void getLog() {
        String test = "";
        List<String> logList = new ArrayList<>();
        List<String> logListStart = new ArrayList<>();
        List<String> logListEnd = new ArrayList<>();
        String[] lines = test.split("\n");
        for (String line : lines) {
            if (line.contains("2024")) {
                logList.add(line);
            }
        }
        for (int i = 0; i < logList.size(); i++) {
            int checkindex = logList.get(i).indexOf("[START]");
            if (checkindex > 0) {
                logListStart.add(logList.get(i));
                continue;
            }
            int checkindex1 = logList.get(i).indexOf("[END]");
            if (checkindex1 > 0) {
                logListEnd.add(logList.get(i));
            }
        }
        for (int i = 0; i < logListStart.size(); i++) {
            System.out.println(logListStart.get(i));
        }
        for (int i = 0; i < logListEnd.size(); i++) {
            System.out.println(logListEnd.get(i));
        }
    }
}
