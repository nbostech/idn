package com.nbos.modules.media.v0;

import java.util.List;

/**
 * Created by vineeln on 5/21/16.
 */
public class MediaInfo {
    String extension;

    public String getSupportedsizes() {
        return supportedsizes;
    }

    public String getExtension() {
        return extension;
    }

    public List<MediaFileDetails> getMediaFileDetailsList() {
        return mediaFileDetailsList;
    }

    private String supportedsizes;
    private List<MediaFileDetails> mediaFileDetailsList;
}
