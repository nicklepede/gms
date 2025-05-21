package com.google.android.gms.autofill.ui;

import android.os.Bundle;
import defpackage.agkv;
import defpackage.asej;
import defpackage.asot;
import defpackage.eigb;
import defpackage.ejhf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillBaseSettingsChimeraActivity extends qet {
    private static final asot j = asot.b("AutofillBaseSettingsChimeraActivity", asej.AUTOFILL);

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        asot asotVar = j;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 1268)).x("onCreate");
        super.onCreate(bundle);
        startActivity(agkv.F(7, eigb.a));
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 1269)).x("Started settings intent");
        finish();
    }
}
