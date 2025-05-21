package com.google.android.gms.fido.credentialstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bboc;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PasskeyList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bboc();
    public final byte[][] a;
    public final boolean[] b;

    public PasskeyList(byte[][] bArr, boolean[] zArr) {
        eike.a(bArr.length == zArr.length);
        this.a = bArr;
        this.b = zArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bboc.a(this, parcel);
    }
}
