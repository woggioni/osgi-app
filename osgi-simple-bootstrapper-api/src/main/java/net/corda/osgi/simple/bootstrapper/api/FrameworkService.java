package net.corda.osgi.simple.bootstrapper.api;

public interface FrameworkService {
    String getMainApplicationComponentName();
    String[] getArgs();
    void setExitCode(int exitCode);
}