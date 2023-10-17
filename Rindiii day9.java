import javax.swing.*;

public class MinMaxCalculator {
    public static void main(String[] args) {
      
        String inputA = JOptionPane.showInputDialog("Masukkan bilangan pertama (a):");
        String inputB = JOptionPane.showInputDialog("Masukkan bilangan kedua (b):");

        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);

        double min = Math.min(a, b);
        double max = Math.max(a, b);

        JOptionPane.showMessageDialog(null, "MIN: " + min + "\nMAX: " + max);
    }
}
