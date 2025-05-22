package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgqp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class StartSessionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgqp();
    public String a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;
    public String j;
    public String k;
    public final boolean l;
    public final AuthenticatingUser m;

    public StartSessionRequest(int i, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, boolean z, AuthenticatingUser authenticatingUser) {
        this.b = i;
        this.c = str;
        this.d = 1;
        this.e = str2;
        this.f = bArr;
        this.g = bArr2;
        this.h = bArr3;
        this.i = i2;
        this.l = z;
        this.m = authenticatingUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartSessionRequest) {
            StartSessionRequest startSessionRequest = (StartSessionRequest) obj;
            if (atyq.b(this.a, startSessionRequest.a) && this.b == startSessionRequest.b && atyq.b(this.c, startSessionRequest.c) && this.d == startSessionRequest.d && atyq.b(this.e, startSessionRequest.e) && Arrays.equals(this.f, startSessionRequest.f) && Arrays.equals(this.g, startSessionRequest.g) && Arrays.equals(this.h, startSessionRequest.h) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(startSessionRequest.i)) && atyq.b(this.j, startSessionRequest.j) && atyq.b(this.k, startSessionRequest.k) && this.l == startSessionRequest.l && atyq.b(this.m, startSessionRequest.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, this.f, this.g, this.h, Integer.valueOf(this.i), this.j, this.k, Boolean.valueOf(this.l), this.m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.o(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.o(parcel, 5, this.d);
        atzr.v(parcel, 6, this.e, false);
        atzr.i(parcel, 7, this.f, false);
        atzr.i(parcel, 8, this.g, false);
        atzr.i(parcel, 9, this.h, false);
        atzr.o(parcel, 10, this.i);
        atzr.v(parcel, 11, this.j, false);
        atzr.v(parcel, 12, this.k, false);
        atzr.e(parcel, 13, this.l);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.c(parcel, a);
    }

    public StartSessionRequest(String str, int i, String str2, int i2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, String str4, String str5, boolean z, AuthenticatingUser authenticatingUser) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = bArr;
        this.g = bArr2;
        this.h = bArr3;
        this.i = i3;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = authenticatingUser;
    }
}
