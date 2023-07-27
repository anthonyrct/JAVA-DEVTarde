package RevisaoJAVA;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import RevisaoJAVA.Animais.Cachorro;
import RevisaoJAVA.Animais.Foca;
import RevisaoJAVA.Animais.OutrosAnimais;

public class App {
    public static void main(String[] args) {
        // armazenar os meus objetos
        Cachorro cachorro[] = new Cachorro[10];
        Foca foca[] = new Foca[10];
        // ArrayList<OutrosAnimais> Outros = new ArrayList<OutrosAnimais>();
        OutrosAnimais outrosAnimais[] = new OutrosAnimais[10];
        // contador
        int contGatos = 0, contCachorro = 0, contOutros = 0;
        // criar o cadastro
        JOptionPane.showMessageDialog(null, outrosAnimais, "bem-vindo(a) ao consultorio tonnys toni", contOutros);
           boolean aberto = true;
           //if(java.time.LocalDateTime.now(null)>8 && LocalDateTime.now(null)<18){
            //aberto= true;
            JOptionPane.showMessageDialog(null, outrosAnimais, "Bem-vindo(a) de volta", contOutros);
         //  } else{
          //  aberto = false;
          // }
           while(aberto){
            int acao =Integer.parseInt(JOptionPane.showInputDialog("1-Cadrastrar PET\n 2-Agendar Consulta\n 3-Sair"));
            if(acao == 1){
                //int acao2 = Integer.parseInt(JOptionPane.showMessageDialog(" cadastre seu pet ", outrosAnimais);)
                //if(acao2 ==1){
                    //cadastro do gato
                //} else if (acao2 == 2){
                    //cadastro do cachorro
                //}else if (acao2 == 3){
                    //cadastro do outro PET(peixe)
                } else{
                    
               // }else if (acao == 2){
                 //agendamento
                }
            }
           
    }
    }