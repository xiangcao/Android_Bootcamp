package com.codepath.simpletodo;

import java.io.Serializable;

/**
 * Created by xiangcaol on 6/22/16.
 */

public class LineItem implements Serializable {
    private static final long serialVersionUID = 5177222050535318633L;
    private String item;
    private int pos;

    public LineItem(String item, int pos){
        this.item = item;
        this.pos = pos;
    }

    public int getPos(){
        return pos;
    }

    public String getItem(){
        return item;
    }
}
