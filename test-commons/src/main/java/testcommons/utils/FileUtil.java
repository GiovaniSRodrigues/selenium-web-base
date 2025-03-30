package testcommons.utils;

import java.io.IOException;
import java.nio.file.*;

public class FileUtil {

    public static void createDirectoryIfNotExists(String path) throws IOException {
        Path dirPath = Paths.get(path);
        if (!Files.exists(dirPath)) {
            Files.createDirectories(dirPath);
        }
    }

    public static void deleteFileIfExists(String filePath) throws IOException {
        Files.deleteIfExists(Paths.get(filePath));
    }
}
