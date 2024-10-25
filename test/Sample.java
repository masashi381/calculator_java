package test;
import javax.swing.*;

public class Sample {
  Sample() {
    // create a frame
    JFrame frame = new JFrame("Sample App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setLayout(null);
    frame.setVisible(true);

    // // create a button
    JButton btn = new JButton("Click Me!");
    btn.setBounds(100, 50, 100, 50);

    // create a label
    JLabel label = new JLabel("Hello, World!");
    label.setBounds(100, 100, 100, 50);

    // add button to the frame
    frame.add(btn);

    // add label to the frame
    frame.add(label);
    
  }
}
