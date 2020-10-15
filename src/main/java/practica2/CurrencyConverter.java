/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Grupo 6
 */
public class CurrencyConverter {

    private final float exchangeRate;
    private final float quantity;
    
    public CurrencyConverter(float quantity, float exchangeRate) {
        this.exchangeRate = exchangeRate;
        this.quantity = quantity;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public float getQuantity() {
        return quantity;
    }
    
    public float calcularEquivalencia(boolean isEuro){
        if(isEuro){
            return quantity*exchangeRate;
        }else{
            return quantity/exchangeRate;
        }
    }
    
    public String toString(float result){
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato1 = new DecimalFormat("0.00", separadoresPersonalizados);
        return formato1.format(result);
    }
}
