package com.google.android.gms.locationsharing.onboarding;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.aqup;
import defpackage.asej;
import defpackage.asot;
import defpackage.cary;
import defpackage.casd;
import defpackage.casg;
import defpackage.casw;
import defpackage.ejhf;
import defpackage.fpwa;
import defpackage.jth;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OnboardingChimeraActivity extends qfp {
    private static final asot l = asot.e(asej.LOCATION_SHARING);
    public casd j;
    public String k;
    private final jth m = new casg(this);

    private final void b() {
        setResult(-1);
        finish();
    }

    public final void a() {
        setResult(0);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            b();
        } else {
            a();
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        cary x;
        casd casdVar = this.j;
        if (casdVar != null && (x = casdVar.x()) != null) {
            x.c(6);
        }
        super.onBackPressed();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        setContentView(R.layout.location_sharing_fragment_container);
        Intent intent = getIntent();
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null || intent.getAction() != null) {
            String packageName = callingActivity == null ? null : callingActivity.getPackageName();
            if (packageName != null && aqup.d(this).h(packageName)) {
                for (String str : String.valueOf(fpwa.a.a().h()).concat(",com.google.android.gms").split(",")) {
                    if (!str.equals(packageName)) {
                    }
                }
            }
            ((ejhf) ((ejhf) l.h()).ah((char) 5682)).x("Calling Activity is not whitelisted for Location Sharing settings.");
            finish();
            return;
        }
        Intent intent2 = getIntent();
        boolean booleanExtra = intent2.getBooleanExtra("has_signed_tos", true);
        boolean booleanExtra2 = intent2.getBooleanExtra("is_location_history_enabled", true);
        String stringExtra = intent2.getStringExtra("account_name");
        this.k = stringExtra;
        if (stringExtra == null) {
            finish();
            return;
        }
        if (booleanExtra && booleanExtra2) {
            b();
            return;
        }
        setTitle(R.string.location_sharing_tos_activity_title);
        casd casdVar = (casd) getSupportFragmentManager().g(R.id.fragment_container);
        this.j = casdVar;
        if (casdVar == null) {
            getSupportLoaderManager().c(3, intent2.getExtras(), this.m);
            casw.b(this, R.string.common_loading, true);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        casw.a(this);
    }
}
