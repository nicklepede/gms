package com.google.android.gms.constellation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asvp;
import defpackage.asvr;
import defpackage.asxr;
import defpackage.asxu;
import defpackage.atlw;
import defpackage.atmg;
import defpackage.enwb;
import defpackage.enwd;
import defpackage.fjrp;
import defpackage.fmlz;
import defpackage.fmml;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final arxo b = atmg.a("gcm_receiver");
    public atlw c;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
            asvp.h();
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS");
            startIntent.putExtra("eventmanager.generate_iid_token", true);
            startIntent.putExtra("eventmanager.force_refresh", true);
            context.startService(startIntent);
            return;
        }
        if (!fmml.a.a().q()) {
            b.h("Received push but receiver disabled", new Object[0]);
            return;
        }
        this.c = atlw.a(context);
        arxo arxoVar = b;
        arxoVar.d("Received tickle", new Object[0]);
        UUID randomUUID = UUID.randomUUID();
        String stringExtra = intent.getStringExtra("event");
        if (!fmlz.a.a().a() || !Objects.equals(stringExtra, "message")) {
            asvr asvrVar = new asvr(this, new aslv(new aslw(10)), randomUUID);
            this.c.I(randomUUID, 9);
            if (Objects.equals(stringExtra, "sync")) {
                asvp.h();
                asvp.g(context.getApplicationContext(), randomUUID, 9, asvrVar);
                return;
            } else {
                if (Objects.equals(stringExtra, "sync_if_mismatch")) {
                    asvp.h();
                    asvp.e(context.getApplicationContext(), randomUUID, 9, asvrVar);
                    return;
                }
                return;
            }
        }
        try {
            asxr a = asxr.a(intent);
            atlw atlwVar = this.c;
            String str = a.a;
            atlwVar.p(str, enwd.OTT_TICKLE_RECEIVED);
            arxoVar.d("calling event manager", new Object[0]);
            asxu a2 = asxu.a();
            Context applicationContext = context.getApplicationContext();
            Intent startIntent2 = IntentOperation.getStartIntent(applicationContext, "com.google.android.gms.constellation.ottmessenger.OttManager", "com.google.android.gms.constellation.ottmessenger.FETCH_OTT_MESSAGE");
            if (startIntent2 == null) {
                throw new IllegalStateException("Ack action not found in Ott IntentOperation for this context.");
            }
            startIntent2.putExtra("sessionID", str);
            startIntent2.putExtra("sender", String.valueOf(fjrp.a(a.c)));
            startIntent2.putExtra("messageID", a.b);
            a2.b.d("Sending OTT Fetch intent to OttManager for session %s", str);
            applicationContext.startService(startIntent2);
        } catch (IllegalArgumentException e) {
            b.g("Invalid OTT Message Tickle received:", e, new Object[0]);
            this.c.h(randomUUID.toString(), enwd.OTT_TICKLE_RECEIVED, enwb.OTT_INVALID_TICKLE, e.getMessage() == null ? "Invalid OTT Message Tickle received" : e.getMessage());
        }
    }
}
