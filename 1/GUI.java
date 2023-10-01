import java.awt.*;
import java.awt.event.*;

public class LabGUI {

	public static void main(String[] args) {		
		Frame f = new Frame("Field Input");
		
		Label l1 = new Label("Your name");
		l1.setBounds(20, 40, 60, 20);
		f.add(l1);
		
		Label l2 = new Label("Password", Label.RIGHT);
		l2.setBounds(20, 70, 60, 20);
		f.add(l2);
		
		TextField tf1 = new TextField("");
		tf1.setBounds(100, 40, 120, 20);
		f.add(tf1);
		
		TextField tf2 = new TextField("");
		tf2.setBounds(100, 70, 120, 20);
		tf2.setEchoChar('*');
		f.add(tf2);
		
		TextField tf3 = new TextField("Enter your orders");
		tf3.setBounds(20, 110, 200, 20);
		f.add(tf3);
		
		TextArea ta = new TextArea("Orders");
		ta.setBounds(20, 150, 200, 135);
		ta.setEnabled(false);
		f.add(ta);
		
		Button b1 = new Button("Accept");
		b1.setBounds(250, 180, 80, 25);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tf1.getText().equals("") && !tf2.getText().equals("")
					&& !tf3.getText().equals(""))
						ta.append("\n" + tf3.getText());
			}
		});
		f.add(b1);
		
		Button b2 = new Button("Cancel");
		b2.setBounds(250, 220, 80, 25);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = ta.getText();
				int begin = ta.getText().lastIndexOf('\n');
				if (begin == -1)
					return;
				ta.replaceRange("", begin, text.length());
			}
		});
		f.add(b2);
		
		Button b3 = new Button("Quit");
		b3.setBounds(250, 260, 80, 25);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		f.add(b3);
		
		f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }
		});
		
		f.setSize(460, 400);
		f.setLayout(null);  
		f.setVisible(true);
	}
}
