package org.xjh.testtool;

import android.content.Context;

import org.xjh.testtool.handler.CrashHandler;

/**
 * Created by xjh on 17-6-29.
 */

public class TestTool {

    /**
     * 测试工具初始化
     * @param context
     */
    public static void init(Context context) {
        CrashHandler.getInstance().init(context);
    }
}
