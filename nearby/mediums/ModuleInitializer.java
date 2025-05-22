package com.google.android.gms.nearby.mediums;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.chen;
import defpackage.cheo;
import defpackage.clna;
import defpackage.clno;
import defpackage.clti;
import defpackage.cmfw;
import defpackage.ftdv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        clno.a.b().h("ModuleInitializer handles incoming intent %s", intent.getAction());
        if (ftdv.a.lK().bl() || !Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                return;
            }
            try {
                cheo.a(this, "com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingService", ftdv.aC() && chen.i(this));
                clti.b().h(this);
                cmfw.a(this).c();
                clna.b(this).i();
                getApplicationContext();
            } catch (IllegalArgumentException e) {
                clno.a.c().f(e).p("Got IllegalArgumentException when initializing module", new Object[0]);
            } catch (IllegalStateException e2) {
                clno.a.c().f(e2).p("Got IllegalStateException when initializing module", new Object[0]);
            } catch (NoSuchMethodError e3) {
                clno.a.c().f(e3).p("Got NoSuchMethodError when initializing module", new Object[0]);
            }
        }
    }
}
