package server;

public interface ServerRepository {
    void saveInLog(String text);
    String readLog();
}
