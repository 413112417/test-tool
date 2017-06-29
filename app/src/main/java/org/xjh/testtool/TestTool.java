package org.xjh.testtool;

import android.app.Application;

import org.xjh.testtool.handler.CrashHandler;

/**
 * Created by xjh on 17-6-29.
 */

public class TestTool {

    /**
     * 测试工具初始化
     * @param application
     */
    public static void install(Application application) {
        CrashHandler.getInstance().init(application);
    }
}
