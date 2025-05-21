package com.google.android.gms.cast.rcn;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.cast.rcn.CastRemoteControlNotificationIntentOperation;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import defpackage.amtz;
import defpackage.annw;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.dfae;
import defpackage.flxs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastRemoteControlNotificationIntentOperation extends IntentOperation {
    public static final annw a = new annw("RCNIntentOperation");
    public Intent b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (flxs.c()) {
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
        annw annwVar = a;
        annwVar.n("onHandleIntent %s", intent);
        if (intent == null) {
            annwVar.g("onHandleIntent received a null intent", new Object[0]);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            aqxd aqxdVar = amtz.a;
            aqxo aqxoVar = new aqxo((Context) this, (char[][]) null);
            arcy arcyVar = new arcy();
            arcyVar.d = 8419;
            arcyVar.a = new arco() { // from class: amuc
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    amul amulVar = (amul) obj;
                    amus amusVar = new amus((dfau) obj2);
                    Context context = amulVar.r;
                    ((amuq) amulVar.H()).a(amusVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                }
            };
            aqxoVar.iO(arcyVar.a()).x(new dfae() { // from class: anga
                @Override // defpackage.dfae
                public final void hr(dfaq dfaqVar) {
                    CastRemoteControlNotificationIntentOperation castRemoteControlNotificationIntentOperation = CastRemoteControlNotificationIntentOperation.this;
                    if (dfaqVar.m() && ((Boolean) dfaqVar.i()).booleanValue()) {
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
