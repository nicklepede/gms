package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazd;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class OtpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazd();
    final int a;
    public final String b;
    public final AppDescription c;
    public final byte[] d;
    public final boolean e;

    public OtpRequest(int i, String str, AppDescription appDescription, byte[] bArr, boolean z) {
        this.a = i;
        this.b = str;
        this.d = bArr;
        arwm.t(appDescription, "Caller's app description cannot be null!");
        this.c = appDescription;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
