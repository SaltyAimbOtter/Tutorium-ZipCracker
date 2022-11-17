package de.rfh.zipper;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.IOException;

public class Cracker {

    /**
     * The path to the zip file.
     */
    public static final String ZIP_FILE_PATH = "C:\\Users\\Lars\\Downloads\\vertraulich.zip";
    /**
     * The name of the file inside the zip that should be extracted.
     */
    public static final String RESSOURCE_NAME = "secret.txt";
    /**
     * The path under which the extracted file will be saved.
     */
    public static final String DESTINATION_PATH = "C:\\Users\\Lars\\Downloads\\secret.txt";


    public static void main(String[] args) throws IOException {
        // Dein Code hier
    }

    /**
     * Attempts to extract the zip file with the given password.
     *
     * @param password The password to try.
     * @return True if the password was correct, false otherwise.
     */
    private static boolean attemptExtraction(String password) throws IOException {
        try (ZipFile zipFile = new ZipFile(ZIP_FILE_PATH, password.toCharArray())) {
            try {
                zipFile.extractFile(RESSOURCE_NAME, DESTINATION_PATH);
                return true;
            } catch (ZipException e) {
                return false;
            }
        }
    }
}
