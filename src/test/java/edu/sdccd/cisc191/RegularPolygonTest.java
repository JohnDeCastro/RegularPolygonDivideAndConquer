package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularPolygonTest {

    @Test
    void testPolygonNoArgs(){

        RegularPolygon polygonOne = new RegularPolygon();

        assertEquals("perimeter: 3.0", polygonOne.getPerimeter());
        assertEquals("area: 0.43301270189221946", polygonOne.getArea());
    }

    @Test
    void testPolygonSideLength(){

        RegularPolygon polygonTwo = new RegularPolygon(6, 4);

        assertEquals("perimeter: 24.0", polygonTwo.getPerimeter());
        assertEquals("area: 41.569219381653056", polygonTwo.getArea());
    }

    @Test
    void testPolygonAllArgs(){

        RegularPolygon polygonThree = new RegularPolygon(10, 4, 5.6, 7.8);

        assertEquals("perimeter: 40.0", polygonThree.getPerimeter());
        assertEquals("area: 123.10734148701015", polygonThree.getArea());
    }

}
