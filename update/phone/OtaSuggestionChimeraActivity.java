package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OtaSuggestionChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent().setClassName(this, "com.google.android.gms.update.SystemUpdateActivity"));
        finish();
    }
}
