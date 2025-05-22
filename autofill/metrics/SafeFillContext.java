package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgj;
import defpackage.ahrf;
import defpackage.ahrg;
import defpackage.ahrm;
import defpackage.atzr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SafeFillContext extends AbstractSafeParcelable implements MetricsContext.FillContext {
    public static final Parcelable.Creator CREATOR;
    private static final ausn g = ausn.b("SafeFillContext", auid.AUTOFILL);
    public final byte[] a;
    public final byte[][] b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        Charset charset = StandardCharsets.UTF_8;
        CREATOR = new ahgj();
    }

    public SafeFillContext(byte[] bArr, byte[][] bArr2, int i, boolean z, boolean z2, boolean z3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final ekvi a() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return ektg.a;
        }
        try {
            fgri y = fgri.y(ahrm.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            return ekvi.j((ahrm) y);
        } catch (fgsd e) {
            ((eluo) ((eluo) g.j()).s(e)).x("Failed to parse form");
            return ektg.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final ekvi b() {
        int i = this.c;
        return i == Integer.MIN_VALUE ? ektg.a : ekvi.i(ahrf.b(i));
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final elgo c() {
        int i = elgo.d;
        elgj elgjVar = new elgj();
        for (byte[] bArr : this.b) {
            try {
                fgri y = fgri.y(ahrg.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                elgjVar.i((ahrg) y);
            } catch (fgsd e) {
                ((eluo) ((eluo) g.j()).s(e)).x("Failed to parse dataset");
            }
        }
        return elgjVar.g();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final boolean e() {
        return this.f;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final boolean f() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.A(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
