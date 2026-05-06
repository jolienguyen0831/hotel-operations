package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void isAvailable() {

        //arrange
        Room room1 = new Room(125, false, true, 3);


        //act
        boolean result = room1.isAvailable();

        //assert
        assertEquals(false,result);
    }
}