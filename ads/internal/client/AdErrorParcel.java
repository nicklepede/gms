package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.uxu;
import defpackage.uzh;
import defpackage.uzj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdErrorParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public final int a;
    public final String b;
    public final String c;
    public final AdErrorParcel d;
    public final IBinder e;

    public AdErrorParcel(int i, String str, String str2, AdErrorParcel adErrorParcel, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = adErrorParcel;
        this.e = iBinder;
    }

    public final uxu a() {
        uxu uxuVar;
        AdErrorParcel adErrorParcel = this.d;
        if (adErrorParcel == null) {
            uxuVar = null;
        } else {
            String str = adErrorParcel.c;
            uxuVar = new uxu(adErrorParcel.a, adErrorParcel.b, str);
        }
        return new uxu(this.a, this.b, this.c, uxuVar);
    }

    public final uzh b() {
        uxu uxuVar;
        bh bhVar;
        AdErrorParcel adErrorParcel = this.d;
        if (adErrorParcel == null) {
            uxuVar = null;
        } else {
            uxuVar = new uxu(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c);
        }
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            bhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            bhVar = queryLocalInterface instanceof bh ? (bh) queryLocalInterface : new bh(iBinder);
        }
        return new uzh(i, str, str2, uxuVar, bhVar != null ? new uzj(bhVar) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.D(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
