package com.applications.world.hello;

/**
 * http://www.design-patterns-stories.com/patterns/Facade/
 *
 * OperandNode, represents OperandNode in Abstract Syntax Tree.
 *
 */
public class OperandNode extends Node {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}