package org.freehep.graphicsio.emf.test;

import java.io.File;

import org.freehep.graphicsio.emf.EMFViewer;

public class EMFView {

    public static void main(String[] args) {
        EMFView test = new EMFView();
        test.view();
    }
    
    public void view() {
        System.out.println(System.getProperty("user.dir"));
        EMFViewer viewer = new EMFViewer();
        viewer.setSize(680, 640);
        File file = new File("./freehep-graphicsio-emf/src/test/java/org/freehep/graphicsio/emf/test/1.emf");
        viewer.show(file);
    }
}
