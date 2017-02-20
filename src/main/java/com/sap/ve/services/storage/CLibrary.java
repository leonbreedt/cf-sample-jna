package com.sap.ve.services.storage;

import com.sun.jna.*;

public final class CLibrary {

    public static native int fast_add(int a, int b);

    static {
        try {
            Native.register("test");
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    }
}
