import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
  private JPanel buttonsPanel;
  private JPanel borderPanel;
  private JTextField screenTextArea;
  private JFrame frame;
  private int width;
  private int height;
  private JButton[] buttonArray = new JButton[16];//{button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16 };
  private String buttonText;
  private Font font;

  public GUI(int w, int h) {
    frame = new JFrame();

    font = new Font("Arial", Font.PLAIN, 40);

    screenTextArea = new JTextField();
    screenTextArea.setFont(new Font("Arial", Font.PLAIN, 70));
    screenTextArea.setHorizontalAlignment(SwingConstants.RIGHT);

    screenTextArea.setEditable(false);
    screenTextArea.setHighlighter(null);
    frame.setResizable(false);

    borderPanel = new JPanel(new BorderLayout(1, 1));
    buttonsPanel = new JPanel(new GridLayout(4, 4));

    buttonArray[0]  = new JButton("7");
    buttonArray[1]  = new JButton("8");
    buttonArray[2]  = new JButton("9");
    buttonArray[3]  = new JButton("/");
    buttonArray[4]  = new JButton("4");
    buttonArray[5]  = new JButton("5");
    buttonArray[6]  = new JButton("6");
    buttonArray[7]  = new JButton("x");
    buttonArray[8]  = new JButton("1");
    buttonArray[9]  = new JButton("2");
    buttonArray[10] = new JButton("3");
    buttonArray[11] = new JButton("-");
    buttonArray[12] = new JButton("C");
    buttonArray[13] = new JButton("0");
    buttonArray[14] = new JButton("=");
    buttonArray[15] = new JButton("+");

    for (int buttonIndex = 0; buttonIndex < buttonArray.length; buttonIndex++) {
      buttonArray[buttonIndex].setFont(font);
      buttonArray[buttonIndex].setFocusPainted(false);
    }

    height = h;
    width  = w;
  }

  // Sets up the screen and keys to the calculator
  public void setUpGUI() {
    frame.setSize(width, height);
    frame.setTitle("Calculator");
    screenTextArea.setText("0");
    borderPanel.add(screenTextArea, BorderLayout.NORTH);
    borderPanel.add(buttonsPanel, BorderLayout.CENTER);
    frame.add(borderPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    for (int buttonIndex = 0; buttonIndex < buttonArray.length; buttonIndex++) {
      buttonsPanel.add(buttonArray[buttonIndex]);
    }
  }

  // Waits until an input is entered into the calculator 
  // and returns what was entered
  public String getKeyPress() {
    ActionListener buttonListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (int buttonIndex = 0; buttonIndex < buttonArray.length; buttonIndex++) {
          if (e.getSource() == buttonArray[buttonIndex]) {
            buttonText = buttonArray[buttonIndex].getText();
          }
        }
      }
    };

    while (buttonText == null) {
      for (int buttonIndex = 0; buttonIndex < buttonArray.length; buttonIndex++) {
        buttonArray[buttonIndex].addActionListener(buttonListener);
      }
    }

    return buttonText;
  }

  // Prints to the calculator's screen
  public void setScreen(String buttonText) {
    screenTextArea.setText(buttonText);
    return;
  }
}
