import static org.junit.jupiter.api.Assertions.*;
class TicketTest {

    @org.junit.jupiter.api.Test
    void testTicketsAgeUnder10() {
        Ticket ticket = new Ticket("Krakow",9,"Monday");
        assertEquals(0,ticket.calculatePrice());
    }

    @org.junit.jupiter.api.Test
    void testTicketWarsaw() {
        Ticket ticket = new Ticket("Warsaw",25,"Tuesday");
        assertEquals(36,ticket.calculatePrice());
    }
}