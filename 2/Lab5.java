import java.awt.*;
import java.awt.event.*;

class DemoDialog {  
    private static Dialog d;  
    DemoDialog(String text) {  
        Frame f= new Frame();  
        d = new Dialog(f , "DemoDialog", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DemoDialog.d.setVisible(false);  
            }  
        });  
		Label l = new Label(text);
        d.add(l);  
        d.add(b);   
        d.setSize(800,100);    
        d.setVisible(true);  
    } 
}

public class Lab5 {
	
	public static void main(String[] args) {		
		Frame f = new Frame("Списки");
		f.setBackground(new Color(0, 10, 0));
		
		Choice cb = new Choice();
		cb.add("John Peter");
		cb.add("Ivan Ivanovitch");
		cb.add("Roger III");
		cb.add("M'ze Tang");
		cb.setBounds(20, 100, 120, 20);
		f.add(cb);
		
		Label l = new Label("Enter your text here");
		l.setBounds(180, 50, 120, 20);
		f.add(l);
		
		TextField tf = new TextField();
		tf.setBounds(180, 70, 120, 20);
		f.add(tf);
		
		List lb = new List();
		lb.add("John Peter");
		lb.add("Ivan Ivanovitch");
		lb.add("Roger III");
		lb.add("M'ze Tang");
		lb.setBounds(350, 100, 200, 200);
		f.add(lb);
		
		Button b = new Button("Add");
		b.setBackground(new Color(05, 255, 0));
		b.setBounds(200, 170, 70, 20);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tf.getText().equals("")) {
					cb.add(tf.getText());
					lb.add(tf.getText());
					if (tf.getText().length() > 100) {
						DemoDialog d = new DemoDialog(tf.getText());
					}
				}
			}
		});
		f.add(b);
		
		/*Label l1 = new Label("Ваше имя");
		l1.setBounds(20, 40, 60, 20);
		f.add(l1);
		
		Label l2 = new Label("Пароль", Label.RIGHT);
		l2.setBounds(20, 70, 60, 20);
		f.add(l2);
		
		TextField tf1 = new TextField("");
		tf1.setBounds(100, 40, 120, 20);
		f.add(tf1);
		
		TextField tf2 = new TextField("");
		tf2.setBounds(100, 70, 120, 20);
		tf2.setEchoChar('*');
		f.add(tf2);
		
		TextField tf3 = new TextField("Введите сюда ваш заказ");
		tf3.setBounds(20, 110, 200, 20);
		f.add(tf3);
		
		TextArea ta = new TextArea("Ваш заказ");
		ta.setBounds(20, 150, 200, 135);
		ta.setEnabled(false);
		f.add(ta);
		
		Button b1 = new Button("Применить");
		b1.setBounds(250, 180, 80, 25);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tf1.getText().equals("") && !tf2.getText().equals("")
					&& !tf3.getText().equals(""))
						ta.append("\n" + tf3.getText());
			}
		});
		f.add(b1);
		
		Button b2 = new Button("Отменить");
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
		
		Button b3 = new Button("Выйти");
		b3.setBounds(250, 260, 80, 25);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		f.add(b3);*/
		
		f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }
		});
		
		f.setSize(600, 400);
		f.setLayout(null);  
		f.setVisible(true);
	}
}