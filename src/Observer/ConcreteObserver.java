package Observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 带 GUI 界面的观察者，使用饼图来表示变化
 */

public class ConcreteObserver extends Frame implements Observer , ActionListener {
    private GraphText text = new GraphText(60);
    private GraphCanvas graphCanvas = new GraphCanvas();
    private Button button = new Button("Close");

    public ConcreteObserver(){
        super("ConcreteObserver");
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);
        text.setEditable(false);
        graphCanvas.setSize(500,500);
        add(text, BorderLayout.NORTH);
        add(graphCanvas,BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        button.addActionListener(this);
        pack();
        show();
    }

    @Override
    public void update(NumberGenerator numberGenerator) {
        text.update(numberGenerator);
        graphCanvas.update(numberGenerator);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    class GraphText extends TextField implements Observer{
        public GraphText(int column){
            super(column);
        }

        @Override
        public void update(NumberGenerator numberGenerator) {
            int number = numberGenerator.getNumber();
            String text = number + ":";
            for (int i =0;i<number;i++){
                text += '*';
            }
            setText(text);
        }
    }

    class GraphCanvas extends Canvas implements Observer{
        private int number;

        @Override
        public void update(NumberGenerator numberGenerator) {
            number = numberGenerator.getNumber();
            repaint();
        }
        public void paint(Graphics g){
            int width = getWidth();
            int height = getHeight();
            g.setColor(Color.white);
            g.fillArc(0,0,width,height,0,360);
            g.setColor(Color.red);
            g.fillArc(0,0,width,height,90,-number * 360 /50);
        }
    }
}
