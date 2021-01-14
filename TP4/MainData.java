/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class MainData extends Data {
    
    public static void main(String[] args)
    {
        Data data = new Data();
	System.out.println(data.mostra1());
	System.out.println(data.mostra2());
	System.out.println("Dias transcorridos: " + data.diasTranscorridos());
	data.apresentaDataAtual();
    }
        
}
