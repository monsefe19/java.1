import javax.swing.JOptionPane;
public class JOptionDemo {
    public static void main(String[] args) {
        String sentance = JOptionPane.showInputDialog("enter number od apples");
        int appleCount = Integer.parseInt(sentance);
        JOptionPane.showMessageDialog(null, "monsefe "+ appleCount);
    }
}
