import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Compress\n2. Decompress");
        int choice = sc.nextInt();

        try {
            if (choice == 1) {
                System.out.println("Enter number of files to compress:");
                int n = sc.nextInt();
                sc.nextLine(); // consume newlineṇ
                String[] files = new String[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter path for file " + (i + 1) + ": ");
                    files[i] = sc.nextLine();
                }

                System.out.print("Enter output ZIP file path (e.g., output.zip): ");
                String zipPath = sc.nextLine();

                FileCompressor.compressFiles(files, zipPath);

            } else if (choice == 2) {
                sc.nextLine(); // consume newline
                System.out.print("Enter path of zip file: ");
                String zipFile = sc.nextLine();

                System.out.print("Enter output directory: ");
                String outputDir = sc.nextLine();

                FileDecompressor.decompressFiles(zipFile, outputDir);
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
