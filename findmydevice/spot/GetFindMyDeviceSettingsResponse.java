package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetFindMyDeviceSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvk();
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

    public GetFindMyDeviceSettingsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFindMyDeviceSettingsResponse) {
            GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(getFindMyDeviceSettingsResponse.a)) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(getFindMyDeviceSettingsResponse.b)) && arwb.b(this.c, getFindMyDeviceSettingsResponse.c) && arwb.b(Long.valueOf(this.d), Long.valueOf(getFindMyDeviceSettingsResponse.d)) && arwb.b(Long.valueOf(this.e), Long.valueOf(getFindMyDeviceSettingsResponse.e)) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(getFindMyDeviceSettingsResponse.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(getFindMyDeviceSettingsResponse.g)) && arwb.b(this.h, getFindMyDeviceSettingsResponse.h) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(getFindMyDeviceSettingsResponse.i)) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(getFindMyDeviceSettingsResponse.j)) && arwb.b(this.k, getFindMyDeviceSettingsResponse.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, Long.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Integer.valueOf(this.j), this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 5, this.d);
        arxc.e(parcel, 6, this.a);
        arxc.e(parcel, 7, this.b);
        arxc.e(parcel, 8, this.f);
        arxc.e(parcel, 9, this.g);
        arxc.t(parcel, 10, this.c, i, false);
        arxc.q(parcel, 11, this.e);
        arxc.t(parcel, 12, this.h, i, false);
        arxc.e(parcel, 13, this.i);
        arxc.o(parcel, 14, this.j);
        arxc.I(parcel, 15, this.k);
        arxc.c(parcel, a);
    }

    public GetFindMyDeviceSettingsResponse(boolean z, boolean z2, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, long j, long j2, boolean z3, boolean z4, Account account, boolean z5, int i, Long l) {
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
    }
}
