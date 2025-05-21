package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.webkit.WebView;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.fqnl;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GunsSmsReceiver extends TracingBroadcastReceiver {
    private final WebView a;

    public GunsSmsReceiver(WebView webView) {
        super("notifications");
        this.a = webView;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(fqnl.a.a().e());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.loadUrl("javascript:onSmsReceived('" + ((String) arrayList.get(i)) + "')");
        }
    }
}
