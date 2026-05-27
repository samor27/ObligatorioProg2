package obligatorio2026.src.main.java.uy.edu.um;

import obligatorio2026.src.main.java.uy.edu.um.doors.ProcessConsole;
import obligatorio2026.src.main.java.uy.edu.um.doors.ProcessManagerImpl;

public class Main {
    public static void main(String[] args) {

        ProcessConsole pc = new ProcessConsole(new ProcessManagerImpl());
        pc.init();

    }
}