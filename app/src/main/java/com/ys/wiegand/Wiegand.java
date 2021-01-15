package com.ys.wiegand;

public class Wiegand {

    public static native int inputOpen();// enable input

    public static native void inputClose();//disable input after using

    public static native int inputRead();//reading input signal

    public static native int outputOpen();// enable output

    public static native void outputClose();//disable output after using 

    public static native int readoutputWrite26(); // for wiegand 26

    public static native int readoutputWrite34();  // for wiegand 34

    public static native int Output26(long value);//transfer the integer value, output the value based on the wiegand 26 protocol.

    public static native int Output34(long value);//transfer the integer value, output the value based on the wiegand 34 protocol.

    static {
        System.loadLibrary("wiegand");
    }
}
