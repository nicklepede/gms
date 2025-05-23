package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cykm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RegistrationInfo extends AbstractSafeParcelable {
    public final String c;
    public final int d;
    public final String[] e;
    public final byte[] f;
    public final boolean g;
    public final int[] h;
    public final String i;
    public final byte[] j;
    public final int k;
    public final int l;
    public static final int[] a = new int[0];
    public static final byte[] b = new byte[0];
    public static final Parcelable.Creator CREATOR = new cykm();

    public RegistrationInfo(String str, int i, String[] strArr, byte[] bArr, String str2, byte[] bArr2, int i2, int i3) {
        this.c = str;
        this.d = i;
        this.e = strArr;
        this.f = bArr;
        this.g = false;
        this.h = a;
        this.i = str2;
        this.j = bArr2;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegistrationInfo) {
            RegistrationInfo registrationInfo = (RegistrationInfo) obj;
            if (this.c.equals(registrationInfo.c) && this.d == registrationInfo.d && Arrays.equals(this.e, registrationInfo.e) && Arrays.equals(this.f, registrationInfo.f) && this.g == registrationInfo.g && Arrays.equals(this.h, registrationInfo.h) && this.i.equals(registrationInfo.i) && Arrays.equals(this.j, registrationInfo.j) && this.k == registrationInfo.k && this.l == registrationInfo.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g), this.h, this.i, this.j, Integer.valueOf(this.k), Integer.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.d);
        atzr.w(parcel, 3, this.e, false);
        atzr.i(parcel, 4, this.f, false);
        atzr.e(parcel, 5, this.g);
        atzr.p(parcel, 6, this.h, false);
        atzr.v(parcel, 7, this.i, false);
        atzr.i(parcel, 8, this.j, false);
        atzr.o(parcel, 9, this.k);
        atzr.o(parcel, 10, this.l);
        atzr.c(parcel, a2);
    }

    public RegistrationInfo(String str, int i, String[] strArr, byte[] bArr, boolean z, int[] iArr, String str2, byte[] bArr2, int i2, int i3) {
        this.c = str;
        this.d = i;
        this.e = strArr;
        this.f = bArr;
        this.g = z;
        this.h = iArr;
        this.i = str2;
        this.j = bArr2;
        this.k = i2;
        this.l = i3;
    }

    public RegistrationInfo(String str, int i, String[] strArr, byte[] bArr, boolean z, int[] iArr, String str2, byte[] bArr2) {
        this(str, i, strArr, bArr, z, iArr, str2, bArr2, 1, 0);
    }
}
