package total;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JPanel {

	public Board() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 0, 0,0));
		this.setOpaque(false);
	}
}
