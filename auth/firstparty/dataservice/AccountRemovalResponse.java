package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxv;
import defpackage.abau;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountRemovalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxv();
    final int a;
    final String b;

    public AccountRemovalResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final abau a() {
        return abau.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public AccountRemovalResponse(abau abauVar) {
        this.a = 1;
        arwm.s(abauVar);
        this.b = abauVar.ak;
    }
}
