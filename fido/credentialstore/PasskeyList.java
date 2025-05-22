package com.google.android.gms.fido.credentialstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bdrt;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PasskeyList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdrt();
    public final byte[][] a;
    public final boolean[] b;

    public PasskeyList(byte[][] bArr, boolean[] zArr) {
        ekxj.a(bArr.length == zArr.length);
        this.a = bArr;
        this.b = zArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bdrt.a(this, parcel);
    }
}
