/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.process.engine.services;

import com.salaboy.process.engine.structures.NodeInstance;

/**
 *
 * @author salaboy
 */
public class DefaultProcessEventSupportService implements ProcessEventSupportService{

    
    public void fireBeforeTaskTriggered(NodeInstance task) {
        System.out.println("BEFORE TASK FIRED: "+ task.getTask());
    }

    
    public void fireAfterTaskTriggered(NodeInstance task) {
        System.out.println("AFTER TASK FIRED: "+ task.getTask());
    }

    
    public void fireBeforeTaskLeft(NodeInstance task) {
        System.out.println("BEFORE TASK LEFT: "+ task.getTask());
    }

    
    public void fireAfterTaskLeft(NodeInstance task) {
        System.out.println("AFTER TASK LEFT: "+ task.getTask());
    }
    
}
