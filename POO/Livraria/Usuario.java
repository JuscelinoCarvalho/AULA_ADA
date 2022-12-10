package Livraria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Usuario(String Nome, String RG, String CPF, LocalDate DataNascimento) {
    
    public int getYearsOld(){
        return (int)ChronoUnit.YEARS.between(this.DataNascimento,LocalDate.now());
    }  

    @Override
    public String toString(){
        String str = "Nome.....: " + Nome + "\n";
        str += "RG.......: " + RG + "\n";
        str += "CPF......: " + CPF + "\n";
        str += "Dt. Nasc.: " + DataNascimento.toString() + "\n";
        str += "Idade....: " + String.valueOf(this.getYearsOld());
        return str;
    }
    
}
