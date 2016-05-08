
package commonloginpage;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/* @author Shankaja
 */
public class CommonLoginPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JFrame
        final JFrame jf = CommonLoginPage.buildWindow(0.7F);
        
        
        //user name label
        buildLabel(jf,"User Name",jf.getWidth()-700,jf.getHeight()/2-200,200,50);
        ////password label
        buildLabel(jf,"Password",jf.getWidth()-700,jf.getHeight()/2-120,200,50);
        
        //username txt field
        final JTextField userName = buildTxtField(jf,jf.getWidth()-450,jf.getHeight()/2-200,300,50);
        
        //password field
        final JPasswordField password = buildPwdField(jf,jf.getWidth()-450,jf.getHeight()/2-120,300,50);
        
        //login button
        JButton loginBtn = buildButton("Login", jf, jf.getWidth()-300,jf.getHeight()/2, 120, 60);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //data in two text fields should go here
                String uName = userName.getText();
                String pWord = password.getText();
                        System.out.print(uName+" "+pWord);              //Checking case
                ;}});
        
        //Exit button
        JButton closeBtn = buildButton("Exit", jf, jf.getWidth()-140,jf.getHeight()-80, 120, 60);
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {jf.dispose();}});
        
    }
    
    
    private static JPasswordField buildPwdField(JFrame frame,int x, int y,int w, int h){ //JPassword
        JPasswordField txt = new JPasswordField();
        txt.setLayout(null);
        txt.setBounds(x, y, w, h);
        txt.setFont(new Font("Calibri", Font.PLAIN, 24));
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.yellow);
        txt.setOpaque(true);
        txt.setLayout(null);
        frame.add(txt);
        return txt;
    }
   
    private static JTextField buildTxtField(JFrame frame,int x, int y,int w, int h){ //JTxt
        JTextField txt = new JTextField();
        txt.setLayout(null);
        txt.setBounds(x, y, w, h);
        txt.setFont(new Font("Calibri", Font.BOLD, 20));
        txt.setForeground(Color.BLACK);
        txt.setBackground(Color.yellow);
        txt.setOpaque(true);
        txt.setLayout(null);
        frame.add(txt);
        return txt;
    }
    
    
    private static JLabel buildLabel(JFrame frame,String txt,int x, int y,int w, int h){ //JLabel
        JLabel lbl = new JLabel();
        lbl.setText(txt);
        lbl.setBounds(x, y, w, h);
        lbl.setForeground(Color.yellow);
        lbl.setFont(new Font("Canadra", Font.BOLD, 22));
        frame.add(lbl);
        return lbl;
    }
    
    
    private static JButton buildButton(String btnName,JFrame frame,int x, int y,int w, int h){ //placing buttons
        JButton btn = new JButton(btnName);
        btn.setLayout(null);
        btn.setBorderPainted(true);
        frame.add(btn);
        btn.setLocation(x, y);
        btn.setSize(w,h);
        btn.setForeground(Color.RED);
        btn.setOpaque(true);
        btn.setBackground(Color.YELLOW);
        btn.setForeground(Color.black);
        btn.setFont(new Font("Canadra", Font.BOLD, 25));
       return btn;
    }
    
   
    
    
    private static JFrame buildWindow(Float opacity){                                          //building the JFrame
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setOpacity(opacity);
        frame.getContentPane().setBackground(Color.black);   
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
    }
}
