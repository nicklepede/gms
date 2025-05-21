package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ult;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class TokenReceiver$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ult();
    public final Encoding[] a;

    public TokenReceiver$Params(Encoding[] encodingArr) {
        this.a = encodingArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Encoding[] encodingArr = this.a;
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, encodingArr, i);
        arxc.c(parcel, a);
    }
}
