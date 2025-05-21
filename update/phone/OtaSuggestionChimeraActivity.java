package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OtaSuggestionChimeraActivity extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent().setClassName(this, "com.google.android.gms.update.SystemUpdateActivity"));
        finish();
    }
}
