package io.fabric8.docker.client;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

public interface InputHandle extends Closeable {

    OutputStream getInput();


}
