package com.mycompany.lab10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Interfata extends JFrame {

    private ClasaParinte[] vectorParinte;
    private ArrayList<ClasaCopil> vectorCopil;

    public Interfata(ClasaParinte[] vectorParinte, ArrayList<ClasaCopil> vectorCopil) {
        this.vectorParinte = vectorParinte;
        this.vectorCopil = vectorCopil;
        setSize(1100, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        setVisible(true);

        JButton buttonAndoneRobert = new JButton("Andone Robert");
        buttonAndoneRobert.setBounds(100, 100, 200, 30);
        add(buttonAndoneRobert);
        buttonAndoneRobert.addActionListener(e -> openFereastraAndoneRobert());

        JButton buttonBalloAntonio = new JButton("Ballo Antonio");
        buttonBalloAntonio.setBounds(325, 100, 200, 30);
        add(buttonBalloAntonio);
        buttonBalloAntonio.addActionListener(e -> openFereastraTony());

        JButton buttonBanicaDragos = new JButton("Banica Dragos");
        buttonBanicaDragos.setBounds(550, 100, 200, 30);
        add(buttonBanicaDragos);
        buttonBanicaDragos.addActionListener(e -> openFereastraBanicaDragos());

        JButton buttonCerneaBogdan = new JButton("Cernea Bogdan");
        buttonCerneaBogdan.setBounds(775, 100, 200, 30);
        add(buttonCerneaBogdan);
        buttonCerneaBogdan.addActionListener(e -> openFereastraCerneaBogdan());

        JButton buttonCiobotaruMario = new JButton("Ciobotaru Mario");
        buttonCiobotaruMario.setBounds(100, 150, 200, 30);
        add(buttonCiobotaruMario);
        buttonCiobotaruMario.addActionListener(e -> openFereastraCiobotaruMario());

        JButton buttonCoviltirAnton = new JButton("Coviltir Anton");
        buttonCoviltirAnton.setBounds(325, 150, 200, 30);
        add(buttonCoviltirAnton);
        buttonCoviltirAnton.addActionListener(e -> openFereastraCoviltirAnton());

        JButton buttonDinuMihai = new JButton("Dinu Mihai");
        buttonDinuMihai.setBounds(550, 150, 200, 30);
        add(buttonDinuMihai);
        buttonDinuMihai.addActionListener(e -> openFereastraDinuMihai());

        JButton buttonGrozaCosmin = new JButton("Groza Cosmin");
        buttonGrozaCosmin.setBounds(775, 150, 200, 30);
        add(buttonGrozaCosmin);
        buttonGrozaCosmin.addActionListener(e -> openFereastraGrozaCosmin());

        JButton buttonHuzumNicolas = new JButton("Huzum Nicolas");
        buttonHuzumNicolas.setBounds(100, 200, 200, 30);
        add(buttonHuzumNicolas);
        buttonHuzumNicolas.addActionListener(e -> openFereastraHuzumNicolas());

        JButton buttonIchimIonut = new JButton("Ichim Ionut");
        buttonIchimIonut.setBounds(325, 200, 200, 30);
        add(buttonIchimIonut);
        buttonIchimIonut.addActionListener(e -> openFereastraIchimIonut());

        JButton buttonIfroseDarius = new JButton("Ifrose Darius");
        buttonIfroseDarius.setBounds(550, 200, 200, 30);
        add(buttonIfroseDarius);
        buttonIfroseDarius.addActionListener(e -> openFereastraIfroseDarius());

        JButton buttonIlieTeodor = new JButton("Ilie Teodor");
        buttonIlieTeodor.setBounds(775, 200, 200, 30);
        add(buttonIlieTeodor);
        buttonIlieTeodor.addActionListener(e -> openFereastraIlieTeodor());

        JButton buttonIonitaStefan = new JButton("Ionita Stefan");
        buttonIonitaStefan.setBounds(100, 250, 200, 30);
        add(buttonIonitaStefan);
        buttonIonitaStefan.addActionListener(e -> openFereastraIonitaStefan());

        JButton buttonIsacovAndreea = new JButton("Isacov Andreea");
        buttonIsacovAndreea.setBounds(325, 250, 200, 30);
        add(buttonIsacovAndreea);
        buttonIsacovAndreea.addActionListener(e -> openFereastraIsacovAndreea());

        JButton buttonKushnirDavid = new JButton("Kushnir David");
        buttonKushnirDavid.setBounds(550, 250, 200, 30);
        add(buttonKushnirDavid);
        buttonKushnirDavid.addActionListener(e -> openFereastraKushnirDavid());

        JButton buttonManailaIonut = new JButton("Manaila Ionut");
        buttonManailaIonut.setBounds(775, 250, 200, 30);
        add(buttonManailaIonut);
        buttonManailaIonut.addActionListener(e -> openFereastraManailaIonut());

    }

    private void openFereastraAndoneRobert() {
        JFrame fereastraAndone = new JFrame("Alegeri (Andone Robert)");
        fereastraAndone.setSize(300, 150);
        fereastraAndone.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteAndone());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(btnParinte);

        fereastraAndone.add(panel);
        fereastraAndone.setVisible(true);
    }

    private void openPanelParinteAndone() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Andone Robert)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JTextField txtP2Min = new JTextField();
        JTextField txtP2Max = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);
        panel.add(new JLabel("Filtru p2 (Min):"));
        panel.add(txtP2Min);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                if (!txtP2Min.getText().isEmpty()) {
                    float min = Float.parseFloat(txtP2Min.getText());
                    if (parinte.getP2() < min) {
                        matches = false;
                    }
                }
                if (!txtP2Max.getText().isEmpty()) {
                    float max = Float.parseFloat(txtP2Max.getText());
                    if (parinte.getP2() > max) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + ", p2: " + parinte.getP2() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openFereastraTony() {
        JFrame fereastraBalloAntonio = new JFrame("Alegeri (Ballo Antonio)");
        fereastraBalloAntonio.setSize(300, 150);
        fereastraBalloAntonio.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteTony());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilTony());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraBalloAntonio.add(panel);
        fereastraBalloAntonio.setVisible(true);
    }

    private void openPanelParinteTony() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ballo Antonio)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilTony() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ballo Antonio)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("c2: " + copil.getC2() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraBanicaDragos() {
        JFrame fereastraBanicaDragos = new JFrame("Alegeri (Banica Dragos)");
        fereastraBanicaDragos.setSize(300, 150);
        fereastraBanicaDragos.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteDragos());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(btnParinte);

        fereastraBanicaDragos.add(panel);
        fereastraBanicaDragos.setVisible(true);
    }

    private void openPanelParinteDragos() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Banica Dragos)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JTextField txtP3Min = new JTextField();
        JTextField txtP3Max = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);
        panel.add(new JLabel("Filtru p3 (Min):"));
        panel.add(txtP3Min);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                if (!txtP3Min.getText().isEmpty()) {
                    float min = Float.parseFloat(txtP3Min.getText());
                    if (parinte.getP3() < min) {
                        matches = false;
                    }
                }
                if (!txtP3Max.getText().isEmpty()) {
                    float max = Float.parseFloat(txtP3Max.getText());
                    if (parinte.getP3() > max) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + ", p3: " + parinte.getP3() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openFereastraCerneaBogdan() {
        JFrame fereastraCerneaBogdan = new JFrame("Alegeri (Cernea Bogdan)");
        fereastraCerneaBogdan.setSize(300, 150);
        fereastraCerneaBogdan.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteBogdan());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilBogdan());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraCerneaBogdan.add(panel);
        fereastraCerneaBogdan.setVisible(true);
    }

    private void openPanelParinteBogdan() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Cernea Bogdan)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilBogdan() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Cernea Bogdan)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c1:"));
        panel.add(txtC1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC1.getText().isEmpty()) {
                    try {
                        byte valueFromText = Byte.parseByte(txtC1.getText());
                        if (copil.getC1() != valueFromText) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("c1: " + copil.getC1() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraCiobotaruMario() {
        JFrame fereastraCiobotaruMario = new JFrame("Alegeri (Ciobotaru Mario)");
        fereastraCiobotaruMario.setSize(300, 150);
        fereastraCiobotaruMario.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteMario());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilMario());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraCiobotaruMario.add(panel);
        fereastraCiobotaruMario.setVisible(true);
    }

    private void openPanelParinteMario() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ciobotaru Mario)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JTextField txtP2Min = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                if (!txtP2Min.getText().isEmpty()) {
                    float min = Float.parseFloat(txtP2Min.getText());
                    if (parinte.getP2() < min) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilMario() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ciobotaru Mario)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);


        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("c2: " + copil.getC2() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraCoviltirAnton() {
        JFrame fereastraCoviltirAnton = new JFrame("Alegeri (Coviltir Anton)");
        fereastraCoviltirAnton.setSize(300, 150);
        fereastraCoviltirAnton.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteAnton());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilAnton());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraCoviltirAnton.add(panel);
        fereastraCoviltirAnton.setVisible(true);
    }

    private void openPanelParinteAnton() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Coviltir Anton)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p1:"));
        panel.add(txtP1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;
                if (!txtP1.getText().isEmpty() && !parinte.getP1().contains(txtP1.getText())) {
                    matches = false;
                }
                if (matches) {
                    textArea.append("p1: " + parinte.getP1() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilAnton() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Coviltir Anton)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c3"));
        panel.add(txtC3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC3.getText().isEmpty()) {
                    try {
                        float c3Value = Float.parseFloat(txtC3.getText());
                        float copilC3 = Float.parseFloat(copil.getC3());
                        if (copilC3 != c3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c3: " + copil.getC3() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        }
        );

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraDinuMihai() {
        JFrame fereastraDinuMihai = new JFrame("Alegeri (Dinu Mihai)");
        fereastraDinuMihai.setSize(300, 150);
        fereastraDinuMihai.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteMihai());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);

        fereastraDinuMihai.add(panel);
        fereastraDinuMihai.setVisible(true);
    }

    private void openPanelParinteMihai() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Dinu Mihai)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP2 = new JTextField();
        JTextField txtP3Min = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p2:"));
        panel.add(txtP2);
        panel.add(new JLabel("Filtru p3 (Min):"));
        panel.add(txtP3Min);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP2.getText().isEmpty()) {
                    try {
                        float p2Value = Float.parseFloat(txtP2.getText());
                        if (parinte.getP2() != p2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (!txtP3Min.getText().isEmpty()) {
                    try {
                        float minP3 = Float.parseFloat(txtP3Min.getText());
                        if (parinte.getP3() < minP3) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p2: " + parinte.getP2() + ", p3: " + parinte.getP3() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openFereastraGrozaCosmin() {
        JFrame fereastraGrozaCosmin = new JFrame("Alegeri (Groza Cosmin)");
        fereastraGrozaCosmin.setSize(300, 150);
        fereastraGrozaCosmin.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteCosmin());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilCosmin());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraGrozaCosmin.add(panel);
        fereastraGrozaCosmin.setVisible(true);
    }

    private void openPanelParinteCosmin() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Groza Cosmin)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p2:"));
        panel.add(txtP2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP2.getText().isEmpty()) {
                    try {
                        float p2Value = Float.parseFloat(txtP2.getText());
                        if (parinte.getP2() != p2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p2: " + parinte.getP2() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilCosmin() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Groza Cosmin)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c1:"));
        panel.add(txtC1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC1.getText().isEmpty()) {
                    try {
                        byte c1Value = Byte.parseByte(txtC1.getText());
                        if (copil.getC1() != c1Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c1: " + copil.getC1() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraHuzumNicolas() {
        JFrame fereastraHuzumNicolas = new JFrame("Alegeri (Huzum Nicolas)");
        fereastraHuzumNicolas.setSize(300, 150);
        fereastraHuzumNicolas.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteNicolas());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilNicolas());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraHuzumNicolas.add(panel);
        fereastraHuzumNicolas.setVisible(true);
    }

    private void openPanelParinteNicolas() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Huzum Nicolas)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p2:"));
        panel.add(txtP2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP2.getText().isEmpty()) {
                    try {
                        float p2Value = Float.parseFloat(txtP2.getText());
                        if (parinte.getP2() != p2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p2: " + parinte.getP2() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilNicolas() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Huzum Nicolas)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c2: " + copil.getC2() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraIchimIonut() {
        JFrame fereastraIonut = new JFrame("Alegeri (Ichim Ionut)");
        fereastraIonut.setSize(300, 150);
        fereastraIonut.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteIonut());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilIonut());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraIonut.add(panel);
        fereastraIonut.setVisible(true);
    }

    private void openPanelParinteIonut() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ichim Ionut)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p2:"));
        panel.add(txtP2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP2.getText().isEmpty()) {
                    try {
                        float p2Value = Float.parseFloat(txtP2.getText());
                        if (parinte.getP2() != p2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p2: " + parinte.getP2() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilIonut() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ichim Ionut)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c3:"));
        panel.add(txtC3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC3.getText().isEmpty()) {
                    try {
                        float c3Value = Float.parseFloat(txtC3.getText());
                        float copilC3 = Float.parseFloat(copil.getC3());
                        if (copilC3 != c3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c3: " + copil.getC3() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        }
        );

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraIfroseDarius() {
        JFrame fereastraIfrose = new JFrame("Alegeri (Ifrose Darius)");
        fereastraIfrose.setSize(300, 150);
        fereastraIfrose.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteDarius());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilDarius());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraIfrose.add(panel);
        fereastraIfrose.setVisible(true);
    }

    private void openPanelParinteDarius() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ifrose Darius)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p3:"));
        panel.add(txtP3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP3.getText().isEmpty()) {
                    try {
                        float p3Value = Float.parseFloat(txtP3.getText());
                        if (parinte.getP3() != p3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p3: " + parinte.getP3() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilDarius() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ifrose Darius)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC1 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c1:"));
        panel.add(txtC1);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC1.getText().isEmpty()) {
                    try {
                        byte valueFromText = Byte.parseByte(txtC1.getText());
                        if (copil.getC1() != valueFromText) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }
                if (matches) {
                    textArea.append("c1: " + copil.getC1() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraIlieTeodor() {
        JFrame fereastraIlie = new JFrame("Alegeri (Ilie Teodor)");
        fereastraIlie.setSize(300, 150);
        fereastraIlie.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteTeo());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilTeo());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraIlie.add(panel);
        fereastraIlie.setVisible(true);
    }

    private void openPanelParinteTeo() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ilie Teodor)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p3:"));
        panel.add(txtP3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP3.getText().isEmpty()) {
                    try {
                        float p3Value = Float.parseFloat(txtP3.getText());
                        if (parinte.getP3() != p3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p3: " + parinte.getP3() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilTeo() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ilie Teodor)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c2: " + copil.getC2() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraIonitaStefan() {
        JFrame fereastraIonita = new JFrame("Alegeri (Ionita Stefan)");
        fereastraIonita.setSize(300, 150);
        fereastraIonita.setLocationRelativeTo(null);

        JButton btnParinte = new JButton("Afiseaza Parinte");
        btnParinte.addActionListener(e -> openPanelParinteStefan());

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilStefan());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnParinte);
        panel.add(btnCopil);

        fereastraIonita.add(panel);
        fereastraIonita.setVisible(true);
    }

    private void openPanelParinteStefan() {
        JFrame fereastraParinte = new JFrame("Clasa Parinte - Filtrare (Ionita Stefan)");
        fereastraParinte.setSize(400, 400);
        fereastraParinte.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtP3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru p3:"));
        panel.add(txtP3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraParinte.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaParinte parinte : vectorParinte) {
                boolean matches = true;

                if (!txtP3.getText().isEmpty()) {
                    try {
                        float p3Value = Float.parseFloat(txtP3.getText());
                        if (parinte.getP3() != p3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("p3: " + parinte.getP3() + "\n");
                }
            }
            fereastraParinte.setVisible(true);
        });

        fereastraParinte.add(panel, BorderLayout.CENTER);
        fereastraParinte.add(btnFiltrare, BorderLayout.NORTH);
        fereastraParinte.setVisible(true);
    }

    private void openPanelCopilStefan() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Ionita Stefan)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JTextField txtC3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c3:"));
        panel.add(txtC3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;
                if (!txtC3.getText().isEmpty()) {
                    try {
                        float c3Value = Float.parseFloat(txtC3.getText());
                        float copilC3 = Float.parseFloat(copil.getC3());
                        if (copilC3 != c3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c3: " + copil.getC3() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        }
        );

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraIsacovAndreea() {
        JFrame fereastraIsacovAndreea = new JFrame("Alegeri (Isacov Andreea)");
        fereastraIsacovAndreea.setSize(300, 150);
        fereastraIsacovAndreea.setLocationRelativeTo(null);

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilAndreea());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(btnCopil);

        fereastraIsacovAndreea.add(panel);
        fereastraIsacovAndreea.setVisible(true);
    }

    private void openPanelCopilAndreea() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Isacov Andreea)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JTextField txtC1 = new JTextField();
        JTextField txtC2 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c1:"));
        panel.add(txtC1);
        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC1.getText().isEmpty()) {
                    try {
                        float c1Value = Float.parseFloat(txtC1.getText());
                        if (copil.getC1() != c1Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c1: " + copil.getC1() + ", c2: " + copil.getC2() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraKushnirDavid() {
        JFrame fereastraKushnirDavid = new JFrame("Alegeri (Kushnir David)");
        fereastraKushnirDavid.setSize(300, 150);
        fereastraKushnirDavid.setLocationRelativeTo(null);

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilDavid());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(btnCopil);

        fereastraKushnirDavid.add(panel);
        fereastraKushnirDavid.setVisible(true);
    }

    private void openPanelCopilDavid() {
        JFrame fereastraCopil = new JFrame("Clasa Copil - Filtrare (Kushnir David)");
        fereastraCopil.setSize(400, 400);
        fereastraCopil.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JTextField txtC1 = new JTextField();
        JTextField txtC3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c1:"));
        panel.add(txtC1);
        panel.add(new JLabel("Filtru c3:"));
        panel.add(txtC3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopil.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC1.getText().isEmpty()) {
                    try {
                        byte c1Value = Byte.parseByte(txtC1.getText());
                        if (copil.getC1() != c1Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (!txtC3.getText().isEmpty()) {
                    try {
                        float c3Value = Float.parseFloat(txtC3.getText());
                        float copilC3 = Float.parseFloat(copil.getC3());
                        if (copilC3 != c3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c1: " + copil.getC1() + ", c3: " + copil.getC3() + "\n");
                }
            }
            fereastraCopil.setVisible(true);
        });

        fereastraCopil.add(panel, BorderLayout.CENTER);
        fereastraCopil.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopil.setVisible(true);
    }

    private void openFereastraManailaIonut() {
        JFrame fereastraManailaIonut = new JFrame("Alegeri (Manaila Ionut)");
        fereastraManailaIonut.setSize(300, 150);
        fereastraManailaIonut.setLocationRelativeTo(null);

        JButton btnCopil = new JButton("Afiseaza Copil");
        btnCopil.addActionListener(e -> openPanelCopilManaila());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));
        panel.add(btnCopil);

        fereastraManailaIonut.add(panel);
        fereastraManailaIonut.setVisible(true);
    }

    private void openPanelCopilManaila() {
        JFrame fereastraCopilManaila = new JFrame("Clasa Copil - Filtrare (Manaila Ionut)");
        fereastraCopilManaila.setSize(400, 400);
        fereastraCopilManaila.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JTextField txtC2 = new JTextField();
        JTextField txtC3 = new JTextField();
        JButton btnFiltrare = new JButton("Filtreaza");

        panel.add(new JLabel("Filtru c2:"));
        panel.add(txtC2);
        panel.add(new JLabel("Filtru c3:"));
        panel.add(txtC3);

        btnFiltrare.addActionListener(e -> {
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            fereastraCopilManaila.add(scrollPane, BorderLayout.SOUTH);

            for (ClasaCopil copil : vectorCopil) {
                boolean matches = true;

                if (!txtC2.getText().isEmpty()) {
                    try {
                        float c2Value = Float.parseFloat(txtC2.getText());
                        if (copil.getC2() != c2Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (!txtC3.getText().isEmpty()) {
                    try {
                        float c3Value = Float.parseFloat(txtC3.getText());
                        float copilC3 = Float.parseFloat(copil.getC3());
                        if (copilC3 != c3Value) {
                            matches = false;
                        }
                    } catch (NumberFormatException ex) {
                        matches = false;
                    }
                }

                if (matches) {
                    textArea.append("c2: " + copil.getC2() + ", c3: " + copil.getC3() + "\n");
                }
            }
            fereastraCopilManaila.setVisible(true);
        });

        fereastraCopilManaila.add(panel, BorderLayout.CENTER);
        fereastraCopilManaila.add(btnFiltrare, BorderLayout.NORTH);
        fereastraCopilManaila.setVisible(true);
    }

}
