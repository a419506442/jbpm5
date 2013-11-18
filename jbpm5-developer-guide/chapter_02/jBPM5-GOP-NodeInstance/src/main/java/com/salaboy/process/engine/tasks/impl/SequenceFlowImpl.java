/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.process.engine.tasks.impl;

import com.salaboy.process.engine.structures.Task;
import com.salaboy.process.engine.structures.SequenceFlow;

/**
 *
 * @author salaboy
 */
public class SequenceFlowImpl implements SequenceFlow{
    private Task from;
    private Task to;
    private String fromType;
    private String toType;

    public SequenceFlowImpl(String toType, Task to) {
        this.to = to;
        this.toType = toType;
    }
    
    
    public Task getFrom() {
        return from;
    }

    
    public Task getTo() {
        return to;
    }

    
    public String getFromType() {
        return fromType;
    }

    
    public String getToType() {
        return toType;
    }
    

    
    
    
    
}
