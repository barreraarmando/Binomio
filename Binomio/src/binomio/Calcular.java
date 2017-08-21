/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

/**
 *
 * @author Rodrigo Sanchez Torres
 */
//Setters and getters
public class Calcular {
    //se reciben las variables que se van a usar
    private int num1;
    private int num2;
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //Método que calcula el binomio al cuadrado
    String binomio(){
        int priTer=num1*num1;
        int segTer=((num1*num2)*2);
        int terTer=num2*num2;
        String Res=(Integer.toString(priTer)+"aª"+ "  " + Integer.toString(segTer)+"ab" +"  "+ Integer.toString(terTer)+"bª");
        return Res;
    }
}
