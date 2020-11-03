import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  Counter() 
  {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton Left = new JButton("Left");
    JButton Right = new JButton("Right");
    leftCount = 0;
    rightCount = 0;

    Left.addActionListener(this);
    Right.addActionListener(this);

    frame.add(Left);
    frame.add(Right);

    leftLabel= new JLabel("Count: " +leftCount);
    rightLabel= new JLabel("Count: " +rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton Reset = new JButton("Reset");
    Reset.addActionListener(this);

    frame.add(Reset);
    frame.setVisible(true);
  }


  public void actionPerformed(ActionEvent ae) 
  {
    if(ae.getActionCommand().equals("Left")) 
    {
      leftCount++;
      leftLabel.setText("Count: " +leftCount);
    }
    else if (ae.getActionCommand().equals("Right")) 
    {
      rightCount++;
      rightLabel.setText("Count: " +rightCount);
    }
    else if (ae.getActionCommand().equals("Reset")) 
    {
      {
        leftCount = 0;
        leftLabel.setText("Count: " +leftCount);

        rightCount = 0;
        rightLabel.setText("Count: " +rightCount);
      }
    }
 }
}