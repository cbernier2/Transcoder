package com.otaliastudios.transcoder.postprocessor;

import androidx.annotation.NonNull;

import java.nio.ShortBuffer;

public interface AudioPostProcessor extends PostProcessor {
    long postProcess(@NonNull final ShortBuffer inputBuffer, @NonNull final ShortBuffer outputBuffer, long bufferDurationUs);
}
