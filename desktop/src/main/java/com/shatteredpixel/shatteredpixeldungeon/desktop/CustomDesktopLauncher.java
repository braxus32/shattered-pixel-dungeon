package com.shatteredpixel.shatteredpixeldungeon.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.shatteredpixel.shatteredpixeldungeon.CustomShatteredPixelDungeon;
import com.shatteredpixel.shatteredpixeldungeon.ShatteredPixelDungeon;
import com.watabou.utils.PlatformSupport;

// Copy from DesktopLauncher, replace ShatteredPixelDungeon with CustomShatteredPixelDungeon

public class CustomDesktopLauncher {

    public static void main(String[] args) {
        // ... same as DesktopLauncher ...

        // Change this line:
        new Lwjgl3Application(new CustomShatteredPixelDungeon(new DesktopPlatformSupport()), config);
    }
}
