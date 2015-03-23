import javax.swing.JOptionPane;
public class Roles {
	public static void main(String [] args) {
		String Administrator, Faculty, Staff, Student, Guest, UserRole;

		UserRole = JOptionPane.showInputDialog("Please choose a role: " + "\n" + "- Administrator" + "\n" +
		"- Faculty" + "\n" + "- Staff" + "\n" + "- Student" + "\n" + "- Guest" );

		Administrator = UserRole;
		Faculty = UserRole;
		Staff = UserRole;		
		Student = UserRole;
		Guest = UserRole;

		switch (UserRole) {
		case "Administrator": 
			JOptionPane.showMessageDialog(null, "Welcome " + UserRole + "!");
			break;
		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome " + UserRole + "!");
			break;
		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome " + UserRole + "!");
			break;
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome " + UserRole + "!");
	 		break;															 case "Guest";																  JOptionPane.showMessageDialog(null, "Welcome " + UserRole + "!");
			break;															 default:
			JOptionPane.showMessageDialog(null, "Autherization Denied.");
			}
		}
	}
	

