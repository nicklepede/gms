package com.google.android.gms.cast.activity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;
import defpackage.aofd;
import defpackage.aofe;
import defpackage.ryt;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastPopupChimeraActivity extends ryt {
    static final HashMap j;
    aofe k;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("consent", new aofd() { // from class: aoer
            @Override // defpackage.aofd
            public final aofe a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new aoep(castPopupChimeraActivity);
            }
        });
        hashMap.put("com.google.android.gms.cast.activity.CAST_CONNECTION_NOTIFY", new aofd() { // from class: aoes
            @Override // defpackage.aofd
            public final aofe a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new aoei(castPopupChimeraActivity);
            }
        });
        hashMap.put("com.google.android.gms.cast.activity.CAST_TERMS_OF_SERVICE", new aofd() { // from class: aoet
            @Override // defpackage.aofd
            public final aofe a(CastPopupChimeraActivity castPopupChimeraActivity) {
                return new aoev(castPopupChimeraActivity);
            }
        });
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        aofe aofeVar = this.k;
        if (aofeVar != null) {
            aofeVar.q(i, i2, intent);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
                aofe a = ((aofd) hashMap.get(stringExtra)).a(this);
                this.k = a;
                a.g(bundle);
            }
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        aofe aofeVar = this.k;
        if (aofeVar != null) {
            aofeVar.h();
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        aofe aofeVar = this.k;
        if (aofeVar != null) {
            aofeVar.i(intent);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        aofe aofeVar = this.k;
        if (aofeVar != null) {
            aofeVar.j();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        aofe aofeVar = this.k;
        if (aofeVar != null) {
            aofeVar.k();
        }
    }
}
