package modelos;

import java.io.*;

public class Report {
    
    private String nameFile;
    private String title;
    private String content;
    private String extension;

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void makeReport() {
        if ((getNameFile() != null) && (getTitle() != null ) && (getContent() != null)) {
            //Crear el archivo

            try {
                File file = new File(getNameFile()+"." + getExtension());
                FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Archivo vacio");
        }
    }
    
}
