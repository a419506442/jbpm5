/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.process.engine.structures.impl;

import java.util.HashMap;
import java.util.Map;
import com.salaboy.process.engine.structures.Task;
import com.salaboy.process.engine.structures.ProcessDefinition;

/**
 *
 * @author salaboy
 */
public class ProcessDefinitionImpl implements ProcessDefinition{
    private Map<Long, Task> tasks;
    
    public ProcessDefinitionImpl() {
        this.tasks = new HashMap<Long, Task>();
    }
    
    
    
    public Map<Long, Task> getTasks() {
        return this.tasks;
    }

    
    public void setTasks(Map<Long, Task> tasks) {
        this.tasks = tasks;
    }

    
    public void addTask(Long id, Task task) {
        if(this.tasks == null){
            this.tasks = new HashMap<Long, Task>();
        }
        this.tasks.put(id, task);
    }

    
    
    
}
