package b.alwaystabsforums;

import org.telegram.tgnet.TLRPC;

import de.robv.android.xposed.XC_MethodReplacement;

public class Hook extends XC_MethodReplacement {
    @Override
    protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
        TLRPC.Chat chat = (TLRPC.Chat) param.args[0];
        if(chat != null){
            return chat.forum;
        }
        return false;
    }
}
