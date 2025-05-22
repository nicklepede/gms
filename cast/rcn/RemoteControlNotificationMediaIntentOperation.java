package com.google.android.gms.cast.rcn;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aoho;
import defpackage.apic;
import defpackage.apie;
import defpackage.apif;
import defpackage.appp;
import defpackage.eomv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RemoteControlNotificationMediaIntentOperation extends IntentOperation {
    private static final appp a = new appp("RCNIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.cast.rcn.ACTION_CLICK")) {
            apif apifVar = CastRemoteControlNotificationChimeraService.c;
            appp apppVar = a;
            apppVar.m("RCN ACTION_CLICK received via Intent Operation.");
            if (apifVar == null) {
                apppVar.d("Received ACTION_CLICK before controllerManager was initialized.", new Object[0]);
                return;
            }
            apie a2 = apifVar.a(intent.getStringExtra("extra_device_id"));
            if (a2 != null) {
                appp apppVar2 = apie.a;
                apppVar2.m("handleClickAction is called");
                Intent intent2 = (Intent) intent.getParcelableExtra("extra_intent_to_launch");
                if (intent2 == null) {
                    apppVar2.d("No intent embedded in the content intent.", new Object[0]);
                    return;
                }
                if (a2.c.p()) {
                    intent2.setFlags(268435456);
                }
                a2.b.startActivity(intent2);
                int a3 = eomv.a(intent.getIntExtra("extra_click_result_code", 0));
                if (a3 != 0) {
                    apic apicVar = a2.d;
                    aoho aohoVar = apicVar.a;
                    aohoVar.ac(apicVar.b, apicVar.c, aohoVar.e.a(), apicVar.d, a3);
                }
            }
        }
    }
}
