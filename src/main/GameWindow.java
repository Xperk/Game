package main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	public GameWindow(GamePanel gamePanel) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(gamePanel);
		this.setResizable(false);
		this.pack();
		// tao ra cua so co kick thuoc phu hop voi thanh phan cua no
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.addWindowFocusListener(new WindowFocusListener() {

			@Override
			public void windowLostFocus(WindowEvent e) {
				gamePanel.getGame().windowFocusLost();
			}

			@Override
			public void windowGainedFocus(WindowEvent e) {

			}
		});

	}

}

