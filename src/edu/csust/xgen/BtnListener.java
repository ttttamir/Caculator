package edu.csust.xgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JLabel;

public class BtnListener implements ActionListener {

	JLabel firstLabel;
	JLabel secondLabel;
	Callback callback = new Controller();

	public BtnListener(JLabel firstLabel, JLabel secondLabel) {
		super();
		this.firstLabel = firstLabel;
		this.secondLabel = secondLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (firstLabel.getText() == "0") {
			firstLabel.setText(command);
			String s = firstLabel.getText();
			callback.setFirstNum(new BigDecimal(s));
		} else if (firstLabel.getText() != "0") {
			switch (command) {
			case "+":
				if (secondLabel.getText() == "0") {
					secondLabel.setText(firstLabel.getText() + command);
				} else {
					secondLabel.setText(secondLabel.getText() + firstLabel.getText() + command);
				}
				break;

			default:
				firstLabel.setText(firstLabel.getText() + command);
				break;
			}

		} else {

		}

	}

	public interface Callback {
		void setFirstNum(BigDecimal firstNum);
	}

}
