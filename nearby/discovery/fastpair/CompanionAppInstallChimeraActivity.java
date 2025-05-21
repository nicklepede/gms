package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.toolbox.ImageRequest;
import defpackage.arut;
import defpackage.cgiv;
import defpackage.exdh;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class CompanionAppInstallChimeraActivity extends qfp {
    public static Intent a(Context context, String str) {
        return exdh.a(context, arut.b(str));
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        cgiv.a.f().E("FastPair: Received result %s for %s.", i2, i);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("intent");
        Intent intent2 = (Intent) getIntent().getParcelableExtra("bisto");
        if (intent != null) {
            cgiv.a.f().B("FastPair: Launching Play Store in overlay mode. %s", intent);
            startActivityForResult(intent, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        } else if (intent2 != null) {
            cgiv.a.d().B("FastPair: launching Bisto oobe. %s", intent2);
            startActivityForResult(intent2, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        finish();
    }
}
