package it.polimi.rsp.baselines.rsp.query.reasoning.jena;

import it.polimi.rsp.baselines.rsp.query.reasoning.TimeVaryingInfGraph;
import it.polimi.rsp.baselines.rsp.sds.windows.WindowModel;
import org.apache.jena.graph.Graph;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.rulesys.BasicForwardRuleInfGraph;
import org.apache.jena.reasoner.rulesys.Rule;

import java.util.List;

/**
 * Created by riccardo on 05/07/2017.
 */
public class BasicForwardRuleInfTVGraph extends BasicForwardRuleInfGraph implements TimeVaryingInfGraph {

    private long last_timestamp;
    private WindowModel window;

    public BasicForwardRuleInfTVGraph(Reasoner reasoner, Graph schema, long last_timestamp, WindowModel w) {
        super(reasoner, schema);
        this.last_timestamp = last_timestamp;
        this.window = w;
    }


    public BasicForwardRuleInfTVGraph(Reasoner reasoner, List<Rule> rules, Graph schema, long last_timestamp, WindowModel w) {
        super(reasoner, rules, schema);
        this.last_timestamp = last_timestamp;
        this.window = w;
    }

    public BasicForwardRuleInfTVGraph(Reasoner reasoner, List<Rule> rules, Graph schema, Graph data,
                                      long last_timestamp, WindowModel w) {
        super(reasoner, rules, schema, data);
        this.last_timestamp = last_timestamp;
        this.window = w;
    }

    @Override
    public long getTimestamp() {
        return last_timestamp;
    }

    @Override
    public WindowModel getWindowOperator() {
        return window;
    }

    @Override
    public void setWindowOperator(WindowModel w) {
        this.window = w;
    }

    @Override
    public void setTimestamp(long ts) {
        this.last_timestamp = ts;
    }
}
