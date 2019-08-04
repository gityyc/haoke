package com.haoke.dubbo.server.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BasePojo implements Serializable {
    private Date created;
    private Date update;

    public void setUpdated(Date created) {
    }
}