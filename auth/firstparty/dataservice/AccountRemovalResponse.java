package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acxv;
import defpackage.adau;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountRemovalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acxv();
    final int a;
    final String b;

    public AccountRemovalResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final adau a() {
        return adau.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public AccountRemovalResponse(adau adauVar) {
        this.a = 1;
        atzb.s(adauVar);
        this.b = adauVar.ak;
    }
}
