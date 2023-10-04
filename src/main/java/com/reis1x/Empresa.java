package com.reis1x;

public class Empresa {
    

    public double calculaSalario(double d, Estado estado){
        double valor;
        double novoBruto;
        switch(estado){
            case NORMAL:
                //se salario maior que 500, calcula os descontos sobre 5000
                if(d < 5000){
                    valor = d - (d * 0.045);
                    if(d - 2500 > 0){
                        valor -= (d-2500)*0.12;
                    }
                    return valor;
                } else {
                    valor = d - (5000 * 0.045);
                    valor -= (d-2500) * 0.12;
                }
                return valor;
                
            case CRITICO:
                //desconto de 20%
                valor = d - (d * 0.2);
                //desconto de 4,5 sobre o novo bruto até o limite de 5000
                if(valor < 5000){
                    valor = valor - (valor*0.045);
                } else {
                    valor = valor - (5000 * 0.045);
                }
                return valor;
           
            case OTIMO:
                //bonus de 25%
                novoBruto = d + (d * 0.25);
                //desconto de 4,5 sobre o novo bruto até o limite de 5000
                if(novoBruto < 5000){
                    valor = novoBruto - (novoBruto*0.045);
                    if(novoBruto > 2500){
                        valor -= (novoBruto - 2500) * 0.12;
                    }
                } else {
                    valor = novoBruto - (5000 * 0.045); 
                    valor -= (novoBruto - 2500) * 0.12;
                }
                return valor;
            
            default: {
                return 0;
            } 
        }
    }
}
