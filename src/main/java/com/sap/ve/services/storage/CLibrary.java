package com.sap.ve.services.storage;

import com.sun.jna.*;

public final class CLibrary {

    public static native double cos(double x);

    static {
        try {
            Native.register(Platform.C_LIBRARY_NAME);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    }
}
