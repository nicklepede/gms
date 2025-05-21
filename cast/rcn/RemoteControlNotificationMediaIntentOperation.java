package com.google.android.gms.cast.rcn;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.amgd;
import defpackage.angp;
import defpackage.angr;
import defpackage.angs;
import defpackage.annw;
import defpackage.elzh;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RemoteControlNotificationMediaIntentOperation extends IntentOperation {
    private static final annw a = new annw("RCNIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.cast.rcn.ACTION_CLICK")) {
            angs angsVar = CastRemoteControlNotificationChimeraService.c;
            annw annwVar = a;
            annwVar.m("RCN ACTION_CLICK received via Intent Operation.");
            if (angsVar == null) {
                annwVar.d("Received ACTION_CLICK before controllerManager was initialized.", new Object[0]);
                return;
            }
            angr a2 = angsVar.a(intent.getStringExtra("extra_device_id"));
            if (a2 != null) {
                annw annwVar2 = angr.a;
                annwVar2.m("handleClickAction is called");
                Intent intent2 = (Intent) intent.getParcelableExtra("extra_intent_to_launch");
                if (intent2 == null) {
                    annwVar2.d("No intent embedded in the content intent.", new Object[0]);
                    return;
                }
                if (a2.c.o()) {
                    intent2.setFlags(268435456);
                }
                a2.b.startActivity(intent2);
                int a3 = elzh.a(intent.getIntExtra("extra_click_result_code", 0));
                if (a3 != 0) {
                    angp angpVar = a2.d;
                    amgd amgdVar = angpVar.a;
                    amgdVar.ac(angpVar.b, angpVar.c, amgdVar.e.a(), angpVar.d, a3);
                }
            }
        }
    }
}
