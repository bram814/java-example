import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxExample {
    public JFrame f; /* Frame */
    public JLabel label, labelImage1, labelImage2, labelImage3, labelImage4; /* Label */
    JCheckBox checkbox1, checkbox2, checkbox3, checkbox4;
    JButton b;

    public String opcion1, opcion2, opcion3, opcion4;

    /* Posiciones de cada CheckBox*/
    int posXCheckBox1 = 100, posYCheckBox1 = 100;
    int posXCheckBox2 = 100, posYCheckBox2 = 300;

    int posXCheckBox3 = 500, posYCheckBox3 = 100;
    int posXCheckBox4 = 500, posYCheckBox4 = 300;

    CheckBoxExample(){
        /* Frame */
        f = new JFrame("CheckBox Example"); // Titulo

        /* Label */
        label = new JLabel();                        /* Creando Label    */
        label.setHorizontalAlignment(JLabel.CENTER); /* Centrando Label  */
        label.setSize(200,100);         /* Size del Label   */

        /* Button */
        b = new JButton("Click Here");           /* Creando Button */
        b.setBounds(50,400,95,30); /* setBounds(x, y, width, height);  */

        /* CheckBox*/
        initCheckBox();
        /* Add to frame */
        addFrame();

        /* Add to frame, first Checkbox */
        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                /* Ternario: si encuentra que es seleccionado muestra un checke */
                label.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked":"unchecked"));
                if (e.getStateChange() == 1){
                    opcion1 = "C++";
                } else{
                    opcion1 = "";
                }
            }
        });

        /* Add to frame, second Checkbox */
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                /* Ternario: si encuentra que es seleccionado muestra un checke */
                label.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "checked":"unchecked"));
                if (e.getStateChange() == 1){
                    opcion2 = "Java";
                } else{
                    opcion2 = "";
                }
            }
        });

        checkbox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                /* Ternario: si encuentra que es seleccionado muestra un checke */
                label.setText("Python Checkbox: " + (e.getStateChange() == 1 ? "checked":"unchecked"));
                if (e.getStateChange() == 1){
                    opcion3 = "Python";
                }else{
                    opcion3 = "";
                }
            }
        });

        checkbox4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                /* Ternario: si encuentra que es seleccionado muestra un checke */
                label.setText("C Checkbox: " + (e.getStateChange() == 1 ? "checked":"unchecked"));
                if (e.getStateChange() == 1){
                    opcion4 = "C";
                }else{
                    opcion4 = "";
                }
            }
        });

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(opcion1 + " - " + opcion2 + " - " + opcion3 + " - " + opcion4);

                if(opcion1 != "C++"){
                    System.out.println("ERROR");
                }else {
                    System.out.println("C++ CORRECTO");
                }

                opcion1 = "";
                opcion2 = "";
                opcion3 = "";
                opcion4 = "";
            }
        });

        initFrame(); // Configuraciones del Frame
    }


    public void initFrame(){
        f.setSize(1200,800);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void addFrame(){
        /* Add CheckBox to Frame */
        f.add(checkbox1); f.add(checkbox2); f.add(checkbox3); f.add(checkbox4);
        /* Add Label and Button to Frame */
        f.add(label); f.add(b);
        /* Add Image to Frame */
        f.add(labelImage1); f.add(labelImage2); f.add(labelImage3); f.add(labelImage4);
    }

    public void initCheckBox(){
        // Primer CheckBox
        checkbox1 = new JCheckBox("C++");                   /* Creando checkbox                 */
        checkbox1.setBounds(posXCheckBox1, posYCheckBox1, 60,50);

        labelImage1 = new JLabel();
        labelImage1.setBounds(posXCheckBox1 + 80, posYCheckBox1, 200, 150);         /* Size del Label   */
        labelImage1.setBackground(Color.BLUE);
        labelImage1.setOpaque(true);
        labelImage1.setIcon(new ImageIcon("./src/img/m_vaca.png"));

        /* Segundo CheckBox */
        checkbox2 = new JCheckBox("Java");                  /* Creando CheckBox                 */
        checkbox2.setBounds(posXCheckBox2,posYCheckBox2, 60,50);  /* setBounds(x, y, width, height);   */

        labelImage2 = new JLabel();
        labelImage2.setBounds(posXCheckBox2 + 80, posYCheckBox2, 200, 150);         /* Size del Label   */
        labelImage2.setBackground(Color.CYAN);
        labelImage2.setOpaque(true);
        labelImage2.setIcon(new ImageIcon("./src/img/m_vaca.png"));

        /* Tercero CheckBox */
        checkbox3 = new JCheckBox("Python");                  /* Creando CheckBox                 */
        checkbox3.setBounds(posXCheckBox3,posYCheckBox3, 70,50);  /* setBounds(x, y, width, height);   */

        labelImage3 = new JLabel();
        labelImage3.setBounds(posXCheckBox3 + 80, posYCheckBox3, 200, 150);         /* Size del Label   */
        labelImage3.setBackground(Color.CYAN);
        labelImage3.setOpaque(true);
        labelImage3.setIcon(new ImageIcon("./src/img/m_vaca.png"));

        /* Cuarto CheckBox */
        checkbox4 = new JCheckBox("C");                  /* Creando CheckBox                 */
        checkbox4.setBounds(posXCheckBox4,posYCheckBox4, 70,50);  /* setBounds(x, y, width, height);   */

        labelImage4 = new JLabel();
        labelImage4.setBounds(posXCheckBox4 + 80, posYCheckBox4, 200, 150);         /* Size del Label   */
        labelImage4.setBackground(Color.CYAN);
        labelImage4.setOpaque(true);
        labelImage4.setIcon(new ImageIcon("./src/img/m_vaca.png"));
    }


    public static void main(String args[]) {
        new CheckBoxExample();
    }

}