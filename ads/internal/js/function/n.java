package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n {
    final /* synthetic */ o a;
    private final ab b;
    private final com.google.android.gms.ads.internal.util.future.i c;

    public n(o oVar, ab abVar, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = oVar;
        this.b = abVar;
        this.c = iVar;
    }

    public final void a(String str) {
        try {
            if (str == null) {
                this.c.c(new a());
            } else {
                this.c.c(new a(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
        this.b.a();
    }

    public final void b(JSONObject jSONObject) {
        try {
            try {
                this.c.a(this.a.a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.c.c(e);
            }
        } finally {
            this.b.a();
        }
    }
}
