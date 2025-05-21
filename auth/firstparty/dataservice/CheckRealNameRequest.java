package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxz;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CheckRealNameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxz();
    final int a;
    public AppDescription b;
    public String c;
    public String d;

    public CheckRealNameRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public CheckRealNameRequest(int i, AppDescription appDescription, String str, String str2) {
        this.a = i;
        this.b = appDescription;
        this.c = str;
        this.d = str2;
    }
}
