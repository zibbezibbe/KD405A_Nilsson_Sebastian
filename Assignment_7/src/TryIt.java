import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.MEDEA_1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		px.setPixel(12, 19, Color.PINK);
		px.setPixel(12, 20, Color.PINK);
		px.setPixel(12, 21, Color.PINK);
		px.setPixel(12, 22, Color.PINK);
		px.setPixel(12, 23, Color.PINK);
		px.setPixel(12, 24, Color.PINK);
		px.setPixel(12, 25, Color.PINK);
		px.setPixel(13, 18, Color.PINK);
		px.setPixel(14, 18, Color.PINK);
		px.setPixel(15, 18, Color.PINK);
		px.setPixel(16, 18, Color.PINK);
		px.setPixel(17, 19, Color.PINK);
		px.setPixel(17, 20, Color.PINK);
		px.setPixel(17, 21, Color.PINK);
		px.setPixel(17, 22, Color.PINK);
		px.setPixel(17, 23, Color.PINK);
		px.setPixel(17, 24, Color.PINK);
		px.setPixel(17, 25, Color.PINK);
		px.setPixel(18, 26, Color.PINK);
		px.setPixel(19, 26, Color.PINK);
		px.setPixel(20, 26, Color.PINK);
		px.setPixel(21, 26, Color.PINK);
		px.setPixel(22, 19, Color.PINK);
		px.setPixel(22, 20, Color.PINK);
		px.setPixel(22, 21, Color.PINK);
		px.setPixel(22, 22, Color.PINK);
		px.setPixel(22, 23, Color.PINK);
		px.setPixel(22, 24, Color.PINK);
		px.setPixel(22, 25, Color.PINK);
		
	}

}
