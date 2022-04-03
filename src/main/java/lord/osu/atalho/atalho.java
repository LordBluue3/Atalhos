package lord.osu.atalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class atalho {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("sh -c ./osu.AppImage\n", null, new File("/home/mikael/Downloads"));
        printResults(process);
    }

    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
