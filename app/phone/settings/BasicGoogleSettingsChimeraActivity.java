package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.assk;
import defpackage.tqj;
import defpackage.tqk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BasicGoogleSettingsChimeraActivity extends tqk {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class GoogleSettingsIntentCompleteOperation extends tqj {
    }

    @Override // defpackage.tqk
    protected final Intent a(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("id", i);
        intent.putExtra("title", str);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.app.settings.SettingsSubPageActivity");
        return intent;
    }

    @Override // defpackage.tqk
    protected final assk k(CharSequence charSequence, int i) {
        return assk.h(charSequence, i);
    }

    @Override // defpackage.tqk, defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.common_google));
    }
}
