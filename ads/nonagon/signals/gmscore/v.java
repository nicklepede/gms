package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ensj;
import defpackage.enss;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class v implements com.google.android.gms.ads.nonagon.signals.e {
    public final JSONObject a;

    public v(Context context) {
        this.a = com.google.android.gms.ads.internal.request.l.a(context, new VersionInfoParcel(251661004, 251661004));
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(47);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final enss b() {
        return ((Boolean) com.google.android.gms.ads.internal.config.p.bS.g()).booleanValue() ? ensj.i(new com.google.android.gms.ads.nonagon.signals.c() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.t
            @Override // com.google.android.gms.ads.nonagon.signals.c
            public final void a(Object obj) {
            }
        }) : ensj.i(new com.google.android.gms.ads.nonagon.signals.c() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.u
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
