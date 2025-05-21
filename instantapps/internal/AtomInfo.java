package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bofh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AtomInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bofh();
    public final String a;
    public final String b;
    public final String[] c;
    public final int[] d;
    public final int e;
    public final byte[] f;
    public final boolean g;

    public AtomInfo(String str, String str2, String[] strArr, int[] iArr, int i, byte[] bArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = iArr;
        this.e = i;
        this.f = bArr;
        this.g = z;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AtomInfo) {
            AtomInfo atomInfo = (AtomInfo) obj;
            if (this.a.equals(atomInfo.a) && this.g == atomInfo.g && this.b.equals(atomInfo.b) && this.e == atomInfo.e && Arrays.equals(this.f, atomInfo.f) && Arrays.equals(this.c, atomInfo.c) && Arrays.equals(this.d, atomInfo.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((a(this.a) * 961) + a(Boolean.valueOf(this.g))) * 31) + a(this.b)) * 31) + a(Integer.valueOf(this.e))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 4, this.b, false);
        arxc.w(parcel, 5, this.c, false);
        arxc.o(parcel, 6, this.e);
        arxc.i(parcel, 7, this.f, false);
        arxc.p(parcel, 8, this.d, false);
        arxc.e(parcel, 9, this.g);
        arxc.c(parcel, a);
    }
}
