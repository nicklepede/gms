package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dijn;
import defpackage.enii;
import defpackage.fgrc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dijn();
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

    public final enii a() {
        fgrc v = enii.a.v();
        int i = this.a;
        if (i != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar = (enii) v.b;
            eniiVar.b |= 1;
            eniiVar.c = i;
        }
        int i2 = this.b;
        if (i2 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar2 = (enii) v.b;
            eniiVar2.b |= 2;
            eniiVar2.d = i2;
        }
        int i3 = this.c;
        if (i3 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar3 = (enii) v.b;
            eniiVar3.b |= 4;
            eniiVar3.e = i3;
        }
        int i4 = this.d;
        if (i4 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar4 = (enii) v.b;
            eniiVar4.b |= 8;
            eniiVar4.f = i4;
        }
        int i5 = this.e;
        if (i5 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar5 = (enii) v.b;
            eniiVar5.b |= 16;
            eniiVar5.g = i5;
        }
        int i6 = this.f;
        if (i6 != -9999) {
            if (!v.b.L()) {
                v.U();
            }
            enii eniiVar6 = (enii) v.b;
            eniiVar6.b |= 32;
            eniiVar6.h = i6;
        }
        return (enii) v.Q();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
