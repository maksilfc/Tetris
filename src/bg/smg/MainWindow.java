package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
private JButton leftBtn= new JButton("Left");
private JButton rightBtn = new JButton("Right");
private BlocksPanel blocksPanel = new BlocksPanel();
public MainWindow(){
    JPanel buttonPanel = new JPanel();
buttonPanel.add(leftBtn);
buttonPanel.add(rightBtn);

blocksPanel.setBackground(Color.WHITE);
this.add(blocksPanel);
this.add(buttonPanel, BorderLayout.SOUTH);
leftBtn.addActionListener(this);
rightBtn.addActionListener(this);
}


    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent buttonPressed) {
        if(buttonPressed.getSource() == leftBtn)
            blocksPanel.left();
        else if(buttonPressed.getSource() == rightBtn)
            blocksPanel.right();
    }

    public BlocksPanel getBlocksPanel() {
        return blocksPanel;
    }
}
