package org.gallaghercodedesign.apextsstubgenerator.apex;

import java.nio.file.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FileIterator implements Iterator<Path>, AutoCloseable {
    private final DirectoryStream<Path> directoryStream;
    private final java.util.Iterator<Path> iterator;

    public FileIterator(Path folderPath, String fileExtension) throws IOException {
        // Filter files by extension
        this.directoryStream = Files.newDirectoryStream(folderPath, "*." + fileExtension);
        this.iterator = directoryStream.iterator();
    }

    @Override
    public boolean hasNext() {
        // Check if there are more files to iterate over
        return iterator.hasNext();
    }

    @Override
    public Path next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more files in the directory.");
        }

        // Return the next valid file
        return iterator.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }

    // Close the directory stream to release resources
    public void close() throws IOException {
        directoryStream.close();
    }
}
