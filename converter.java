import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;

public class converter extends Applet implements ActionListener {

    Choice from, to;
    Button btn;
    Label conversion;
    TextField num;

    public void init() {
        from = new Choice();
        to = new Choice();
        btn = new Button("Convert");
        conversion = new Label();
        num = new TextField(10);

        from.addItem("INR");
        from.addItem("USD");
        from.addItem("SGD");
        from.addItem("EUR");
        from.addItem("GBP");
        from.addItem("JPY");
        to.addItem("INR");
        to.addItem("USD");
        to.addItem("SGD");
        to.addItem("EUR");
        to.addItem("GBP");
        to.addItem("JPY");

        add(num);
        add(from);
        add(to);
        add(btn);
        add(conversion);
        btn.addActionListener(this);
        num.setText("");
    }

    public void paint(Graphics x){
        resize(390,380);
        Font myFont = new Font("Times New Roman", Font.BOLD,25);
        x.setFont(myFont);
        x.setColor(Color.BLUE);
        x.drawString("Currency Converter", 80, 40);

        Font myFont1 = new Font("Times New Roman", Font.BOLD,21);
        x.setFont(myFont1);
        x.setColor(Color.red);
        Font input_font = new Font("Times New Roman", Font.PLAIN,18);

        num.setBounds(120, 60, 140, 30);
        num.setFont(input_font);
        from.setBounds(120, 100, 140, 40);
        x.drawString("To", 180, 160);
        to.setBounds(120, 160, 140, 40);
        btn.setBounds(160, 220, 60, 30);
        Font myFont2 = new Font("Times New Roman", Font.BOLD,20);
        conversion.setFont(myFont2);
        conversion.setBounds(80, 270, 300, 40);
        Font myFont3 = new Font("Times New Roman", Font.ITALIC,22);
        x.setFont(myFont3);
        x.setColor(Color.GRAY);
        x.drawString("Developed by MSV", 100, 350);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            try{
                String user_val = num.getText();
                String select_from, select_to;
                float val;
                val = Float.parseFloat(user_val);
                double con_val;
                select_from = from.getSelectedItem();
                select_to = to.getSelectedItem();

                if (num.getText().equals("")){
                    throw new NumberFormatException();
                } else{

//              From INR to others
                    if(select_from.equals("INR")){
                        switch (select_to) {
                            case "USD":
                                con_val = val * 0.01252;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                con_val = val * 0.01759;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                con_val = val * 0.01261;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                con_val = val * 0.01083;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                con_val = val * 1.77656;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "INR":
                                conversion.setText("Converting INR to INR, Any sense?");
                                break;
                        }
                    }

//              From USD to others
                    if(select_from.equals("USD")){
                        switch (select_to) {
                            case "INR":
                                con_val = val * 79.7529;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                con_val = val * 1.40486;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                con_val = val * 1.00707;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                con_val = val * 0.86548;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                con_val = val * 141.926;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "USD":
                                conversion.setText("Converting USD to USD, Any sense?");
                                break;
                        }
                    }

//              From SGD to others
                    if(select_from.equals("SGD")){
                        switch (select_to) {
                            case "USD":
                                con_val = val * 0.71168;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "INR":
                                con_val = val * 56.7586;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                con_val = val * 0.71672;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                con_val = val * 0.61594;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                con_val = val * 101.006;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                conversion.setText("Converting SGD to SGD, Any sense?");
                                break;
                        }
                    }

//              From EUR to others
                    if(select_from.equals("EUR")){
                        switch (select_to) {
                            case "USD":
                                con_val = val * 0.99281;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "INR":
                                con_val = val * 79.1796;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                con_val = val * 1.39477;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                con_val = val * 0.85932;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                con_val = val * 140.914;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                conversion.setText("Converting EUR to EUR, Any sense?");
                                break;
                        }
                    }

//              From GBP to others
                    if(select_from.equals("GBP")){
                        switch (select_to) {
                            case "USD":
                                con_val = val * 1.15522;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "INR":
                                con_val = val * 92.1319;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                con_val = val * 1.62292;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                con_val = val * 1.16348;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                con_val = val * 163.961;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                conversion.setText("Converting GBP to GBP, Any sense?");
                                break;
                        }
                    }

//              From GBP to others
                    if(select_from.equals("JPY")){
                        switch (select_to) {
                            case "USD":
                                con_val = val * 0.00705;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "INR":
                                con_val = val * 0.56186;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "SGD":
                                con_val = val * 0.0099;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "EUR":
                                con_val = val * 0.0071;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "GBP":
                                con_val = val * 0.0061;
                                conversion.setText("Conversion is: " + String.format("%.4f", con_val));
                                break;
                            case "JPY":
                                conversion.setText("Converting JPY to JPY, Any sense?");
                                break;
                        }
                    }
                }

            } catch (NumberFormatException n){
                conversion.setText("Enter a number to convert");
            }
        }
    }
}
