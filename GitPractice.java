import java.nio.file.Files;
import java.nio.file.Path;

public class GitPractice {
    public static void main(String[] args) throws Exception {

        Files.writeString(
            Path.of("activity.txt"),
            "My first Git commit created using Java!\n"
        );

        System.out.println("File created successfully!");
    }
}