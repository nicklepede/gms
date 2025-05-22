package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.whs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TokenReceiver$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new whs();
    public final Encoding[] a;

    public TokenReceiver$Params(Encoding[] encodingArr) {
        this.a = encodingArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Encoding[] encodingArr = this.a;
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, encodingArr, i);
        atzr.c(parcel, a);
    }
}
