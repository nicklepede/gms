package com.google.android.gms.appsearch.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ugg;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PropertyParcel extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ugg();
    public final String a;
    public final String[] b;
    public final long[] c;
    public final double[] d;
    public final boolean[] e;
    public final byte[][] f;
    public final GenericDocumentParcel[] g;
    private Integer h;

    public PropertyParcel(String str, String[] strArr, long[] jArr, double[] dArr, boolean[] zArr, byte[][] bArr, GenericDocumentParcel[] genericDocumentParcelArr) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = strArr;
        this.c = jArr;
        this.d = dArr;
        this.e = zArr;
        this.f = bArr;
        this.g = genericDocumentParcelArr;
        int i = strArr != null ? 1 : 0;
        i = jArr != null ? i + 1 : i;
        i = dArr != null ? i + 1 : i;
        i = zArr != null ? i + 1 : i;
        i = bArr != null ? i + 1 : i;
        i = genericDocumentParcelArr != null ? i + 1 : i;
        if (i == 0 || i > 1) {
            throw new IllegalArgumentException("One and only one type array can be set in PropertyParcel");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyParcel)) {
            return false;
        }
        PropertyParcel propertyParcel = (PropertyParcel) obj;
        return this.a.equals(propertyParcel.a) && Arrays.equals(this.b, propertyParcel.b) && Arrays.equals(this.c, propertyParcel.c) && Arrays.equals(this.d, propertyParcel.d) && Arrays.equals(this.e, propertyParcel.e) && Arrays.deepEquals(this.f, propertyParcel.f) && Arrays.equals(this.g, propertyParcel.g);
    }

    public final int hashCode() {
        int hashCode;
        if (this.h == null) {
            String[] strArr = this.b;
            if (strArr != null) {
                hashCode = Arrays.hashCode(strArr);
            } else {
                long[] jArr = this.c;
                if (jArr != null) {
                    hashCode = Arrays.hashCode(jArr);
                } else {
                    double[] dArr = this.d;
                    if (dArr != null) {
                        hashCode = Arrays.hashCode(dArr);
                    } else {
                        boolean[] zArr = this.e;
                        if (zArr != null) {
                            hashCode = Arrays.hashCode(zArr);
                        } else {
                            byte[][] bArr = this.f;
                            if (bArr != null) {
                                hashCode = Arrays.deepHashCode(bArr);
                            } else {
                                GenericDocumentParcel[] genericDocumentParcelArr = this.g;
                                hashCode = genericDocumentParcelArr != null ? Arrays.hashCode(genericDocumentParcelArr) : 0;
                            }
                        }
                    }
                }
            }
            this.h = Integer.valueOf(Objects.hash(this.a, Integer.valueOf(hashCode)));
        }
        return this.h.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.r(parcel, 3, this.c, false);
        arxc.k(parcel, 4, this.d, false);
        arxc.f(parcel, 5, this.e, false);
        arxc.A(parcel, 6, this.f);
        arxc.J(parcel, 7, this.g, i);
        arxc.c(parcel, a);
    }
}
