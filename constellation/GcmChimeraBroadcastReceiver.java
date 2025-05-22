package com.google.android.gms.constellation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.auzl;
import defpackage.auzn;
import defpackage.avbu;
import defpackage.avbx;
import defpackage.avpz;
import defpackage.avqj;
import defpackage.eqju;
import defpackage.eqjw;
import defpackage.fmhm;
import defpackage.fpdu;
import defpackage.fpeg;
import j$.util.Objects;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final auad b = avqj.a("gcm_receiver");
    public avpz c;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
            auzl.h();
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS");
            startIntent.putExtra("eventmanager.generate_iid_token", true);
            startIntent.putExtra("eventmanager.force_refresh", true);
            context.startService(startIntent);
            return;
        }
        if (!fpeg.a.lK().q()) {
            b.h("Received push but receiver disabled", new Object[0]);
            return;
        }
        this.c = avpz.a(context);
        auad auadVar = b;
        auadVar.d("Received tickle", new Object[0]);
        UUID randomUUID = UUID.randomUUID();
        String stringExtra = intent.getStringExtra("event");
        if (!fpdu.a.lK().a() || !Objects.equals(stringExtra, "message")) {
            auzn auznVar = new auzn(this, new aupp(new aupq(10)), randomUUID);
            this.c.I(randomUUID, 9);
            if (Objects.equals(stringExtra, "sync")) {
                auzl.h();
                auzl.g(context.getApplicationContext(), randomUUID, 9, auznVar);
                return;
            } else {
                if (Objects.equals(stringExtra, "sync_if_mismatch")) {
                    auzl.h();
                    auzl.e(context.getApplicationContext(), randomUUID, 9, auznVar);
                    return;
                }
                return;
            }
        }
        try {
            avbu a = avbu.a(intent);
            avpz avpzVar = this.c;
            String str = a.a;
            avpzVar.p(str, eqjw.OTT_TICKLE_RECEIVED);
            auadVar.d("calling event manager", new Object[0]);
            avbx a2 = avbx.a();
            Context applicationContext = context.getApplicationContext();
            Intent startIntent2 = IntentOperation.getStartIntent(applicationContext, "com.google.android.gms.constellation.ottmessenger.OttManager", "com.google.android.gms.constellation.ottmessenger.FETCH_OTT_MESSAGE");
            if (startIntent2 == null) {
                throw new IllegalStateException("Ack action not found in Ott IntentOperation for this context.");
            }
            startIntent2.putExtra("sessionID", str);
            startIntent2.putExtra("sender", String.valueOf(fmhm.a(a.c)));
            startIntent2.putExtra("messageID", a.b);
            a2.b.d("Sending OTT Fetch intent to OttManager for session %s", str);
            applicationContext.startService(startIntent2);
        } catch (IllegalArgumentException e) {
            b.g("Invalid OTT Message Tickle received:", e, new Object[0]);
            this.c.h(randomUUID.toString(), eqjw.OTT_TICKLE_RECEIVED, eqju.OTT_INVALID_TICKLE, e.getMessage() == null ? "Invalid OTT Message Tickle received" : e.getMessage());
        }
    }
}
