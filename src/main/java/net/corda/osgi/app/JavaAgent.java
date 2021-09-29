package net.corda.osgi.app;

import lombok.Data;

@Data
public class JavaAgent {
    private final String className;
    private final String args;
}
