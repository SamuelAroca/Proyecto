package principal;

//ustedess
import principal.logANDres.PantallaMain;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProVitarrico {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frameMain = new PantallaMain();   
                frameMain.setResizable(false);
                frameMain.setSize(1073,807);
                frameMain.setLocationRelativeTo(null);
                frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameMain.setVisible(true);
            }
        });
    }  
}
