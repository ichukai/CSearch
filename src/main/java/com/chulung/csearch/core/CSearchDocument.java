package com.chulung.csearch.core;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexableField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chulung on 2016/11/10.
 */
public class CSearchDocument {
    public static final String ID = "id";
    public static  final  String TITLE="title";
    public  static  final  String CONTEXT="context";
    private String id;
    private String title;
    private String context;

    public CSearchDocument(String id,String title,String context){
        if (id==null) throw new IllegalArgumentException("id can't be null!");
        this.id=id;
        this.title=title;
        this.context=context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CSearchDocument{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}