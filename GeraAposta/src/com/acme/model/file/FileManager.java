package com.acme.model.file;

import com.loteria.jogo.Download;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jxl.*;
import jxl.read.biff.BiffException;

public class FileManager {

    /**
     * @param jo
     * @param f
     */
    public static void saveFile(ArrayList jo, File f) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(jo);
            System.out.println("Arquivo salvo com sucesso!!");
        } catch (FileNotFoundException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }
    }

    public static byte[] getJogosAnteriores(String jogoZip, String link) {
        File arq = new File(jogoZip);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        byte[] arqBytes = new Download().downloadZip(link).toByteArray();
        try {
            if (!arq.exists()) {
                fos = new FileOutputStream(arq);
                fos.write(arqBytes);
                fos.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
            System.out.println("Arquivo salvo com sucesso!!");
        }
        return arqBytes;
    }

    public static ArrayList convertXLS2Array() throws IOException, BiffException {
        ArrayList jogosAnt = new ArrayList();
        Workbook workbook = Workbook.getWorkbook(new File("D_QUINA.xls"));
        Sheet sheet = workbook.getSheet(0);
        int linhas = sheet.getRows();
        System.out.println("Iniciando a leitura da planilha XLS:");

        for (int i = 5; i < linhas; i++) {
            Cell a1 = sheet.getCell(2, i);

            Cell a2 = sheet.getCell(3, i);

            Cell a3 = sheet.getCell(4, i);

            Cell a4 = sheet.getCell(5, i);

            Cell a5 = sheet.getCell(6, i);

            String as1 = a1.getContents();

            String as2 = a2.getContents();

            String as3 = a3.getContents();

            String as4 = a4.getContents();

            String as5 = a5.getContents();

            //System.out.println("Volante: " + as1 + "," + as2 + "," + as3 + "," + as4 + "," + as5 + ",");
            
            jogosAnt.add("Volante: " + as1 + "," + as2 + "," + as3 + "," + as4 + "," + as5 + ",");

        }
        workbook.close();
        
        /*System.out.println("Imprimindo array");
        for (Object i : jogosAnt){
            System.out.println(i);
        }
        */
        System.out.println("Leitura concluida");
        return jogosAnt;
    }

    public static HashMap openFile(File f) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            HashMap jogos = (HashMap) ois.readObject();
            return jogos;

        } catch (FileNotFoundException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } catch (IOException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                System.out.println("Problema:" + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Problem:" + ex.getMessage());
            }
            System.out.println("Arquivo recuperado com sucesso!!");
        }
    }

}
