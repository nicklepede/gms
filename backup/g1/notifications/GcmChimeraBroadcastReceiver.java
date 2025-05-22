package com.google.android.gms.backup.g1.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.ajwt;
import defpackage.aldd;
import defpackage.bkcz;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emzd;
import defpackage.enam;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fodi;
import defpackage.fodw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final ajwt b = new ajwt(GcmChimeraBroadcastReceiver.class.getName());
    private aldd c;

    private final void a(Context context, Intent intent, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, NotificationProcessorIntentOperation.class, "com.google.android.gms.backup.g1.notifications.HANDLE_NOTIFICATION");
        if (startIntent == null) {
            if (z) {
                aldd alddVar = this.c;
                fgrc v = enam.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                enam enamVar = (enam) fgriVar;
                enamVar.b |= 1;
                enamVar.c = false;
                if (!fgriVar.L()) {
                    v.U();
                }
                enam enamVar2 = (enam) v.b;
                enamVar2.d = 1;
                enamVar2.b |= 2;
                enam enamVar3 = (enam) v.Q();
                fgrc v2 = emux.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                emux emuxVar = (emux) v2.b;
                enamVar3.getClass();
                emuxVar.Z = enamVar3;
                emuxVar.c |= 33554432;
                alddVar.a((emux) v2.Q(), emuw.BROADCAST_RESULT_FROM_NOTIFICATION_MODULE_EVENT);
            } else {
                this.c.d(4);
            }
            b.f("Failed to create a NotificationProcessorIntentOperation intent", new Object[0]);
            return;
        }
        startIntent.putExtra("notification_intent", intent);
        b.j("Starting intent operation to handle notification", new Object[0]);
        if (z) {
            aldd alddVar2 = this.c;
            fgrc v3 = enam.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            enam enamVar4 = (enam) v3.b;
            enamVar4.b |= 1;
            enamVar4.c = true;
            enam enamVar5 = (enam) v3.Q();
            fgrc v4 = emux.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            emux emuxVar2 = (emux) v4.b;
            enamVar5.getClass();
            emuxVar2.Z = enamVar5;
            emuxVar2.c |= 33554432;
            alddVar2.a((emux) v4.Q(), emuw.BROADCAST_RESULT_FROM_NOTIFICATION_MODULE_EVENT);
        } else {
            aldd alddVar3 = this.c;
            fgrc v5 = emzd.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            emzd emzdVar = (emzd) v5.b;
            emzdVar.b |= 2;
            emzdVar.d = true;
            emzd emzdVar2 = (emzd) v5.Q();
            fgrc v6 = emux.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            emux emuxVar3 = (emux) v6.b;
            emzdVar2.getClass();
            emuxVar3.V = emzdVar2;
            emuxVar3.c |= 2097152;
            alddVar3.a((emux) v6.Q(), emuw.GCM_MESSAGE_RECEIVED_EVENT);
        }
        context.startService(startIntent);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new aldd();
        }
        if (fodw.D() && "com.google.android.gms.backup.ACTION_NOTIFICATION_ADDED_TO_TRAY".equals(intent.getAction())) {
            b.j("Received action ACTION_NOTIFICATION_ADDED_TO_TRAY", new Object[0]);
            a(context, intent, true);
        } else {
            if (!fodi.g()) {
                this.c.d(2);
                return;
            }
            bkcz.a(context.getApplicationContext());
            if ("gcm".equals(bkcz.e(intent))) {
                b.j("Received GCM", new Object[0]);
                a(context, intent, false);
            } else {
                b.j("Did not receive GCM", new Object[0]);
                this.c.d(3);
            }
        }
    }
}
