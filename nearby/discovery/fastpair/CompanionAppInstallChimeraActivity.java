package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.toolbox.ImageRequest;
import defpackage.atxi;
import defpackage.ciqy;
import defpackage.ezrq;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class CompanionAppInstallChimeraActivity extends ryt {
    public static Intent a(Context context, String str) {
        return ezrq.a(context, atxi.b(str));
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ciqy.a.f().E("FastPair: Received result %s for %s.", i2, i);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("intent");
        Intent intent2 = (Intent) getIntent().getParcelableExtra("bisto");
        if (intent != null) {
            ciqy.a.f().B("FastPair: Launching Play Store in overlay mode. %s", intent);
            startActivityForResult(intent, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        } else if (intent2 != null) {
            ciqy.a.d().B("FastPair: launching Bisto oobe. %s", intent2);
            startActivityForResult(intent2, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        finish();
    }
}
