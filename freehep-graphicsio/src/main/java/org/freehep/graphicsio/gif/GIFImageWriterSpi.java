// Copyright 2003, FreeHEP
package org.freehep.graphicsio.gif;

import java.io.IOException;
import java.util.Locale;

import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriter;
import javax.imageio.spi.ImageWriterSpi;

/**
 * 
 * @version $Id: freehep-graphicsio/src/main/java/org/freehep/graphicsio/gif/GIFImageWriterSpi.java 6fc90d16bd14 2006/11/30 18:48:36 duns $
 */
public class GIFImageWriterSpi extends ImageWriterSpi {

    public GIFImageWriterSpi() {
        super("FreeHEP Java Libraries, http://java.freehep.org/", "1.0",
                new String[] { "gif" }, new String[] { "gif" },
                new String[] { "image/gif", "image/x-gif" },
                "org.freehep.graphicsio.gif.GIFImageWriter",
                STANDARD_OUTPUT_TYPE, null, false, null, null, null, null,
                false, null, null, null, null);
    }

    public String getDescription(Locale locale) {
        return "Graphics Interchange Format";
    }

    public ImageWriter createWriterInstance(Object extension)
            throws IOException {
        return new GIFImageWriter(this);
    }

    public boolean canEncodeImage(ImageTypeSpecifier type) {
        // FIXME handle # colors
        return true;
    }
}