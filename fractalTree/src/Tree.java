import java.awt.*;

public class Tree extends Panel{

    //configurations
    double [] angles = {12,12};
    float ratio = 0.75f;
    int initialSize = 200;
    int tolerance = 1;
    int strokeSizeTransition = 30;
    int leafsize = 8;
    int leafWidth = 3;


    int [] dimentions;
    int [][] diretions = {{0,-1},{1,0},{0,1},{-1,0}};

    public Tree(int a, int b) {
        this.setPreferredSize(new Dimension(a,b));
        this.setBackground(Color.BLACK);
        dimentions = new int[]{a, b};
    }


    public void drawFibonnaci(Graphics2D g2){
        int fPassado = 0;
        int fAtual = 1;
        int direcaoAtual = 0;


        int [] posAtual = {dimentions[0]/2, dimentions[1]/2};
        for (int i = 0; i < 50; i++) {
            int [] posNova = {posAtual[0]+(diretions[direcaoAtual][0]*fAtual),posAtual[1]+(diretions[direcaoAtual][1]*fAtual) };
            g2.drawLine(posAtual[0], posAtual[1], posNova[0], posNova[1]);

            posAtual = posNova;

            direcaoAtual = (direcaoAtual+1)%4;
            int temp = fAtual;
            fAtual = fAtual + fPassado;
            fPassado = temp;
        }
    }

    public void drawingTree(int[] pos, Graphics2D g2,int size, double angle){
        if(size >=tolerance){
            g2.setStroke(new BasicStroke((int)(size/(initialSize/strokeSizeTransition))));
            /*if(size>leafsize)g2.setColor(new Color(102,51,0));
            else {
                g2.setColor(new Color(102,255,102));
                g2.setStroke(new BasicStroke(leafWidth));
            }*/
            System.out.println(size);
            int [] posNova = {(int) (pos[0]-size*Math.cos(angle)),(int) (pos[1]-size*Math.sin(angle))};
            g2.drawLine(pos[0],pos[1], posNova[0], posNova[1]);
            drawingTree(posNova, g2,(int)(size*ratio),  angle+Math.toRadians(angles[0])%Math.PI*2);
            drawingTree(posNova, g2, (int)(size*ratio), angle-Math.toRadians(angles[1])%Math.PI*2);
        }
    }

    public void drawTree(Graphics2D g2){
        int [] pos = {dimentions[0]/2,   dimentions[1]};
        drawingTree(pos, g2, initialSize,Math.PI/2);

    }



    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.white);

        drawTree(g2);

        g2.dispose();
    }
}
