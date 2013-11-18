/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.process.engine.tasks.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.salaboy.process.engine.structures.Task;
import com.salaboy.process.engine.structures.SequenceFlow;

/**
 *
 * @author salaboy
 */
public class AbstractBaseTask implements Task {

    private String name;
    private Map<String, List<SequenceFlow>> incomingFlows;
    private Map<String, List<SequenceFlow>> outgoingFlows;

   
    public void setName(String name) {
        this.name = name;
    }

    
    public void addIncomingFlow(String type, SequenceFlow flow) {
        if (incomingFlows == null) {
            this.incomingFlows = new HashMap<String, List<SequenceFlow>>();
        }
        if (this.incomingFlows.get(type) == null) {
            this.incomingFlows.put(type, new ArrayList<SequenceFlow>());
        }
        this.incomingFlows.get(type).add(flow);
    }

    public void addOutgoingFlow(String type, SequenceFlow flow) {
        if (outgoingFlows == null) {
            this.outgoingFlows = new HashMap<String, List<SequenceFlow>>();
        }
        if (this.outgoingFlows.get(type) == null) {
            this.outgoingFlows.put(type, new ArrayList<SequenceFlow>());
        }

        this.outgoingFlows.get(type).add(flow);
    }

    public void removeIncomingFlow(String type, SequenceFlow flow) {
        if (incomingFlows != null) {
            if (incomingFlows.get(type) != null) {
                incomingFlows.get(type).remove(flow);
            }
        }
    }

    public void removeOutgoingFlow(String type, SequenceFlow flow) {
        if (outgoingFlows != null) {
            if (outgoingFlows.get(type) != null) {
                outgoingFlows.get(type).remove(flow);
            }
        }
    }

    public Map<String, List<SequenceFlow>> getIncomingFlows() {
        return incomingFlows;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<SequenceFlow>> getOutgoingFlows() {
        return outgoingFlows;
    }

    public List<SequenceFlow> getIncomingFlows(String type) {
        if (incomingFlows != null) {
            return incomingFlows.get(type);
        }
        return null;
    }

    public List<SequenceFlow> getOutgoingFlows(String type) {
        if (outgoingFlows != null) {
            return outgoingFlows.get(type);
        }
        return null;
    }

	
}
