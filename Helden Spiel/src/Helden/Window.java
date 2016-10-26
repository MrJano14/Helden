package Helden;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window
{
	Spiel spiel = new Spiel(this);
	Canvas canvas = new Canvas(spiel.getKampfregel());
	private JFrame frmHeldenspiel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmHeldenspiel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHeldenspiel = new JFrame();
		frmHeldenspiel.setTitle("Heldenspiel");
		frmHeldenspiel.setSize(720, 480);
		frmHeldenspiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmHeldenspiel.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		JButton btnStart = new JButton("Angriff!");
		btnStart.setBackground(new Color(255, 99, 71));
		panel_1.add(btnStart, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.add(canvas, BorderLayout.CENTER);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				canvas.setText("");
				spiel.kampfregel.kampf();
				canvas.repaint();
			}
		});
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
}
