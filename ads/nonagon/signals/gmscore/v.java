package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.eqgc;
import defpackage.eqgl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class v implements com.google.android.gms.ads.nonagon.signals.e {
    public final JSONObject a;

    public v(Context context) {
        this.a = com.google.android.gms.ads.internal.request.l.a(context, new VersionInfoParcel(251864004, 251864004));
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(47);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        return ((Boolean) com.google.android.gms.ads.internal.config.p.bT.g()).booleanValue() ? eqgc.i(new com.google.android.gms.ads.nonagon.signals.c() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.t
            @Override // com.google.android.gms.ads.nonagon.signals.c
            public final void a(Object obj) {
            }
        }) : eqgc.i(new com.google.android.gms.ads.nonagon.signals.c() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.u
            @Override // com.google.android.gms.ads.nonagon.signals.c
            public final void a(Object obj) {
                try {
                    ((JSONObject) obj).put("gms_sdk_env", v.this.a);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
