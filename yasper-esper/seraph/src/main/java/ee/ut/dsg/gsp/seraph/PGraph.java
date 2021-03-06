package ee.ut.dsg.gsp.seraph;

import java.io.FileNotFoundException;
import java.util.List;

public interface PGraph {
    List<String> nodes() throws FileNotFoundException;
    List<String[]> edges() throws FileNotFoundException;
    long timestamp();
}
