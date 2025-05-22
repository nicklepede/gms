package com.google.android.gms.autofill.ui;

import android.os.Bundle;
import defpackage.aill;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ektg;
import defpackage.eluo;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillBaseSettingsChimeraActivity extends rxx {
    private static final ausn j = ausn.b("AutofillBaseSettingsChimeraActivity", auid.AUTOFILL);

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ausn ausnVar = j;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 1272)).x("onCreate");
        super.onCreate(bundle);
        startActivity(aill.F(7, ektg.a));
        ((eluo) ((eluo) ausnVar.h()).ai((char) 1273)).x("Started settings intent");
        finish();
    }
}
