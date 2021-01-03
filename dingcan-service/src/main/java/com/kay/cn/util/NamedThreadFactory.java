package com.kay.cn.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程名称工厂
 *
 * @author kay
 */
public class NamedThreadFactory implements ThreadFactory {
    private final ThreadGroup group;
    private final AtomicInteger threadNumber;
    private final String namePrefix;

    public NamedThreadFactory(String name) {
        this.threadNumber = new AtomicInteger(1);
        SecurityManager s = System.getSecurityManager();
        this.group = s != null ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.namePrefix = name + "-thread-";
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.group, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
        thread.setDaemon(true);
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
