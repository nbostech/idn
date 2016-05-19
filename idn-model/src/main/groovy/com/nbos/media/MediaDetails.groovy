package com.nbos.media

class MediaDetails {
    int width
    int height
    String mediatype

    MediaDetails(int nwidth, int nheight, String type) {
        width = nwidth
        height = nheight
        mediatype = type
    }
}

class MediaFileDetails {
    String mediapath
    String mediatype
}

class MediaInfo {
    String extension
    String supportedsizes
    List<MediaFileDetails> mediaFileDetailsList
}
