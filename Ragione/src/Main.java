import prog.io.ConsoleInputManager;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        ConsoleInputManager in = new ConsoleInputManager();
        System.out.println("location of the file and name.txt: ");
        String $line;
        boolean ancora = true;
        BufferedWriter bw = new BufferedWriter(new FileWriter(in.readLine()));
        while (ancora) {
            $line = in.readLine();
            bw.write($line + "\n");
            if ($line == "/stop;") {
                ancora = false;
                bw.close();
            }

        }


    }


}
