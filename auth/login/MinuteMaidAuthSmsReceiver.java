package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dvni;
import defpackage.fkkz;
import defpackage.vfv;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MinuteMaidAuthSmsReceiver extends TracingBroadcastReceiver {
    private final WebView a;

    public MinuteMaidAuthSmsReceiver(WebView webView) {
        super("auth_account");
        this.a = webView;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        if (messagesFromIntent == null) {
            Log.w("Auth", String.format(Locale.US, "[MinuteMaid, MinuteMaidAuthSmsReceiver] messages is null", new Object[0]));
            return;
        }
        dvni dvniVar = vfv.a;
        Pattern compile = Pattern.compile(fkkz.a.a().u());
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
