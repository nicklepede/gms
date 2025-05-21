package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import defpackage.eijr;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    private JSONObject j = new JSONObject();
    public boolean h = false;
    public boolean i = false;

    public final Object a(final g gVar) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                if (!this.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.c || this.e == null || this.i) {
            synchronized (this.a) {
                if (this.c && this.e != null && !this.i) {
                }
                return gVar.h();
            }
        }
        if (gVar.a != 2) {
            return this.j.has(gVar.b) ? gVar.a(this.j) : r.a(new eijr() { // from class: com.google.android.gms.ads.internal.config.l
                @Override // defpackage.eijr
                public final Object a() {
                    return gVar.c(n.this.e);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? gVar.h() : gVar.b(bundle);
    }

    public final void b(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.j = new JSONObject((String) r.a(new eijr() { // from class: com.google.android.gms.ads.internal.config.k
                    @Override // defpackage.eijr
                    public final Object a() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b(sharedPreferences);
        }
    }
}
