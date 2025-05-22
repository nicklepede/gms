package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgk;
import defpackage.ahng;
import defpackage.ahrw;
import defpackage.atzr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SafeMetricsContext extends AbstractSafeParcelable implements MetricsContext {
    public final int a;
    public final byte[] b;
    public final byte[] c;
    private final HashMap e = new HashMap();
    private final elgj f;
    private final AtomicInteger g;
    private int h;
    private static final ausn d = ausn.b("SafeMetricsContext", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new ahgk();

    public SafeMetricsContext(int i, byte[] bArr, byte[] bArr2) {
        int i2 = elgo.d;
        this.f = new elgj();
        this.g = new AtomicInteger(1);
        this.h = 1;
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final synchronized int a(AutofillId autofillId) {
        HashMap hashMap;
        hashMap = this.e;
        if (!hashMap.containsKey(autofillId)) {
            int i = this.h;
            this.h = i + 1;
            hashMap.put(autofillId, Integer.valueOf(i));
        }
        return ((Integer) hashMap.get(autofillId)).intValue();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final int b() {
        return this.g.getAndIncrement();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final ahng d() {
        try {
            byte[] bArr = this.b;
            fgri y = fgri.y(ahng.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            return (ahng) y;
        } catch (fgsd e) {
            ((eluo) ((eluo) d.j()).s(e)).x("Failed to parse app");
            return ahng.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final ahrw e() {
        try {
            byte[] bArr = this.c;
            fgri y = fgri.y(ahrw.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            return (ahrw) y;
        } catch (fgsd e) {
            ((eluo) ((eluo) d.j()).s(e)).x("Failed to parse screen");
            return ahrw.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final elgo f() {
        return this.f.g();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final synchronized void g(MetricsContext.FillContext fillContext) {
        this.f.i(fillContext);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
