package com.google.android.gms.googlehelp.helpactivities;

import android.content.Intent;
import android.os.Bundle;
import defpackage.asng;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OpenHelpChimeraActivity extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent j = asng.j("com.google.android.gms.googlehelp.HELP");
        Intent intent = getIntent();
        if (!intent.hasExtra("EXTRA_HELP_CONFIG")) {
            throw new IllegalStateException("OpenHelpChimeraActivity requires a HelpConfig extra.");
        }
        j.putExtras(intent);
        if (intent.getData() != null) {
            j.setData(intent.getData());
        }
        startActivityForResult(j, 111);
    }
}
