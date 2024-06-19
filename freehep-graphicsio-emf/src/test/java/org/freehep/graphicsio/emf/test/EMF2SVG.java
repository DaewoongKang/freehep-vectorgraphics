package org.freehep.graphicsio.emf.test;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.freehep.graphicsio.AbstractVectorGraphicsIO;
import org.freehep.graphicsio.emf.EMFInputStream;
import org.freehep.graphicsio.emf.EMFRenderer;
//import org.freehep.graphicsio.svg.SVGGraphics2D;

public class EMF2SVG {

    public static void main(String[] args) throws IOException {
        EMF2SVG test = new EMF2SVG();
        test.convert();
    }
    
    public void convert() throws IOException {
        InputStream is = new FileInputStream("./freehep-graphicsio-emf/src/test/java/org/freehep/graphicsio/emf/test/1.emf");
        EMFInputStream eis = new EMFInputStream(is);
        EMFRenderer renderer = new EMFRenderer(eis);

        OutputStream os = new FileOutputStream("./freehep-graphicsio-emf/src/test/java/org/freehep/graphicsio/emf/test/1.svg");
        Rectangle rect = renderer.getBounds();
/*         
        SVGGraphics2D g = new SVGGraphics2D(os, rect);
        Properties props = SVGGraphics2D.getDefaultProperties();
        props.setProperty(AbstractVectorGraphicsIO.TEXT_AS_SHAPES, "false");
        g.setProperties(props);
        g.writeHeader();
        
        renderer.paint(g);

        g.writeTrailer();
        g.closeStream();
*/        
    }
}
