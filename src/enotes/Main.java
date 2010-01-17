/*
 * (c) 2009. Ivan Voras <ivoras@fer.hr>
 * Released under the 2-clause BSDL.
 */


package enotes;

import javax.swing.UIManager;

/**
 *
 * @author ivoras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        System.out.println(System.getProperties());

        MainForm mf = new MainForm();
        mf.setSize(800, 550);
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);

    }

}
