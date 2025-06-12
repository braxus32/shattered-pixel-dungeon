package com.shatteredpixel.shatteredpixeldungeon.scenes;

import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.tiles.DungeonTilemap;

public class CustomGameScene extends GameScene {

    @Override
    public void create() {
        super.create();
        // Replace cellSelector with custom
        cellSelector.destroy();
        remove(cellSelector);
        cellSelector = new CustomCellSelector(tiles);
        add(cellSelector);
    }
}
