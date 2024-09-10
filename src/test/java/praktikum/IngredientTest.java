package praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {
    private Ingredient ingredient = new Ingredient(SAUCE,"IngredientName", 20.0f);

    @Test
    public void getPrice() {
        String result = ingredient.getName();
        assertEquals("IngredientName", result);
    }

    @Test
    public void getName() {
        float result = ingredient.getPrice();
        assertEquals(20.0f, result, 0.05f);
    }

    @Test
    public void getType() {
        IngredientType result = ingredient.getType();
        assertEquals(SAUCE, result);
    }
}