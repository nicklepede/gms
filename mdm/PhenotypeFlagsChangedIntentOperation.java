package com.google.android.gms.mdm;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.PhenotypeFlagsChangedIntentOperation;
import defpackage.aswd;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgfk;
import defpackage.cfcc;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvm;
import defpackage.eles;
import defpackage.elhz;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PhenotypeFlagsChangedIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("PhenotypeChangedIntOp", auid.SECURITY);
    private static final elhz c = elhz.K("com.google.android.gms.security", "com.google.android.gms.findmydevice");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        ekvi c2 = intent != null ? eles.j(c).c(new ekvm() { // from class: cfce
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                int i = PhenotypeFlagsChangedIntentOperation.a;
                return auua.f((String) obj).equals(intent.getAction());
            }
        }) : ektg.a;
        if (!c2.h()) {
            ((eluo) b.j()).B("Unsupported intent: [%s]", intent != null ? intent.getAction() : null);
            return;
        }
        ((eluo) b.h()).x("New flags committed.");
        dxwx.f(dxxi.a((String) c2.c()));
        cfcc.b(aswd.a, new bgfk(this), this);
    }
}
