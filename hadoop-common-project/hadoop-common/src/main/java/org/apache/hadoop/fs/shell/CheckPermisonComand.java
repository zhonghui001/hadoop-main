package org.apache.hadoop.fs.shell;


import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

import java.io.IOException;
import java.util.LinkedList;

@InterfaceAudience.Private
@InterfaceStability.Unstable
public class CheckPermisonComand extends FsCommand  {
    public static void registerCommands(CommandFactory factory) {
        factory.addClass(CheckPermisonComand.class, "-checkPermison");
    }

    @Override
    protected void processPath(PathData item) throws IOException {
        item.
    }
}
