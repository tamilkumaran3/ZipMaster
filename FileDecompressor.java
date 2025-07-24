import java.io.*;
import java.util.zip.*;

public class FileDecompressor {

    public static void decompressFiles(String zipPath, String outputDir) throws IOException {
        File destDir = new File(outputDir);
        if (!destDir.exists()) {
            destDir.mkdir();
        }

        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipPath));
        ZipEntry zipEntry = zis.getNextEntry();

        while (zipEntry != null) {
            File newFile = new File(outputDir, zipEntry.getName());

            FileOutputStream fos = new FileOutputStream(newFile);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = zis.read(bytes)) >= 0) {
                fos.write(bytes, 0, length);
            }

            fos.close();
            zipEntry = zis.getNextEntry();
        }

        zis.closeEntry();
        zis.close();
        System.out.println("Decompression complete!");
    }
}
