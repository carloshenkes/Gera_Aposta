package com.loteria.gui;

import com.acme.model.file.FileManager;
import com.loteria.jogo.Jogo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFileChooser;

/**
 * @version 0.1
 * @author carloshenkes
 */
public class PrincipalFrame extends javax.swing.JFrame {

    private String aposta;
    private Jogo jogo;
    ArrayList jogosLoto, jogosMega;
    HashMap<String, ArrayList> jogos;

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
        jtfNumExcludeLoto = new javax.swing.JTextField();
        jlApostaGerada = new javax.swing.JLabel();
        jtfNumExcludeMega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaAposta = new javax.swing.JTextArea();
        jtfqntJogos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbArmazenaJogos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfQntJogAr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbLoadGames = new javax.swing.JButton();

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
        jbLoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLotoActionPerformed(evt);
            }
        });

        jbMega.setText("MegaSena");
        jbMega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbMegaMouseClicked(evt);
            }
        });

        jlApostaGerada.setText("APOSTA GERADA: ");

        jtaAposta.setColumns(20);
        jtaAposta.setRows(5);
        jScrollPane1.setViewportView(jtaAposta);

        jtfqntJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfqntJogosActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantddade de jogos:");

        jbArmazenaJogos.setText("Armazenar");
        jbArmazenaJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbArmazenaJogosMouseClicked(evt);
            }
        });

        jLabel1.setText("Armazena Jogos");

        jLabel3.setText("jogos ");

        jbLoadGames.setText("Carregar Jogos");
        jbLoadGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLoadGamesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTitle)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfqntJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbLoto)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNumExcludeLoto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbMega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNumExcludeMega))
                            .addComponent(jlApostaGerada))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQntJogAr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jbLoadGames)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbArmazenaJogos)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitle)
                    .addComponent(jLabel2)
                    .addComponent(jtfqntJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLoto)
                    .addComponent(jtfNumExcludeLoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMega)
                    .addComponent(jtfNumExcludeMega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlApostaGerada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbArmazenaJogos)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtfQntJogAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLoadGames))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLotoActionPerformed

    }//GEN-LAST:event_jbLotoActionPerformed

    private void jbLotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLotoMouseClicked
        jogosLoto = new ArrayList<String>();
        String aposta = new String();
        try {
            int count = 0;
            String tL = jtfNumExcludeLoto.getText();
            Jogo j = new Jogo("loto");
            j.setQntJogos(Integer.valueOf(jtfqntJogos.getText()));
            j.selecionaJogo();
            j.separaNumeros(jtfNumExcludeLoto.getText());
            while (count < j.getQntJogos()) {
                jtaAposta.setText(j.geraAposta().toString());
                System.out.println(j.geraAposta().toString());
                count++;
                aposta = aposta + j.geraAposta().toString() + "\n";
                jogosLoto.add(aposta);
                if (!j.selecionaJogo().equals("null")) {
                    jogos.put(j.selecionaJogo(), jogosLoto);
                }
            }
            jtaAposta.setText(aposta);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbLotoMouseClicked

    private void jbMegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMegaMouseClicked
        jogosMega = new ArrayList<String>();
        String aposta = new String();
        try {
            int count = 0;
            Jogo j = new Jogo("quina");
            j.setQntJogos(Integer.valueOf(jtfqntJogos.getText()));
            j.separaNumeros(jtfNumExcludeMega.getText());
            j.selecionaJogo();
            while (count < j.getQntJogos()) {
                jtaAposta.setText(j.geraAposta().toString());
                System.out.println(j.geraAposta().toString());
                aposta = aposta + j.geraAposta().toString() + "\n";
                jogosMega.add(aposta);
                count++;
                if (!j.selecionaJogo().equals("null")) {
                    jogos.put(j.selecionaJogo(), jogosMega);
                }
            }
            jtaAposta.setText(aposta.replace("[", "").replace("]", ""));
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbMegaMouseClicked

    private void jtfqntJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfqntJogosActionPerformed

    }//GEN-LAST:event_jtfqntJogosActionPerformed

    private void jbArmazenaJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbArmazenaJogosMouseClicked
        save();
    }//GEN-LAST:event_jbArmazenaJogosMouseClicked

    private void jbLoadGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoadGamesMouseClicked
        open();
    }//GEN-LAST:event_jbLoadGamesMouseClicked

    void open() {
        int result = jfcFiles.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = jfcFiles.getSelectedFile();
        this.jogos = FileManager.openFile(f);
        //jtfQntJogAr.setText(String.valueOf(jogos.size()));
    }

    private void save() {
        int result = jfcFiles.showSaveDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = jfcFiles.getSelectedFile();
        FileManager.saveFile(jogos, f);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbArmazenaJogos;
    private javax.swing.JButton jbLoadGames;
    private javax.swing.JButton jbLoto;
    private javax.swing.JButton jbMega;
    private javax.swing.JFileChooser jfcFiles;
    private javax.swing.JLabel jlApostaGerada;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextArea jtaAposta;
    private javax.swing.JTextField jtfNumExcludeLoto;
    private javax.swing.JTextField jtfNumExcludeMega;
    private javax.swing.JTextField jtfQntJogAr;
    private javax.swing.JTextField jtfqntJogos;
    // End of variables declaration//GEN-END:variables
}
