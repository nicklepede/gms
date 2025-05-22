package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ag implements com.google.android.gms.ads.nonagon.signals.c {
    private final Bundle a;

    public ag(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = this.a;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.ab.b(com.google.android.gms.ads.internal.util.ab.b((JSONObject) obj, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.u.b().e(bundle));
            } catch (JSONException unused) {
            }
        }
    }
}
