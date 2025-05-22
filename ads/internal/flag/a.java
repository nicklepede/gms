package com.google.android.gms.ads.internal.flag;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a {
    private final String a;
    private final Object b;
    private final int c;

    public a(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static a a(String str, double d) {
        return new a(str, Double.valueOf(d), 3);
    }

    public static a b(String str, long j) {
        return new a(str, Long.valueOf(j), 2);
    }

    public static a c(String str, boolean z) {
        return new a(str, Boolean.valueOf(z), 1);
    }

    public final Object d() {
        com.google.android.gms.ads.internal.config.m mVar = (com.google.android.gms.ads.internal.config.m) y.a.get();
        if (mVar == null) {
            if (y.a() != null) {
                y.a().a();
            }
            return this.b;
        }
        int i = this.c - 1;
        if (i == 0) {
            String str = this.a;
            boolean booleanValue = ((Boolean) this.b).booleanValue();
            try {
                return Boolean.valueOf(mVar.a.getBoolean(str, booleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(mVar.a.getString(str, String.valueOf(booleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(mVar.a.getLong(this.a, ((Long) this.b).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(mVar.a.getInt(r1, (int) r2));
            }
        }
        if (i != 2) {
            return mVar.a.getString(this.a, (String) this.b);
        }
        try {
            return Double.valueOf(mVar.a.getFloat(r1, (float) r2));
        } catch (ClassCastException unused3) {
            return Double.valueOf(mVar.a.getString(this.a, String.valueOf(((Double) this.b).doubleValue())));
        }
    }
}
