package com.mapbox.mapboxsdk.tileprovider.tilesource;

import java.io.InputStream;

import com.mapbox.mapboxsdk.ResourceProxy;
import com.mapbox.mapboxsdk.tileprovider.MapTile;
import com.mapbox.mapboxsdk.tileprovider.tilesource.BitmapTileSourceBase.LowMemoryException;

import android.graphics.drawable.Drawable;

public interface ITileSource {

    /**
     * An ordinal identifier for this tile source
     *
     * @return the ordinal value
     */
    int ordinal();

    /**
     * A human-friendly name for this tile source
     *
     * @return the tile source name
     */
    String name();

    /**
     * A localized human-friendly name for this tile source
     *
     * @param proxy a resource proxy
     * @return the localized tile source name
     */
    String localizedName(ResourceProxy proxy);

    /**
     * Get a rendered Drawable from the specified InputStream.
     *
     * @param aTileInputStream an InputStream
     * @return the rendered Drawable
     */
    Drawable getDrawable(InputStream aTileInputStream) throws LowMemoryException;

    /**
     * Get the minimum zoom level this tile source can provide.
     *
     * @return the minimum zoom level
     */
    public int getMinimumZoomLevel();

    /**
     * Get the maximum zoom level this tile source can provide.
     *
     * @return the maximum zoom level
     */
    public int getMaximumZoomLevel();

    /**
     * Get the tile size in pixels this tile source provides.
     *
     * @return the tile size in pixels
     */
    public int getTileSizePixels();
}
