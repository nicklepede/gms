package com.google.android.gms.cast.rcn;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.cast.rcn.CastRemoteControlNotificationIntentOperation;
import defpackage.aovk;
import defpackage.appp;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.dhlk;
import defpackage.fopc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastRemoteControlNotificationIntentOperation extends IntentOperation {
    public static final appp a = new appp("RCNIntentOperation");
    public Intent b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (fopc.c()) {
            Intent intent = new Intent("com.google.android.gms.cast.rcn.CastPersistentAction");
            this.b = intent;
            intent.setPackage("com.google.android.gms");
        } else {
            Intent intent2 = new Intent();
            this.b = intent2;
            intent2.setClassName(getApplicationContext(), "com.google.android.gms.cast.service.CastPersistentService");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        appp apppVar = a;
        apppVar.n("onHandleIntent %s", intent);
        if (intent == null) {
            apppVar.g("onHandleIntent received a null intent", new Object[0]);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            aszs aszsVar = aovk.a;
            atad atadVar = new atad((Context) this, (char[][]) null);
            atfn atfnVar = new atfn();
            atfnVar.d = 8419;
            atfnVar.a = new atfd() { // from class: aovn
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    aovw aovwVar = (aovw) obj;
                    ((aowb) aovwVar.H()).a(new aowd((dhma) obj2), bsxa.a(aovwVar.r));
                }
            };
            atadVar.jd(atfnVar.a()).x(new dhlk() { // from class: aphn
                @Override // defpackage.dhlk
                public final void hH(dhlw dhlwVar) {
                    CastRemoteControlNotificationIntentOperation castRemoteControlNotificationIntentOperation = CastRemoteControlNotificationIntentOperation.this;
                    if (dhlwVar.m() && ((Boolean) dhlwVar.i()).booleanValue()) {
                        CastRemoteControlNotificationIntentOperation.a.m("RCN is enabled on this network.");
                        castRemoteControlNotificationIntentOperation.startService(castRemoteControlNotificationIntentOperation.b);
                    } else {
                        CastRemoteControlNotificationIntentOperation.a.f("RCN is disabled on this network.", new Object[0]);
                        castRemoteControlNotificationIntentOperation.stopService(castRemoteControlNotificationIntentOperation.b);
                    }
                }
            });
        }
    }
}
