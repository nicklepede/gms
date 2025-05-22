package com.google.android.gms.trustlet.onbody.discovery;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SettingsSuggestionOnbodyPromotionChimeraActivity extends ryt implements aby {
    private int j = 0;

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ void jF(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (activityResult.b != null && this.j == 1) {
            setResult(i);
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aca registerForActivityResult = registerForActivityResult(new acq(), this);
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity");
        this.j = 1;
        registerForActivityResult.b(intent);
    }
}
