package org.apache.hadoop.yarn.server.resourcemanager.recovery;

import org.apache.hadoop.yarn.exceptions.YarnException;

public class StoreLimitException extends YarnException {
    private static final long serialVersionUID = 1L;

    public StoreLimitException(String message) {
        super(message);
    }
}