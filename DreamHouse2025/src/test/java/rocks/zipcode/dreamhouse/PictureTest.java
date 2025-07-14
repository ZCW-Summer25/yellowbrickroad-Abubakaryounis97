package rocks.zipcode.dreamhouse;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The test class PictureTest.
 *
 * @Abubakar Younis  (your name)
 * @versio07/08/25 (a version number or a date)
 */
public class PictureTest
{
    /**
     * Default constructor for test class PictureTest
     */
    public PictureTest()
    {
    }


    @Test
    public void DrawTest()
    {
        Picture picture1 = new Picture();
        picture1.draw();
    }
}

