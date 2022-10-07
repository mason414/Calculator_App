import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
  private JPanel buttonsPanel;
  private JPanel borderPanel;
  private JTextField screenTextArea;
  private JFrame frame;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  private JButton button7;
  private JButton button8;
  private JButton button9;
  private JButton button10;
  private JButton button11;
  private JButton button12;
  private JButton button13;
  private JButton button14;
  private JButton button15;
  private JButton button16;
  private int width;
  private int height;

  private String buttonText;
  private Font font;

  public GUI(int w, int h) {
    frame = new JFrame();

    font = new Font("Arial", Font.PLAIN, 40);

    screenTextArea = new JTextField();
    screenTextArea.setFont(new Font("Arial", Font.PLAIN, 70));
    screenTextArea.setHorizontalAlignment(SwingConstants.RIGHT);


    screenTextArea.setEditable(false);
    frame.setResizable(false);

    borderPanel = new JPanel(new BorderLayout(1, 1));
    buttonsPanel = new JPanel(new GridLayout(4, 4));

    button1 = new JButton("7");
    button2 = new JButton("8");
    button3 = new JButton("9");
    button4 = new JButton("/");
    button5 = new JButton("4");
    button6 = new JButton("5");
    button7 = new JButton("6");
    button8 = new JButton("X");
    button9 = new JButton("1");
    button10 = new JButton("2");
    button11 = new JButton("3");
    button12 = new JButton("-");
    button13 = new JButton("C");
    button14 = new JButton("0");
    button15 = new JButton("=");
    button16 = new JButton("+");

    button1.setFont(font);
    button2.setFont(font);
    button3.setFont(font);
    button4.setFont(font);
    button5.setFont(font);
    button6.setFont(font);
    button7.setFont(font);
    button8.setFont(font);
    button9.setFont(font);
    button10.setFont(font);
    button11.setFont(font);
    button12.setFont(font);
    button13.setFont(font);
    button14.setFont(font);
    button15.setFont(font);
    button16.setFont(font);

    button1.setFocusPainted(false);
    button2.setFocusPainted(false);
    button3.setFocusPainted(false);
    button4.setFocusPainted(false);
    button5.setFocusPainted(false);
    button6.setFocusPainted(false);
    button7.setFocusPainted(false);
    button8.setFocusPainted(false);
    button9.setFocusPainted(false);
    button10.setFocusPainted(false);
    button11.setFocusPainted(false);
    button12.setFocusPainted(false);
    button13.setFocusPainted(false);
    button14.setFocusPainted(false);
    button15.setFocusPainted(false);
    button16.setFocusPainted(false);

    height = h;
    width = w;
  }

  // Sets up the screen and keys to the calculator
  public void setUpGUI() {
    frame.setSize(width, height);
    frame.setTitle("Calculator");

    buttonsPanel.add(button1);
    buttonsPanel.add(button2);
    buttonsPanel.add(button3);
    buttonsPanel.add(button4);
    buttonsPanel.add(button5);
    buttonsPanel.add(button6);
    buttonsPanel.add(button7);
    buttonsPanel.add(button8);
    buttonsPanel.add(button9);
    buttonsPanel.add(button10);
    buttonsPanel.add(button11);
    buttonsPanel.add(button12);
    buttonsPanel.add(button13);
    buttonsPanel.add(button14);
    buttonsPanel.add(button15);
    buttonsPanel.add(button16);

    screenTextArea.setText("0");
    borderPanel.add(screenTextArea, BorderLayout.NORTH);

    borderPanel.add(buttonsPanel, BorderLayout.CENTER);

    frame.add(borderPanel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  // Waits until an input is entered into the calculator 
  // and returns what was entered
  public String getKeyPress() {

    while (buttonText == null) {

      button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button1.getText();
        }
      });

      button2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button2.getText();
        }
      });

      button3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button3.getText();
        }
      });

      button4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button4.getText();
        }
      });

      button5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button5.getText();
        }
      });

      button6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button6.getText();
        }
      });

      button7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button7.getText();
        }
      });

      button8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button8.getText();
        }
      });

      button9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button9.getText();
        }
      });

      button10.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button10.getText();
        }
      });

      button11.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button11.getText();
        }
      });

      button12.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button12.getText();
        }
      });

      button13.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button13.getText();
        }
      });

      button14.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button14.getText();
        }
      });

      button15.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button15.getText();
        }
      });

      button16.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          buttonText = button16.getText();
        }
      });
      
    }
    return buttonText;
  }

  // Prints to the calculator's screen
  public void setScreen(String buttonText) {
    screenTextArea.setText(buttonText);
    return;
  }
}
