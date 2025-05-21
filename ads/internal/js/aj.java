package com.google.android.gms.ads.internal.js;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class aj implements c, ai {
    public final ai a;
    public final HashSet b = new HashSet();

    public aj(ai aiVar) {
        this.a = aiVar;
    }

    @Override // com.google.android.gms.ads.internal.js.a
    public final /* synthetic */ void b(String str, JSONObject jSONObject) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.js.c
    public final /* synthetic */ void c(String str, String str2) {
        b.a(this, str, str2);
    }

    @Override // com.google.android.gms.ads.internal.js.l
    public final /* synthetic */ void e(String str, JSONObject jSONObject) {
        b.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.js.c, com.google.android.gms.ads.internal.js.l
    public final void fW(String str) {
        this.a.fW(str);
    }

    @Override // com.google.android.gms.ads.internal.js.ai
    public final void g(String str, com.google.android.gms.ads.internal.gmsg.e eVar) {
        throw null;
    }
}
