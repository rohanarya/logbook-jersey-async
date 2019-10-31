package org.zalando.logbook.servlet;


import org.zalando.fauxpas.ThrowingConsumer;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import java.io.IOException;


public final class OnCompleteAsyncListener implements AsyncListener {

    private final ThrowingConsumer<AsyncEvent, IOException> consumer;

    public OnCompleteAsyncListener(ThrowingConsumer<AsyncEvent, IOException> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void onComplete(final AsyncEvent event) throws IOException {
        consumer.tryAccept(event);
    }

    @Override
    public void onTimeout(final AsyncEvent event) {

    }

    @Override
    public void onError(final AsyncEvent event) {

    }

    @Override
    public void onStartAsync(final AsyncEvent event) {

    }

}