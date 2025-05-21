package com.google.android.gms.family.invites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SmsSentReceiver extends TracingBroadcastReceiver {
    private final ResultReceiver a;

    public SmsSentReceiver(ResultReceiver resultReceiver) {
        super("family");
        this.a = resultReceiver;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (!"com.google.android.gms.family.invites".equals(intent.getAction())) {
            Log.e("Family", String.format(Locale.US, "[SmsSentReceiver] Intent action didn't match, ignoring", new Object[0]));
            return;
        }
        int resultCode = getResultCode();
        Contact contact = new Contact();
        contact.b = intent.getStringExtra("display-name");
        contact.a = intent.getStringExtra("phone");
        contact.f = intent.getStringExtra("invitation-id");
        contact.e = intent.getStringExtra("invitation-message");
        contact.d = intent.getIntExtra("contact-id", -1);
        contact.h = intent.getIntExtra("num-messages", 1);
        intent.getStringExtra("invitation-id");
        Bundle bundle = new Bundle();
        if (resultCode == -1) {
            int i = SendInvitationsResultReceiver.a;
            bundle.putInt("result-code", 4);
            bundle.putParcelable("contact", contact);
        } else {
            int i2 = SendInvitationsResultReceiver.a;
            bundle.putInt("result-code", 3);
            bundle.putParcelable("contact", contact);
        }
        this.a.send(-1, bundle);
    }
}
