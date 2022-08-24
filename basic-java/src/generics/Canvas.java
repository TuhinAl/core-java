package generics;

import java.util.List;

public class Canvas {
	
    public void dra(Shape s) {
        s.draw(this);
   }
    
    // bounded wildcard & The ? stands for an unknown type
    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
       }
    }
}
