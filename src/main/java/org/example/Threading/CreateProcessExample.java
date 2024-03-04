import java.io.IOException;

public class CreateProcessExample {
    public static void main(String[] args) {
        try {
            // Run a simple command (for example, opening a text file with the default text editor)
            Process process = Runtime.getRuntime().exec("notepad.exe");
            // ProcessBuilder pb = Runtime.getRuntime().exec("notepad.exe");
            // pb.command("write hell");

            // You can also use a ProcessBuilder for more control over the process
            // ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
            // Process process = processBuilder.start();

            // Wait for the process to complete (optional)
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}