package com.otaliastudios.transcoder.postprocessor;

public interface PostProcessor {
    long calculateNewDurationUs(long durationUs);
}
