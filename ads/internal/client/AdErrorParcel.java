package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tbu;
import defpackage.tdh;
import defpackage.tdj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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

    public final tbu a() {
        tbu tbuVar;
        AdErrorParcel adErrorParcel = this.d;
        if (adErrorParcel == null) {
            tbuVar = null;
        } else {
            String str = adErrorParcel.c;
            tbuVar = new tbu(adErrorParcel.a, adErrorParcel.b, str);
        }
        return new tbu(this.a, this.b, this.c, tbuVar);
    }

    public final tdh b() {
        tbu tbuVar;
        bh bhVar;
        AdErrorParcel adErrorParcel = this.d;
        if (adErrorParcel == null) {
            tbuVar = null;
        } else {
            tbuVar = new tbu(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c);
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
        return new tdh(i, str, str2, tbuVar, bhVar != null ? new tdj(bhVar) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.D(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
