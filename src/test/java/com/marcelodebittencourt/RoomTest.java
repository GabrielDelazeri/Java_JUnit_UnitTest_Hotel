package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //Teste novo quarto
    void testNewRoom(){
        //Entrada de Dados - Massa
        int roomnumber = 200;
        String RoomName = "Suíte Luxo";
        double PriceDay = 500;

        //T - Teste - Execução teste
        Room luxureroom = new Room(roomnumber, RoomName, PriceDay);

        //R - Resultado - Validação de dados
        assertEquals(roomnumber, luxureroom.getId());
        assertEquals(RoomName, luxureroom.getName() );
        assertEquals(PriceDay, luxureroom.getPricePerDay() );

    }
}
