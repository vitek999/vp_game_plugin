package org.test.vp;

import com.vp.plugin.VPPlugin;
import com.vp.plugin.VPPluginInfo;

public class hello implements VPPlugin {

    @Override
    public void loaded(VPPluginInfo arg0) {
       System.out.println("Hello world from GameModel plugin");
    }

    @Override
    public void unloaded() {
    
    } 
    
}