package com.google.android.gms.trustlet.onbody.discovery;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SettingsSuggestionOnbodyPromotionChimeraActivity extends qfp implements abt {
    private int j = 0;

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (activityResult.b != null && this.j == 1) {
            setResult(i);
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abv registerForActivityResult = registerForActivityResult(new acl(), this);
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity");
        this.j = 1;
        registerForActivityResult.b(intent);
    }
}
