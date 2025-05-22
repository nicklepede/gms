package com.google.android.gms.ads.internal.js.function;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h {
    public static final Charset a = Charset.forName("UTF-8");
    public static final e b = new g();
    public static final c c = new c() { // from class: com.google.android.gms.ads.internal.js.function.f
        @Override // com.google.android.gms.ads.internal.js.function.c
        public final Object a(JSONObject jSONObject) {
            Charset charset = h.a;
            return new ByteArrayInputStream(jSONObject.toString().getBytes(h.a));
        }
    };
}
