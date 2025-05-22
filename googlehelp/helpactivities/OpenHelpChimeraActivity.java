package com.google.android.gms.googlehelp.helpactivities;

import android.content.Intent;
import android.os.Bundle;
import defpackage.aura;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OpenHelpChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent j = aura.j("com.google.android.gms.googlehelp.HELP");
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
