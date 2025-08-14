package b.alwaystabsforums;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

import java.lang.reflect.Method;

import de.robv.android.xposed.XposedBridge;

public class Main {
    public void start() throws NoSuchMethodException {
        Method areTabsEnabled = ChatObject.class.getDeclaredMethod("areTabsEnabled", TLRPC.Chat.class);
        areTabsEnabled.setAccessible(true);
        XposedBridge.hookMethod(areTabsEnabled, new Hook());

    }
}
