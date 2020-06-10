package java_awt_controls;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Calculator" width=700 height=700>
</applet>
*/

public class calculator extends Applet implements ActionListener
{
    TextField t1;
    TextField t2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Label l;
    
    public void init()
    {
        l=new Label();
        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("ADD");
        b2=new Button("SUB");
        b3=new Button("MUL");
        b4=new Button("DIV");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);  
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("ADD"))
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            l.setText(""+(a+b));
        }
        
        if(s.equals("SUB"))
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            l.setText(""+(a-b));
        }
        
        if(s.equals("MUL"))
        {
           int a=Integer.parseInt(t1.getText());
           int b=Integer.parseInt(t2.getText());
           l.setText(""+(a*b));
        }
        
        if(s.equals("DIV"))
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            l.setText(""+(a/b));
        }          
    }
}
