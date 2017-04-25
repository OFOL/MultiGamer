import javax.swing.JFrame;

public class Snake extends JFrame {

	private static final long serialVersionUID = 1L;

	public Snake(User user) {
		add(new Board(user));
		setResizable(false);
		pack();
		setTitle("Snake");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}