import java.awt.*;
import java.awt.event.*;

class eventprg extends Frame implements ActionListener {

	TextField textField;

	eventprg()
	{
		
		textField = new TextField();

		
		textField.setBounds(60, 50, 180, 25);
		Button button = new Button("click Here");
		button.setBounds(100, 120, 80, 30);

		// Registering component with listener
		// this refers to current instance
		button.addActionListener(this);

		add(textField);
		add(button);
		setFont(new Font("Arial", Font. BOLD, 18));
		
                         setSize(500,500);
	       setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		textField.setText(" this our java program!");
	}
	public static void main(String[] args)
	{
	new eventprg();
	}
}
