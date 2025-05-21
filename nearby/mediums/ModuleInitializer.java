package com.google.android.gms.nearby.mediums;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.cexc;
import defpackage.cexd;
import defpackage.cjev;
import defpackage.cjfj;
import defpackage.cjld;
import defpackage.cjxr;
import defpackage.fqkd;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cjfj.a.b().h("ModuleInitializer handles incoming intent %s", intent.getAction());
        if (fqkd.a.a().bi() || !Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                return;
            }
            try {
                cexd.a(this, "com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingService", fqkd.aA() && cexc.h(this));
                cjld.b().h(this);
                cjxr.a(this).c();
                cjev.b(this).i();
                getApplicationContext();
            } catch (IllegalArgumentException e) {
                cjfj.a.c().f(e).p("Got IllegalArgumentException when initializing module", new Object[0]);
            } catch (IllegalStateException e2) {
                cjfj.a.c().f(e2).p("Got IllegalStateException when initializing module", new Object[0]);
            } catch (NoSuchMethodError e3) {
                cjfj.a.c().f(e3).p("Got NoSuchMethodError when initializing module", new Object[0]);
            }
        }
    }
}
