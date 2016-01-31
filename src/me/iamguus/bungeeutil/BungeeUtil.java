package me.iamguus.bungeeutil;

import net.md_5.bungee.api.Favicon;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Guus on 31-1-2016.
 */
public class BungeeUtil extends Plugin implements Listener {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void onProxyPing(ProxyPingEvent event) {
        try {
            File iconFile = new File("server-icon.png");
            BufferedImage iconImg = ImageIO.read(iconFile);
            event.getResponse().setFavicon(Favicon.create(iconImg));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        event.getResponse().set
    }
}
