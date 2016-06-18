package com.loteria.gui;

import com.acme.model.file.FileManager;
import com.loteria.jogo.Jogo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import jxl.read.biff.BiffException;

/**
 * @version 0.1
 * @author carloshenkes
 */
public class PrincipalFrame extends javax.swing.JFrame {

    Jogo jogo;
    ArrayList jogosLoto, jogosMega, jogosQuina, jogosAntQuina, jogosAntLoto, jogosAntMega;

    public PrincipalFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcFiles = new javax.swing.JFileChooser();
        jlTitle = new javax.swing.JLabel();
        jbLoto = new javax.swing.JButton();
        jbMega = new javax.swing.JButton();
        jtfNumExclude = new javax.swing.JTextField();
        jlApostaGerada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaAposta = new javax.swing.JTextArea();
        jtfqntJogos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbCarJogAnt = new javax.swing.JButton();
        jtfJogoAnterior = new javax.swing.JTextField();
        jbQuina = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(209, 220, 58));

        jlTitle.setText("APOSTADOR");
        jlTitle.setToolTipText("");

        jbLoto.setText("LotoFácil");
        jbLoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLotoMouseClicked(evt);
            }
        });

        jbMega.setText("MegaSena");
        jbMega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbMegaMouseClicked(evt);
            }
        });

        jtfNumExclude.setText("0");

        jlApostaGerada.setText("APOSTA GERADA: ");

        jtaAposta.setColumns(20);
        jtaAposta.setRows(5);
        jScrollPane1.setViewportView(jtaAposta);

        jtfqntJogos.setText("1");

        jLabel2.setText("Quantddade de jogos:");

        jbCarJogAnt.setText("Carregar jogos Anteriores");
        jbCarJogAnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCarJogAntMouseClicked(evt);
            }
        });

        jbQuina.setText("Quina");
        jbQuina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbQuinaMouseClicked(evt);
            }
        });

        jLabel4.setText("Jogo Anterior:");

        jLabel5.setText("Remover números:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbMega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbQuina)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfqntJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlApostaGerada))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbCarJogAnt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfJogoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumExclude, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitle)
                    .addComponent(jLabel2)
                    .addComponent(jtfqntJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfJogoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLoto)
                    .addComponent(jbCarJogAnt)
                    .addComponent(jbMega)
                    .addComponent(jbQuina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumExclude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlApostaGerada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLotoMouseClicked
        jogosLoto = new ArrayList<>();
        String aposta = new String();
        try {
            int count = 0;
            String tL = jtfNumExclude.getText();
            Jogo j = new Jogo("loto");
            j.selecionaJogo();
            j.setQntJogos(Integer.valueOf(jtfqntJogos.getText()));
            j.separaNumeros(jtfNumExclude.getText());
            while (count < j.getQntJogos()) {
                jtaAposta.setText(j.geraAposta().toString());
                aposta = aposta + j.geraAposta().toString() + "\n";
                jogosLoto.add(aposta);
                System.out.println(jtaAposta.getText());
                count++;
            }
            jtaAposta.setText(aposta.replace("[", "").replace("]", ""));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbLotoMouseClicked

    private void jbMegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMegaMouseClicked
        jogosMega = new ArrayList<>();
        String aposta = new String();
        try {
            int count = 0;
            Jogo j = new Jogo("mega");
            j.setQntJogos(Integer.valueOf(jtfqntJogos.getText()));
            j.separaNumeros(jtfNumExclude.getText());
            j.selecionaJogo();
            while (count < j.getQntJogos()) {
                jtaAposta.setText(j.geraAposta().toString());
                System.out.println(j.geraAposta().toString());
                aposta = aposta + j.geraAposta().toString() + "\n";
                jogosMega.add(aposta);
                count++;
            }
            jtaAposta.setText(aposta.replace("[", "").replace("]", ""));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbMegaMouseClicked

    private void jbCarJogAntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCarJogAntMouseClicked
        jogosAntQuina = loadJogo(jtfJogoAnterior.getText());
    }//GEN-LAST:event_jbCarJogAntMouseClicked

    private void jbQuinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbQuinaMouseClicked
        jogosQuina = new ArrayList<>();
        String aposta = new String();
        try {
            int count = 0;
            Jogo j = new Jogo("quina");
            j.selecionaJogo();
            j.setQntJogos(Integer.valueOf(jtfqntJogos.getText()));
            j.separaNumeros(jtfNumExclude.getText());
            while (count < j.getQntJogos()) {
                jtaAposta.setText(j.geraAposta(jogosAntQuina).toString());
                System.out.println(j.geraAposta(jogosAntQuina).toString());
                aposta = aposta + j.geraAposta(jogosAntQuina).toString() + "\n";
                jogosQuina.add(aposta);
                count++;
            }
            jtaAposta.setText(aposta.replace("[", "").replace("]", ""));
        } catch (Exception ex) {

        }
        }//GEN-LAST:event_jbQuinaMouseClicked

    ArrayList loadJogo(String Jogo) {
        ArrayList listaJogo = new ArrayList();
        try {
            listaJogo = FileManager.convertXLS2Array();
            jtfJogoAnterior.setText(String.valueOf(listaJogo.size()));
        } catch (IOException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaJogo;
    }

    void open() {
        int result = jfcFiles.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = jfcFiles.getSelectedFile();

        //jtfQntJogAr.setText(String.valueOf(jogos.size()));
    }

    void save() {
        int result = jfcFiles.showSaveDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = jfcFiles.getSelectedFile();
        FileManager.saveFile(jogosAntQuina, f);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCarJogAnt;
    private javax.swing.JButton jbLoto;
    private javax.swing.JButton jbMega;
    private javax.swing.JButton jbQuina;
    private javax.swing.JFileChooser jfcFiles;
    private javax.swing.JLabel jlApostaGerada;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextArea jtaAposta;
    private javax.swing.JTextField jtfJogoAnterior;
    private javax.swing.JTextField jtfNumExclude;
    private javax.swing.JTextField jtfqntJogos;
    // End of variables declaration//GEN-END:variables
}
