package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.beww;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetFindMyDeviceSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new beww();
    public boolean a;
    public boolean b;
    public FindMyDeviceNetworkSettings c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public Account h;
    public boolean i;
    public int j;
    public Long k;
    public FindMyDeviceNetworkSettings l;

    public GetFindMyDeviceSettingsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFindMyDeviceSettingsResponse) {
            GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(getFindMyDeviceSettingsResponse.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(getFindMyDeviceSettingsResponse.b)) && atyq.b(this.c, getFindMyDeviceSettingsResponse.c) && atyq.b(Long.valueOf(this.d), Long.valueOf(getFindMyDeviceSettingsResponse.d)) && atyq.b(Long.valueOf(this.e), Long.valueOf(getFindMyDeviceSettingsResponse.e)) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(getFindMyDeviceSettingsResponse.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(getFindMyDeviceSettingsResponse.g)) && atyq.b(this.h, getFindMyDeviceSettingsResponse.h) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(getFindMyDeviceSettingsResponse.i)) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(getFindMyDeviceSettingsResponse.j)) && atyq.b(this.k, getFindMyDeviceSettingsResponse.k) && atyq.b(this.l, getFindMyDeviceSettingsResponse.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, Long.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Integer.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 5, this.d);
        atzr.e(parcel, 6, this.a);
        atzr.e(parcel, 7, this.b);
        atzr.e(parcel, 8, this.f);
        atzr.e(parcel, 9, this.g);
        atzr.t(parcel, 10, this.c, i, false);
        atzr.q(parcel, 11, this.e);
        atzr.t(parcel, 12, this.h, i, false);
        atzr.e(parcel, 13, this.i);
        atzr.o(parcel, 14, this.j);
        atzr.I(parcel, 15, this.k);
        atzr.t(parcel, 16, this.l, i, false);
        atzr.c(parcel, a);
    }

    public GetFindMyDeviceSettingsResponse(boolean z, boolean z2, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, long j, long j2, boolean z3, boolean z4, Account account, boolean z5, int i, Long l, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings2) {
        this.a = z;
        this.b = z2;
        this.c = findMyDeviceNetworkSettings;
        this.d = j;
        this.e = j2;
        this.f = z3;
        this.g = z4;
        this.h = account;
        this.i = z5;
        this.j = i;
        this.k = l;
        this.l = findMyDeviceNetworkSettings2;
    }
}
