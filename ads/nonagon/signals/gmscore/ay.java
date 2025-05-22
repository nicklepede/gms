package com.google.android.gms.ads.nonagon.signals.gmscore;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ay implements com.google.android.gms.ads.nonagon.signals.c {
    private final Map a;

    public ay(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.u.b().f(this.a));
        } catch (JSONException e) {
            e.getMessage();
        }
    }
}
