package lesson22.test22_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import lesson22.test22_1.command.Command;
import lesson22.test22_1.command.MacroCommand;
import lesson22.test22_1.drawer.ColorCommand;
import lesson22.test22_1.drawer.DrawCanvas;
import lesson22.test22_1.drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener
{
    private MacroCommand history = new MacroCommand();

    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private JButton clearButton  = new JButton("clear");

    private JButton redButton  = new JButton("red");        

    private JButton greenButton  = new JButton("green");

    private JButton blueButton  = new JButton("blue");      


    public Main(String title)
    {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);      
        greenButton.addActionListener(this);    
        blueButton.addActionListener(this);     

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);   
        buttonBox.add(greenButton); 
        buttonBox.add(blueButton);  
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.init();                                      
            canvas.repaint();
        }
        else if (e.getSource() == redButton)
        {
            Command cmd = new ColorCommand(canvas, Color.red);  
            history.append(cmd);                                
            cmd.execute();                                      
        }
        else if (e.getSource() == greenButton)
        {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);                                
            cmd.execute();                                      
        }
        else if (e.getSource() == blueButton)
        {
            Command cmd = new ColorCommand(canvas, Color.blue); 
            history.append(cmd);                                
            cmd.execute();                                      
        }
    }


    public void mouseMoved(MouseEvent e)
    {

    }
    public void mouseDragged(MouseEvent e)
    {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }


    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e)
    {

    }

    public void windowClosed(WindowEvent e)
    {

    }

    public void windowDeactivated(WindowEvent e)
    {

    }

    public void windowDeiconified(WindowEvent e)
    {

    }

    public void windowIconified(WindowEvent e)
    {

    }

    public void windowOpened(WindowEvent e)
    {

    }

    public static void main(String[] args)
    {
        new Main("Command Pattern Sample");
    }
}
