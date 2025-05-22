package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.auwe;
import defpackage.vmj;
import defpackage.vmk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BasicGoogleSettingsChimeraActivity extends vmk {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class GoogleSettingsIntentCompleteOperation extends vmj {
    }

    @Override // defpackage.vmk
    protected final Intent a(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("id", i);
        intent.putExtra("title", str);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.app.settings.SettingsSubPageActivity");
        return intent;
    }

    @Override // defpackage.vmk
    protected final auwe k(CharSequence charSequence, int i) {
        return auwe.h(charSequence, i);
    }

    @Override // defpackage.vmk, defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.common_google));
    }
}
