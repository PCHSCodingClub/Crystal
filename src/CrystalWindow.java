import javax.swing.JFrame;

public class CrystalWindow {
	
	public static void createWindow() {
		JFrame window = new JFrame("Hello World");
		
		window.setVisible(true);
		
		window.setLocationRelativeTo(null); 
		
	}
	
	public static void main(String[] args) {
		createWindow();
	}
}
