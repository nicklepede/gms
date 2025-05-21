package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bxdd;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.clmy;
import defpackage.cmfe;
import defpackage.cmfy;
import defpackage.eihn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class MigrationCompleteIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (eihn.a(intent.getAction(), "com.google.android.gms.nearby.sharing.MIGRATION_COMPLETED")) {
            cmfe.a.b().p("Resetting flags after migration completed.", new Object[0]);
            cmfy.c();
            bxdd c = bxek.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0).c();
            c.e("migration_acknowledged", true);
            bxdg.g(c);
            clmy.a(this);
        }
    }
}
