/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAssignments;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author jayu
 */
public class SearchExtension implements FilenameFilter {

    String ext;

    public SearchExtension(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
