package com.google.android.gms.octarine.jsbridges.telephony;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cvkd;
import defpackage.ekvl;
import defpackage.ftkm;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AuthSmsCodeReceiver extends TracingBroadcastReceiver {
    private final cvkd a;

    public AuthSmsCodeReceiver(cvkd cvkdVar) {
        super("octarine");
        this.a = cvkdVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Pattern compile = Pattern.compile(ftkm.a.lK().a());
        for (SmsMessage smsMessage : messagesFromIntent) {
            Matcher matcher = compile.matcher(smsMessage.getDisplayMessageBody());
            while (matcher.find()) {
                String group = matcher.group(1);
                ekvl.y(group);
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
