import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimplePainter extends JPanel implements MouseListener, KeyListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	JFrame window;
	Color color = new Color(0, 0, 0);

	ArrayList<Dot> dots = new ArrayList<Dot>();

	public static void main(String[] args) {
		new SimplePainter();
	}

	public SimplePainter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();

		run();
	}

	private void run() {
		// 1. Make the window respond to mouse clicks
		window.addMouseListener(this);
		// 2. Use the addDot() method to create a new dot at the mouse's x and y
		// position when the mouse is clicked. Call the repaint() method to
		// update the window.
		// 3. Make the window respond to keyboard presses
		window.addKeyListener(this);
		// 4. Use the changeDotColor(Color) method to change the dots color when
		// the number keys are pressed
		// 5. Add a key to make the dot color random
		// 6. Implement the MouseMotionListener interface
		window.addMouseMotionListener(this);
		// 7. Draw a stream of dots when the mouse is clicked and dragged
	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x - 25, y - 44, 50, 50, color));
	}

	private void changeDotColor(Color c) {
		color = c;
	}

	private class Dot {
		int x;
		int y;
		int width;
		int height;

		Color c = new Color(0, 0, 0);

		public Dot(int x, int y, int width, int height, Color c) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.c = c;
		}

		public void draw(Graphics g) {
			g.setColor(c);
			g.fillRect(x, y, width, height);
		}

		public void setColor(Color c) {
			this.c = c;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(window)) {
			addDot(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_1) {
			changeDotColor(Color.RED);
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			changeDotColor(Color.ORANGE);
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			changeDotColor(Color.BLUE);
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			changeDotColor(Color.GREEN);
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			changeDotColor(Color.YELLOW);
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			changeDotColor(Color.MAGENTA);
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			changeDotColor(Color.GRAY);
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			changeDotColor(Color.PINK);
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			changeDotColor(Color.WHITE);
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			changeDotColor(Color.BLACK);
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			changeDotColor(new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256)));
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			changeDotColor(new Color(238,238,238));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(e.getX(), e.getY());
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
