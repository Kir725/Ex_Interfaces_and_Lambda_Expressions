package com.kolmikra.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FileUtil {
    private static FileFilter filter = new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.isDirectory();
        }
    };

    public static File[] SubDirs(File file) {
        return file.listFiles(filter);
    }

    public static File[] FilesWithExtension(File file, String extension) {
        return file.listFiles((f, name) -> name.endsWith(extension));
    }

    public static File[] getSubDirsWithLambda(File file) {
        return file.listFiles(pathname -> file.isDirectory());
    }

    public static File[] getSubDirsWithAnonClass(File file) {
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return file.isDirectory();
            }
        });
    }

    private static Comparator<File> fileComparator = (file1, file2) -> {
        if (file1.isDirectory() && file2.isFile()) {
            return -1;
        } else if (file1.isFile() && file2.isDirectory()) {
            return 1;
        } else {
            return 0;
        }
    };

    public static File[] filesSort(File[] files) {
        Arrays.sort(files, fileComparator.thenComparing(File::compareTo));
        return files;
    }
}
