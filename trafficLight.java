import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ActionListener {

    JFrame frame;
    JRadioButton redButton;
    JRadioButton yellowButton;
    JRadioButton greenButton;
    ButtonGroup options;
    JPanel optionsPanel;
    Color backgroundColor;
    Color stopColor;
    Color waitColor;
    Color goColor;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(backgroundColor);
        g.fillRect(20, 100, 210, 350);

        g.setColor(stopColor);
        g.fillOval(90, 130, 70, 70);

        g.setColor(waitColor);
        g.fillOval(90, 230, 70, 70);

        g.setColor(goColor);
        g.fillOval(90, 330, 70, 70);
    }

    TrafficLight() {
        backgroundColor = Color.black;
        stopColor = Color.gray;
        waitColor = Color.gray;
        goColor = Color.gray;
        setSize(250, 470);
        getContentPane().setBackground(Color.darkGray);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        redButton = new JRadioButton("Red");
        redButton.setBackground(Color.darkGray);
        redButton.setForeground(Color.white);
        redButton.addActionListener(this);
        
        yellowButton = new JRadioButton("Yellow");
        yellowButton.setBackground(Color.darkGray);
        yellowButton.setForeground(Color.white);
        yellowButton.addActionListener(this);
        
        greenButton = new JRadioButton("Green");
        greenButton.setBackground(Color.darkGray);
        greenButton.setForeground(Color.white);
        greenButton.addActionListener(this);

        optionsPanel = new JPanel();
        optionsPanel.setBackground(Color.darkGray);
        optionsPanel.setBounds(20,40,210,50);

        options=new ButtonGroup();
        options.add(redButton);
        options.add(yellowButton);
        options.add(greenButton);

        optionsPanel.add(redButton);
        optionsPanel.add(yellowButton);
        optionsPanel.add(greenButton);

        add(optionsPanel);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();

        if(s=="Red")
        {
            stopColor=Color.red;
            waitColor=Color.gray;
            goColor=Color.gray;
            repaint();
        }
        
        if(s=="Yellow")
        {
            stopColor=Color.gray;
            waitColor=Color.yellow;
            goColor=Color.gray;
            repaint();
        }
        
        if(s=="Green")
        {
            stopColor=Color.gray;
            waitColor=Color.gray;
            goColor=Color.green;
            repaint();
        }
    }
}

class trafficMain {
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight();
    }
}