package com.siliconnile.library.dto;

import com.pearlox.framework.dto.BasicDTO;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Andrew
 * Date: 6/27/13
 */
@XmlRootElement
public class SampleObjectDTO extends BasicDTO {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
