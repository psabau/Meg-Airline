/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package v3;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class Flights_ClassTest {
   
    @Test
    public void testGetPlaces() {
        Flights_Class flights = new Flights_Class("F001", "9");
        assertEquals("9", flights.getPlaces());
    }

    @Test
    public void testGetFlightCode() {
        Flights_Class flights = new Flights_Class("F001", "9");
        assertEquals("F001", flights.getFlightCode());
    }
}