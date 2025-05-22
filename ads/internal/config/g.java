package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.w;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class g {
    public final int a;
    public final String b;
    private final Object c;
    private final Object d;

    public g(int i, String str, Object obj, Object obj2) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        w.a().a.add(this);
    }

    public static void j(String str, float f, float f2) {
        new e(str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static g k(String str, int i, int i2) {
        return new c(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static g l(String str, long j, long j2) {
        return new d(str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static void m() {
        w.a().b.add(new f("gads:sdk_core_constants:experiment_id", null, null));
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public abstract void e(SharedPreferences.Editor editor, String str);

    public abstract void f(JSONObject jSONObject, String str);

    public final Object g() {
        return w.b().a(this);
    }

    public final Object h() {
        return w.b().h ? this.d : this.c;
    }

    public final Object i() {
        n b = w.b();
        return (b.c || b.d) ? b.a(this) : h();
    }
}
