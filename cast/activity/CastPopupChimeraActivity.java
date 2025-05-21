package com.google.android.gms.cast.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;
import defpackage.amds;
import defpackage.amdt;
import defpackage.qfp;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastPopupChimeraActivity extends qfp {
    static final HashMap j;
    amdt k;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("consent", new amds() { // from class: amdg
            @Override // defpackage.amds
            public final amdt a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new amde(castPopupChimeraActivity);
            }
        });
        hashMap.put("com.google.android.gms.cast.activity.CAST_CONNECTION_NOTIFY", new amds() { // from class: amdh
            @Override // defpackage.amds
            public final amdt a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new amcx(castPopupChimeraActivity);
            }
        });
        hashMap.put("com.google.android.gms.cast.activity.CAST_TERMS_OF_SERVICE", new amds() { // from class: amdi
            @Override // defpackage.amds
            public final amdt a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new amdk(castPopupChimeraActivity);
            }
        });
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        amdt amdtVar = this.k;
        if (amdtVar != null) {
            amdtVar.q(i, i2, intent);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = null;
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("ACTIVITY_TYPE");
        if (stringExtra == null) {
            stringExtra = intent.getAction();
        }
        if (stringExtra != null) {
            HashMap hashMap = j;
            if (hashMap.containsKey(stringExtra)) {
                amdt a = ((amds) hashMap.get(stringExtra)).a(this);
                this.k = a;
                a.f(bundle);
            }
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        amdt amdtVar = this.k;
        if (amdtVar != null) {
            amdtVar.g();
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        amdt amdtVar = this.k;
        if (amdtVar != null) {
            amdtVar.h(intent);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        amdt amdtVar = this.k;
        if (amdtVar != null) {
            amdtVar.i();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        amdt amdtVar = this.k;
        if (amdtVar != null) {
            amdtVar.j();
        }
    }
}
