package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bzlt;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.cnvg;
import defpackage.conm;
import defpackage.coog;
import defpackage.ekus;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class MigrationCompleteIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ekus.a(intent.getAction(), "com.google.android.gms.nearby.sharing.MIGRATION_COMPLETED")) {
            conm.a.b().p("Resetting flags after migration completed.", new Object[0]);
            coog.c();
            bzlt c = bzna.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0).c();
            c.e("migration_acknowledged", true);
            bzlw.g(c);
            cnvg.a(this);
        }
    }
}
