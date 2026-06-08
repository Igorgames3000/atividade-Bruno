/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author igorg
 */
public abstract class State {
    Agendamento agendar();
    
    State(Agendamento agendar){
        this agendar = agendar;
    }
    
    public void Concluir();
    public void cancelar();
    public void pendente();
    public void confirmar();
     public void reaagendar();
}
