package com.siliconnile.library.domain;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Andrew
 * Date: 6/18/13
 */
@Entity
@Table(name = "sample", schema = "public")
public class SampleObject extends BasicObject {

    private String name;

    
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
