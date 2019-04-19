package com.qf.entity;

public class BaseDict {
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private Integer dictIsEditable;

    private Integer dictFlag;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem == null ? null : dictItem.trim();
    }

    public Integer getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Integer dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

    public Integer getDictFlag() {
        return dictFlag;
    }

    public void setDictFlag(Integer dictFlag) {
        this.dictFlag = dictFlag;
    }
}