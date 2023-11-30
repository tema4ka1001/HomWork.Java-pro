package homeworks.hm13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        this.fileMap = new HashMap<>();
    }
    public void add(String path){
        java.io.File file = new java.io.File(path);

        if (file.isFile()) {
            FileData fileData = new FileData(file.getName(), path, file.length());

            if (fileMap.containsKey(path)) {
                fileMap.get(path).add(fileData);
            } else {
                List<FileData> fileList = new ArrayList<>();
                fileList.add(fileData);
                fileMap.put(path, fileList);
            }
        } else {
            System.out.println("Шлях вказує на директорію, а не файл.");
        }
    }
    public List<FileData> find(String path){
        return fileMap.getOrDefault(path, new ArrayList<>());
    }
    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (int i=0; i<filteredFiles.size(); i++) {
            FileData fileData= filteredFiles.get(i);
            if (maxSize >= fileData.getFileSize()) {
                filteredFiles.add(fileData);
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }
}
}


