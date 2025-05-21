package com.google.android.gms.auth.account.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.viu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AddCastCertificateToDeviceAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new viu();
    public final String a;
    public final byte[][] b;

    public AddCastCertificateToDeviceAccountRequest(String str, byte[][] bArr) {
        arwm.q(str);
        this.a = str;
        arwm.s(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.A(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
