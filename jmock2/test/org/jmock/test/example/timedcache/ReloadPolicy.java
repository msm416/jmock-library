package org.jmock.test.example.timedcache;

import java.util.Date;

public interface ReloadPolicy {
    boolean shouldReload(Date loadTime, Date fetchTime);
}
