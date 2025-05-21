package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfyi;
import defpackage.ekuw;
import defpackage.fecj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfyi();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ConnectionState(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final ekuw a() {
        fecj v = ekuw.a.v();
        int i = this.a;
        if (i != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar = (ekuw) v.b;
            ekuwVar.b |= 1;
            ekuwVar.c = i;
        }
        int i2 = this.b;
        if (i2 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar2 = (ekuw) v.b;
            ekuwVar2.b |= 2;
            ekuwVar2.d = i2;
        }
        int i3 = this.c;
        if (i3 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar3 = (ekuw) v.b;
            ekuwVar3.b |= 4;
            ekuwVar3.e = i3;
        }
        int i4 = this.d;
        if (i4 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar4 = (ekuw) v.b;
            ekuwVar4.b |= 8;
            ekuwVar4.f = i4;
        }
        int i5 = this.e;
        if (i5 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar5 = (ekuw) v.b;
            ekuwVar5.b |= 16;
            ekuwVar5.g = i5;
        }
        int i6 = this.f;
        if (i6 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            ekuw ekuwVar6 = (ekuw) v.b;
            ekuwVar6.b |= 32;
            ekuwVar6.h = i6;
        }
        return (ekuw) v.Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionState) {
            ConnectionState connectionState = (ConnectionState) obj;
            if (this.a == connectionState.a && this.b == connectionState.b && this.c == connectionState.c && this.d == connectionState.d && this.e == connectionState.e && this.f == connectionState.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "{dataState=" + this.a + ", dataNetworkType=" + this.b + ", invocationDataNetworkType=" + this.c + ", voiceNetworkType=" + this.d + ", serviceState=" + this.e + ", signalStrengthLevel=" + this.f + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
