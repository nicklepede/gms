package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.affx;
import defpackage.afqt;
import defpackage.afqu;
import defpackage.afra;
import defpackage.arxc;
import defpackage.asej;
import defpackage.asot;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SafeFillContext extends AbstractSafeParcelable implements MetricsContext.FillContext {
    public static final Parcelable.Creator CREATOR;
    private static final asot g = asot.b("SafeFillContext", asej.AUTOFILL);
    public final byte[] a;
    public final byte[][] b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        Charset charset = StandardCharsets.UTF_8;
        CREATOR = new affx();
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
    public final eiid a() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return eigb.a;
        }
        try {
            fecp y = fecp.y(afra.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y);
            return eiid.j((afra) y);
        } catch (fedk e) {
            ((ejhf) ((ejhf) g.j()).s(e)).x("Failed to parse form");
            return eigb.a;
        }
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final eiid b() {
        int i = this.c;
        return i == Integer.MIN_VALUE ? eigb.a : eiid.i(afqt.b(i));
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
    public final eitj c() {
        int i = eitj.d;
        eite eiteVar = new eite();
        for (byte[] bArr : this.b) {
            try {
                fecp y = fecp.y(afqu.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                eiteVar.i((afqu) y);
            } catch (fedk e) {
                ((ejhf) ((ejhf) g.j()).s(e)).x("Failed to parse dataset");
            }
        }
        return eiteVar.g();
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.A(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
