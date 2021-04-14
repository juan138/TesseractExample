/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesseractexample;

import java.io.File;
import net.sourceforge.tess4j.*;

/**
 *
 * @author DBLANCOPC
 */
public class TesseractExample2 {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
    public void main() {
        File imageFile = new File("C:\\Users\\DBLANCOPC\\Documents\\NetBeansProjects\\TesseractExample\\test-data\\cert2\\TJ-383.pdf");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        instance.setDatapath("C:\\Users\\DBLANCOPC\\Documents\\NetBeansProjects\\TesseractExample\\tessdata"); // path to tessdata directory

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
