package com.google.android.gms.backup.g1.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.ahwd;
import defpackage.ajcl;
import defpackage.bhyk;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.eklr;
import defpackage.ekna;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.flly;
import defpackage.flmm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final ahwd b = new ahwd(GcmChimeraBroadcastReceiver.class.getName());
    private ajcl c;

    private final void a(Context context, Intent intent, boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(context, NotificationProcessorIntentOperation.class, "com.google.android.gms.backup.g1.notifications.HANDLE_NOTIFICATION");
        if (startIntent == null) {
            if (z) {
                ajcl ajclVar = this.c;
                fecj v = ekna.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ekna eknaVar = (ekna) fecpVar;
                eknaVar.b |= 1;
                eknaVar.c = false;
                if (!fecpVar.L()) {
                    v.U();
                }
                ekna eknaVar2 = (ekna) v.b;
                eknaVar2.d = 1;
                eknaVar2.b |= 2;
                ekna eknaVar3 = (ekna) v.Q();
                fecj v2 = ekhl.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ekhl ekhlVar = (ekhl) v2.b;
                eknaVar3.getClass();
                ekhlVar.Z = eknaVar3;
                ekhlVar.c |= 33554432;
                ajclVar.a((ekhl) v2.Q(), ekhk.BROADCAST_RESULT_FROM_NOTIFICATION_MODULE_EVENT);
            } else {
                this.c.d(4);
            }
            b.f("Failed to create a NotificationProcessorIntentOperation intent", new Object[0]);
            return;
        }
        startIntent.putExtra("notification_intent", intent);
        b.j("Starting intent operation to handle notification", new Object[0]);
        if (z) {
            ajcl ajclVar2 = this.c;
            fecj v3 = ekna.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            ekna eknaVar4 = (ekna) v3.b;
            eknaVar4.b |= 1;
            eknaVar4.c = true;
            ekna eknaVar5 = (ekna) v3.Q();
            fecj v4 = ekhl.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            ekhl ekhlVar2 = (ekhl) v4.b;
            eknaVar5.getClass();
            ekhlVar2.Z = eknaVar5;
            ekhlVar2.c |= 33554432;
            ajclVar2.a((ekhl) v4.Q(), ekhk.BROADCAST_RESULT_FROM_NOTIFICATION_MODULE_EVENT);
        } else {
            ajcl ajclVar3 = this.c;
            fecj v5 = eklr.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            eklr eklrVar = (eklr) v5.b;
            eklrVar.b |= 2;
            eklrVar.d = true;
            eklr eklrVar2 = (eklr) v5.Q();
            fecj v6 = ekhl.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            ekhl ekhlVar3 = (ekhl) v6.b;
            eklrVar2.getClass();
            ekhlVar3.V = eklrVar2;
            ekhlVar3.c |= 2097152;
            ajclVar3.a((ekhl) v6.Q(), ekhk.GCM_MESSAGE_RECEIVED_EVENT);
        }
        context.startService(startIntent);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new ajcl();
        }
        if (flmm.D() && "com.google.android.gms.backup.ACTION_NOTIFICATION_ADDED_TO_TRAY".equals(intent.getAction())) {
            b.j("Received action ACTION_NOTIFICATION_ADDED_TO_TRAY", new Object[0]);
            a(context, intent, true);
        } else {
            if (!flly.g()) {
                this.c.d(2);
                return;
            }
            bhyk.a(context.getApplicationContext());
            if ("gcm".equals(bhyk.e(intent))) {
                b.j("Received GCM", new Object[0]);
                a(context, intent, false);
            } else {
                b.j("Did not receive GCM", new Object[0]);
                this.c.d(3);
            }
        }
    }
}
