import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Main class for the GUI application
public class NFLDraftForm {
    // These components are linked to the .form file (you don't need to create them manually)
    private JPanel mainPanel;
    private JTextField playerNameField;
    private JTextField positionField;
    private JTextField collegeField;
    private JButton addButton;
    private JTextArea displayArea;

    //  Constructor: where the app sets up logic and initializes the GUI
    public NFLDraftForm() {
        // Load existing players from the file using NFLDraft helper class
        for (String player : NFLDraft.loadPlayers()) {
            // Show each previously saved player in the display area
            displayArea.append(player + "\n");
        }

        // Add behavior for the Add Prospect button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 🧾 Get text from the input fields
                String name = playerNameField.getText().trim();
                String pos = positionField.getText().trim();
                String college = collegeField.getText().trim();

                //  Basic validation: check if fields are empty
                if (name.isEmpty() || pos.isEmpty() || college.isEmpty()) {
                    //  Show error if any field is missing
                    JOptionPane.showMessageDialog(mainPanel, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    //  Format the entry as one line of text
                    String entry = "Name: " + name + ", Position: " + pos + ", College: " + college;

                    //  Display it in the text area
                    displayArea.append(entry + "\n");

                    // 💾 Save the entry to the players.txt file
                    NFLDraft.savePlayer(entry);

                    // 🧽 Clear the input fields for the next entry
                    playerNameField.setText("");
                    positionField.setText("");
                    collegeField.setText("");
                }
            }
        });
    }

    // Main method: this is where the GUI actually launches
    public static void main(String[] args) {
        // Create a new JFrame window with a title
        JFrame frame = new JFrame("NFL Draft Tracker");

        // Set the content of the window to our main panel (designed in the .form)
        frame.setContentPane(new NFLDraftForm().mainPanel);

        // 🔚 Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the window size
        frame.setSize(400, 300);

        // Make the window visible
        frame.setVisible(true);
    }
}
