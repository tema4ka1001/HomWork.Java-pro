package homeworks.hm9;

import homeworks.hm9.exception.FileMaxSizeReachedException;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FileLogger {
    private FileLoggerConfiguration config;
    private PrintWriter writer;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    private void log(LoginLevel level, String message) throws IOException, FileMaxSizeReachedException {
        if (config.getLevel().IsEnable(level)){
            if (config.getFile().length() > config.getMaxsize()){ // >= //
                throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxsize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
            }
            if (writer == null){
                writer = new PrintWriter(new FileWriter(config.getFile()), true);
            }
            String formattedMessage = String.format(config.getFormat(), new Date(),  level, message);
            writer.println(formattedMessage);
            writer.flush();
        }
    }
    public void debug(String message, String Imessage)throws IOException, FileMaxSizeReachedException {
        String messege1 = "Debug message: " + message + "Info message: " + Imessage;
        if (config.getFile().length() > config.getMaxsize()) { // в методе дебаг визов інфо 
            log(LoginLevel.DEBUG, message);
        }
        else throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxsize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
    }
    public void info(String message)throws IOException, FileMaxSizeReachedException{
        if (config.getFile().length()>config.getMaxsize()) {
            log(LoginLevel.INFO, message);
        }
        else throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxsize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
    }

}