package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author litao34
 * @ClassName MySourceClassLoader
 * @Description 想要实现自定义的类加载器来加载类,加载自己的hashMap,String等类,经过实现 发现该方法不可行
 * @CreateDate 2022/3/31-7:00 PM
 **/
public class MySourceClassLoader extends ClassLoader{

    private File targetFile = null;

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 在配置Idea的时候需要配置目标路径为SouceCode/target
        // 编译执行自己的class
        StringBuilder classPath = new StringBuilder();
        classPath.append(System.getProperty("user.dir")).append("/SouceCode/").append("/target/");
        if (Objects.isNull(targetFile)){
            targetFile = new File(classPath.toString());
        }
        if (targetFile.isDirectory()){
            // 递归获取classPath下的文件
            boolean findClass = false;
            List<File> files = Arrays.asList(targetFile.listFiles());
            File targetFile = null;
            while (!findClass){
                List<File> tempFiles = new ArrayList<>();
                // 当前文件列表所有子文件
                if (files.size() > 0){
                    files.stream().filter(File::isDirectory).forEach(file -> tempFiles.addAll(Arrays.asList(file.listFiles())));
                }
                File tfile = files.stream().filter(File::isFile).filter(file -> file.getName().equals(name + ".class")).findFirst().orElse(null);
                files = tempFiles;
                if (Objects.nonNull(tfile)){
                    findClass = true;
                    targetFile = tfile;
                }
            }
            if (Objects.nonNull(targetFile)){
                byte[] fileByts = new byte[0];
                try {
                    fileByts = Files.readAllBytes(Paths.get(targetFile.getAbsolutePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return defineClass(name, fileByts, 0, fileByts.length);
            }
            throw new ClassNotFoundException("class not found " + name);
        }else{
            throw new ClassNotFoundException("class not found " + name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        System.out.println("this is test classPath");
        new MySourceClassLoader().findClass("HashMap").newInstance();
    }
}
