package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.affy;
import defpackage.afmu;
import defpackage.afrk;
import defpackage.arxc;
import defpackage.asej;
import defpackage.asot;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SafeMetricsContext extends AbstractSafeParcelable implements MetricsContext {
    public final int a;
    public final byte[] b;
    public final byte[] c;
    private final HashMap e = new HashMap();
    private final eite f;
    private final AtomicInteger g;
    private int h;
    private static final asot d = asot.b("SafeMetricsContext", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new affy();

    public SafeMetricsContext(int i, byte[] bArr, byte[] bArr2) {
        int i2 = eitj.d;
        this.f = new eite();
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
    public final afmu d() {
        try {
            byte[] bArr = this.b;
            fecp y = fecp.y(afmu.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y);
            return (afmu) y;
        } catch (fedk e) {
            ((ejhf) ((ejhf) d.j()).s(e)).x("Failed to parse app");
            return afmu.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final afrk e() {
        try {
            byte[] bArr = this.c;
            fecp y = fecp.y(afrk.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y);
            return (afrk) y;
        } catch (fedk e) {
            ((ejhf) ((ejhf) d.j()).s(e)).x("Failed to parse screen");
            return afrk.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final eitj f() {
        return this.f.g();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final synchronized void g(MetricsContext.FillContext fillContext) {
        this.f.i(fillContext);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
