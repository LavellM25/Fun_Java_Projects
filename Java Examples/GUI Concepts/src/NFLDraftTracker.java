/** After modifications to NFLDraft.java and NFLDraftForm.java, this file is not necessary to run a successful program.
 */

import javax.swing.*; // Swing package for GUI components
import java.awt.*; // For layout managers like BorderLayout
import java.awt.event.*; // For listening to events like button clicks

public class NFLDraftTracker {

    // Entry point of the Java application
    public static void main(String[] args) {
        // Schedule GUI creation for the Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    // This method sets up and shows the GUI window
    public static void createAndShowGUI() {
        // Create the main window (JFrame) and set its title
        JFrame frame = new JFrame("NFL Draft Tracker");

        // When the user closes the window, the app should stop
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Width x Height

        // This panel holds the form inputs (player info)
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10)); // rows, cols,

        // Create text fields and labels
        JLabel nameLabel = new JLabel("Player Name:");
        JTextField nameField = new JTextField();

        JLabel positionLabel = new JLabel("Position:");
        JTextField positionField = new JTextField();

        JLabel collegeLabel = new JLabel("College:");
        JTextField collegeField = new JTextField();

        JButton addButton = new JButton("Add Prospect");

        // Add components to formPanel in row-by-row order
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(positionLabel);
        formPanel.add(positionField);
        formPanel.add(collegeLabel);
        formPanel.add(collegeField);
        formPanel.add(new JLabel()); // Empty cell
        formPanel.add(addButton);

        // Text area to display all added prospects
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false); // Users shouldn't type here
        JScrollPane scrollPane = new JScrollPane(displayArea); // Makes it scrollable

        // Handle button click: when user clicks "Add Prospect"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Read user input from text fields
                String name = nameField.getText().trim();
                String position = positionField.getText().trim();
                String college = collegeField.getText().trim();

                // Check if all fields are filled
                if (name.isEmpty() || position.isEmpty() || college.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Format the entry
                    String entry = "Name: " + name + ", Position: " + position + ", College: " + college;

                    // Append to the text area
                    displayArea.append(entry + "\n");

                    // Clear input fields
                    nameField.setText("");
                    positionField.setText("");
                    collegeField.setText("");
                }
            }
        });

        // Add panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(formPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Show the window
        frame.setVisible(true);
    }
}


