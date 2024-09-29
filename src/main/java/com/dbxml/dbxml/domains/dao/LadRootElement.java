package com.dbxml.dbxml.domains.dao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LAD")
public class LadRootElement {

    private LadDao lad;
    private ConsumerDao consumer;

    public LadDao getLad() {
        return lad;
    }

    @XmlElement(name = "LAD")
    public void setLad(LadDao lad) {
        this.lad = lad;
    }

    public ConsumerDao getConsumer() {
        return consumer;
    }

    @XmlElement(name = "CONSUMER")
    public void setConsumer(ConsumerDao consumer) {
        this.consumer = consumer;
    }


}
