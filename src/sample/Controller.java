package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;

    @FXML
    void decrypt(ActionEvent event) {
        String text = text1.getText();
        String key = text2.getText();

        String[] array2 = text.split(" ");
        String str6 = "";
        for (int i = 0; i < array2.length; i++) {
            char str4 = BinstrToChar(array2[i]);
            char mychar =  key.charAt(i);
            String str5 = Character.toString((char) (str4 ^ mychar));
            str6 = str6 + str5;
        }
        text3.setText(new String(str6));

    }
    public static char BinstrToChar(String binStr){
        int[] temp=BinstrToIntArray(binStr);
        int sum=0;
        for(int i=0; i<temp.length;i++){
            sum +=temp[temp.length-1-i]<<i;
        }
        return (char)sum;
    }
    public static int[] BinstrToIntArray(String binStr) {
        char[] temp=binStr.toCharArray();
        int[] result=new int[temp.length];
        for(int i=0;i<temp.length;i++) {
            result[i]=temp[i]-48;
        }
        return result;
    }

}