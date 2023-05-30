

import javax.swing.*;

public class baziApp{
    public static void main(String[] arg) {
        String str = JOptionPane.showInputDialog("Enter adad mored nazar beyn 1 ta 10 :");
        int n = Integer.parseInt(str);
        play p = new play(n);
        System.out.println(p. amaliat());
    }
}


