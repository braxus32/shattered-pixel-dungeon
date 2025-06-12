package com.shatteredpixel.shatteredpixeldungeon;

import com.shatteredpixel.shatteredpixeldungeon.scenes.CustomGameScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.GameScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.watabou.noosa.Game;
import com.watabou.utils.PlatformSupport;

public class CustomShatteredPixelDungeon extends ShatteredPixelDungeon {

    public CustomShatteredPixelDungeon(PlatformSupport platform) {
        super(platform);
    }

    public static void switchNoFade(Class<? extends PixelScene> c) {
        if (c == GameScene.class) {
            c = CustomGameScene.class;
        }
        ShatteredPixelDungeon.switchNoFade(c);
    }

    // Similar for other switch methods
}
