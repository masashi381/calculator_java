package test;

import javax.swing.*;

public class ButtonTest {
  public static void main(String[] args) {
    // create a frame
    JFrame btnFrame = new JFrame();
    btnFrame.setSize(400, 200);
    btnFrame.setVisible(true);

    // create a button
    JButton btn = new JButton();
    btn.setText("Click Me!");
    // btn.setSize(100, 50);
    btn.setBounds(100, 50, 100, 50);

    // add button to the frame
    btnFrame.add(btn);
  }
  
  
  // public static void main(String[] args) {
  //   new ButtonTest();
  // }
  // ButtonTest(){
  //   super("ButtonTest");
  //   setSize(200, 100);
  //   setLayout(new FlowLayout());
    
  //   JButton b = new JButton("ok");
    
  //   add(b);
  //   setVisible(true);
  // }
}
