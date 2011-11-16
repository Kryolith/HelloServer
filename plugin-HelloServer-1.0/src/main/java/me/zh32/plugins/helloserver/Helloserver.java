package me.zh32.plugins.helloserver;

import org.bukkit.plugin.java.JavaPlugin;

public class Helloserver extends JavaPlugin {
    public void onDisable() {
        // TODO: Place any custom disable code here.
        System.out.println(this + " is now disabled!");
    }

    public void onEnable() {
        // TODO: Place any custom enable code here, such as registering events
        
        System.out.println(this + " is now enabled! Hooray");
    }
}
