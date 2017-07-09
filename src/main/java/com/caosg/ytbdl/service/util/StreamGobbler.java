package com.caosg.ytbdl.service.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by csg on 2017/7/9.
 */
public class StreamGobbler extends Thread {

    private InputStream stream;
    private StringBuffer buffer;

    public StreamGobbler(StringBuffer buffer, InputStream stream) {
        this.stream = stream;
        this.buffer = buffer;
        start();
    }

    public void run() {
        try {
            int nextChar;
            while((nextChar = this.stream.read()) != -1) {
                this.buffer.append((char) nextChar);
            }
        }
        catch (IOException e) {

        }
    }
}
