package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dxyi;
import defpackage.fnbo;
import defpackage.xbw;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MinuteMaidAuthSmsReceiver extends TracingBroadcastReceiver {
    private final WebView a;

    public MinuteMaidAuthSmsReceiver(WebView webView) {
        super("auth_account");
        this.a = webView;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent == null) {
            Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidAuthSmsReceiver] messages is null", new Object[0]));
            return;
        }
        dxyi dxyiVar = xbw.a;
        Pattern compile = Pattern.compile(fnbo.a.lK().u());
        for (SmsMessage smsMessage : messagesFromIntent) {
            String displayMessageBody = smsMessage.getDisplayMessageBody();
            if (displayMessageBody == null) {
                Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidAuthSmsReceiver] messageBody is null", new Object[0]));
            } else {
                Matcher matcher = compile.matcher(displayMessageBody);
                while (matcher.find()) {
                    arrayList.add(matcher.group(1));
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.loadUrl("javascript:onSmsReceived('" + ((String) arrayList.get(i)) + "')");
        }
    }
}
