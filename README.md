#  ZipMaster

**ZipMaster** – A lightweight Java utility for file compression and decompression.

---

##  Overview

ZipMaster is a command‑line Java application that allows you to compress files into ZIP archives and extract files from ZIP archives. It provides a straightforward, no‑frills interface to quickly manage ZIP files through the terminal.

---

##  Features

- Compress individual files into `.zip` format
- Decompress `.zip` archives and extract their contents
- Simple CLI interface for ease of use
- Pure Java implementation – no external dependencies required

---

##  Tech Stack

- **Language:** Java  
- **Build Tool:** (specify if using Maven, Gradle, or plain `javac`)  
- **Open-Source:** Free to use and contribute

---

##  Project Structure

```
ZipMaster/
│
├── Main.java               # Application entry point
├── FileCompressor.java     # Utility for compressing files
└── FileDecompressor.java   # Utility for decompressing ZIP archives
```

---

##  Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/tamilkumaran3/ZipMaster.git
cd ZipMaster
```

### 2. Build the Application

If you're compiling manually:
```bash
javac *.java
```

For Maven-based projects, you might use:
```bash
mvn clean compile
```

(or adjust to Gradle, if applicable)

---

##  Usage

Once compiled, use the application from the command line:

### To compress a file:
```bash
java Main compress path/to/inputFile.txt path/to/outputArchive.zip
```

Example:
```bash
java Main compress report.docx report.zip
```

### To decompress an archive:
```bash
java Main decompress path/to/archive.zip path/to/destinationDirectory
```

Example:
```bash
java Main decompress images.zip images_folder
```

---

##  Contributing

Contributions are welcome! To get started:

1. Fork the repository  
2. Create a new feature branch (`feature-name`)  
3. Make your changes  
4. Commit and push your branch  
5. Submit a Pull Request with description of your enhancements

Please follow Java best practices, include tests (if possible), and provide usage documentation for new features.

---

##  License

This project is released under the **MIT License** — feel free to use, modify, and distribute it.

---

##  Acknowledgements

Thanks to the open-source community and any Java ZIP utility inspirations that guided development.
