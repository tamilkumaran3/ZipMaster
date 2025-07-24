import java.io.*;
import java.util.zip.*;

public class FileCompressor {

    public static void compressFiles(String[] filePaths, String outputZipPath) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputZipPath);
        ZipOutputStream zipOut = new ZipOutputStream(fos);

        for (String filePath : filePaths) {
            File fileToZip = new File(filePath);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
        System.out.println("Compression complete!");
    }
}
