import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {
    private static ShoppingCart sc;
    @BeforeAll
    static void init() {
        sc =  new ShoppingCart(new Locale("en", "US"));
    }

    @Test
    void addToTotalCost() {
        sc.addToTotalCost(2, 5);
        assertEquals(10, sc.getTotalCost());
    }
}