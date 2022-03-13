package com.messageutils.bluenatural;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.boss.BossBar;

public class BarUtils {
	static List<BossBar> list = new ArrayList<>();
	
	public static void addBossBar(BossBar bb) {
		list.add(bb);
	}
	public static BossBar getBar(String name) {
		for(BossBar bb : list) {
			if(!bb.getTitle().equals(name)) {
				continue;
			}
			return bb;
			
		}
		return null;
	}
    public static void removeBossBar(String name) {
    	int n = 0;
    	for(int i = 0;i < list.size();i++) {
    		if(!list.get(i).equals(name)) {
    			n = i;
    			continue;
    		}
    	}
    	list.remove(n);
    }
}
