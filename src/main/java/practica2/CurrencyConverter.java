/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Borja
 */
public class CurrencyConverter {

    private final float exchangeRate;
    private final float quantity;
    private final boolean isEuro;
    
    public CurrencyConverter(float quantity, float exchangeRate, boolean isEuro) {
        this.exchangeRate = exchangeRate;
        this.quantity = quantity;
        this.isEuro = isEuro;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public float getQuantity() {
        return quantity;
    }

    public boolean getIsEuro() {
        return isEuro;
    }
    
    public float calcularEquivalencia(boolean isEuro){
        if(isEuro){
            return quantity*exchangeRate;
        }else{
            return quantity/exchangeRate;
        }
    }
}
