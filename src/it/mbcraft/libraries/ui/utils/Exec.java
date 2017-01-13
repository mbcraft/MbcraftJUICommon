package it.mbcraft.libraries.ui.utils;

import javafx.application.Platform;

/**
 * Created by Marco Bagnaresi on 31/05/2016.
 */
public class Exec {
    public static void ensureInsideJavaFXThread(Runnable rr) {
        if (!Platform.isFxApplicationThread()) {
            Platform.runLater(rr);
        } else {
            rr.run();
        }
    }
}
