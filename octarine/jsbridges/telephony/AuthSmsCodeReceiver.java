package com.google.android.gms.octarine.jsbridges.telephony;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ctaz;
import defpackage.eiig;
import defpackage.fqqo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AuthSmsCodeReceiver extends TracingBroadcastReceiver {
    private final ctaz a;

    public AuthSmsCodeReceiver(ctaz ctazVar) {
        super("octarine");
        this.a = ctazVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(fqqo.a.a().a());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                String group = matcher.group(1);
                eiig.x(group);
                arrayList.add(group);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            try {
                Long.parseLong(str);
                this.a.m(String.format("if (window.ocTelephonySmsCodeReceived) { window.ocTelephonySmsCodeReceived(%s); }", JSONObject.quote(str)));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
