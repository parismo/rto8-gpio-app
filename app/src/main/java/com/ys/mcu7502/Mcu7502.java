package com.ys.mcu7502;

public class Mcu7502 {
    public static native int open(); // 60

    public static native void close();

    public static native int enableWatchdog(); // return int: 7 means command sent success.

    public static native int disableWatchdog(); // return int: 7 means command sent success.

    public static native int feetDog(int time); // feed time for watchdog，time should >=10s,<= 60s, return int: 7 means command sent success.

    public static native int setTime(int time); // set time for next power on with unit seconds,>=60s ,return int: 7 means command sent success.

    public static native int resetMaster(); // return int: 7 means command sent success.

    public static native int getWatchdogStatus(); // return value is the status of watchdog, 1: enable already. 0: disable 

    public static native int getVersion(); // return value: first byte un-defined, second byte the first two digits of the version number, third byte for next two digits of version number, forth byte for last two digits of verion number.

    static {
        System.loadLibrary("mcu7502");
    }
}
