package com.simplifyqa.codeeditor;

import com.simplifyqa.pluginbase.codeeditor.annotations.SyncAction;
import com.simplifyqa.pluginbase.common.enums.TechnologyType;
import com.simplifyqa.pluginbase.plugin.annotations.Sync;
import com.simplifyqa.pluginbase.plugin.annotations.ObjectTemplate;

public class ad {

    public ad(){

    }

    @SyncAction(uniqueId = "MyProject-Sample-111",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public void add (){
        int a=10;
        int b=10;
        int c=a+b;
        System.out.println(c);
    }
    @SyncAction(uniqueId = "MyProject-Sample-112",groupName = "Click",objectTemplate = @ObjectTemplate(name = TechnologyType.WEB,description = "This action belongs to WEB"))
    public void sub (){
        int a=10;
        int b=10;
        int c=a-b;
        System.out.println(c);
    }
}
