package com.google.android.gms.home.matter.commissioning;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.blac;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CommissioningRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blac();
    public final Account a;
    public final String b;
    public final DeviceInfo c;
    public final String d;
    public final String e;
    public final ComponentName f;
    public final boolean g;
    public final Long h;
    public final boolean i;
    public final int j;
    public final String k;

    public CommissioningRequest(Account account, String str, DeviceInfo deviceInfo, String str2, String str3, ComponentName componentName, boolean z, Long l, boolean z2, int i, String str4) {
        this.a = account;
        this.b = str;
        this.c = deviceInfo;
        this.d = str2;
        this.e = str3;
        this.f = componentName;
        this.g = z;
        this.h = l;
        this.i = z2;
        this.j = i;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissioningRequest)) {
            return false;
        }
        CommissioningRequest commissioningRequest = (CommissioningRequest) obj;
        return arwb.b(this.a, commissioningRequest.a) && arwb.b(this.b, commissioningRequest.b) && arwb.b(this.c, commissioningRequest.c) && arwb.b(this.d, commissioningRequest.d) && arwb.b(this.e, commissioningRequest.e) && arwb.b(this.f, commissioningRequest.f) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(commissioningRequest.g)) && arwb.b(this.h, commissioningRequest.h) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(commissioningRequest.i)) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(commissioningRequest.j)) && arwb.b(this.k, commissioningRequest.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Integer.valueOf(this.j), this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, account, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.I(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.o(parcel, 10, this.j);
        arxc.v(parcel, 11, this.k, false);
        arxc.c(parcel, a);
    }
}
