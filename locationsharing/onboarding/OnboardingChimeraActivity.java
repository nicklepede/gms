package com.google.android.gms.locationsharing.onboarding;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.asxe;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdao;
import defpackage.cdat;
import defpackage.cdaw;
import defpackage.cdbm;
import defpackage.eluo;
import defpackage.fspt;
import defpackage.jzw;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OnboardingChimeraActivity extends ryt {
    private static final ausn l = ausn.e(auid.LOCATION_SHARING);
    public cdat j;
    public String k;
    private final jzw m = new cdaw(this);

    private final void b() {
        setResult(-1);
        finish();
    }

    public final void a() {
        setResult(0);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            b();
        } else {
            a();
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        cdao x;
        cdat cdatVar = this.j;
        if (cdatVar != null && (x = cdatVar.x()) != null) {
            x.c(6);
        }
        super.onBackPressed();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(0);
        setContentView(R.layout.location_sharing_fragment_container);
        Intent intent = getIntent();
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null || intent.getAction() != null) {
            String packageName = callingActivity == null ? null : callingActivity.getPackageName();
            if (packageName != null && asxe.d(this).h(packageName)) {
                for (String str : fspt.a.lK().h().concat(",com.google.android.gms").split(",")) {
                    if (!str.equals(packageName)) {
                    }
                }
            }
            ((eluo) ((eluo) l.h()).ai((char) 5696)).x("Calling Activity is not whitelisted for Location Sharing settings.");
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
        cdat cdatVar = (cdat) getSupportFragmentManager().g(R.id.fragment_container);
        this.j = cdatVar;
        if (cdatVar == null) {
            getSupportLoaderManager().c(3, intent2.getExtras(), this.m);
            cdbm.b(this, R.string.common_loading, true);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        cdbm.a(this);
    }
}
