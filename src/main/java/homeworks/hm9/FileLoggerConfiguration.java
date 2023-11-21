package homeworks.hm9;

import java.io.File;

public class FileLoggerConfiguration {
    private File file;
    private LoginLevel level;
    private long maxsize;
    private  String format;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public LoginLevel getLevel() {
        return level;
    }

    public void setLevel(LoginLevel level) {
        this.level = level;
    }

    public long getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(long maxsize) {
        this.maxsize = maxsize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
