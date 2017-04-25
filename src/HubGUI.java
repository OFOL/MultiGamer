import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//GUI
public class HubGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HubGUI frame = new HubGUI();
					frame.setVisible(true);
				} catch (Exception e) { e.printStackTrace(); }
			}
		});
	}
//code
	public User createUser() {
		User user = new User ();
		System.out.println(user.getName() + "'s user id is: " + user.getID());
		return user;
	}
	public void deleteUser() {}
	
	public TeamManager createTeam() {
		TeamManager team = new TeamManager();
		System.out.println(team.getTeamName() + "'s team id is: " + team.getTeamID());
		return team;
	}
	public void deleteTeam() {}
	
	public void addTeamMember() {}
	public void removeTeamMember() {}
	
	public void startGame(User user) { 
		Game1 game = new Game1();
		game.playMe(user);
		System.out.println("Player, " + user.getName() + ", has " + user.getPoints() + " points!"); //print points after game
	}
	
	public void startSnakeGame(User user) {
		JFrame ex = new Snake(user);
        ex.setVisible(true);
	}
//GUI	
	public HubGUI() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnAdd = new JButton("Play snake");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 1;
		gbc_btnAdd.gridy = 3;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
//code		
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				User user = createUser();
				textField.setText("Choose name");
				user.setName(textField.getText());
				textField.setText("User name: " + user.getName());
				textField.setText("User ID: " + Integer.toString(user.getID()));
				startSnakeGame(user);
			}
		});
	}
}

