package com.google.android.gms.home.matter.commissioning;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bngt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CommissioningRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bngt();
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
        return atyq.b(this.a, commissioningRequest.a) && atyq.b(this.b, commissioningRequest.b) && atyq.b(this.c, commissioningRequest.c) && atyq.b(this.d, commissioningRequest.d) && atyq.b(this.e, commissioningRequest.e) && atyq.b(this.f, commissioningRequest.f) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(commissioningRequest.g)) && atyq.b(this.h, commissioningRequest.h) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(commissioningRequest.i)) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(commissioningRequest.j)) && atyq.b(this.k, commissioningRequest.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Integer.valueOf(this.j), this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.I(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.o(parcel, 10, this.j);
        atzr.v(parcel, 11, this.k, false);
        atzr.c(parcel, a);
    }
}
