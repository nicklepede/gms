package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlbr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SaveInstrumentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlbr();
    public byte[] a;

    public SaveInstrumentResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.c(parcel, a);
    }

    public SaveInstrumentResponse(byte[] bArr) {
        this.a = bArr;
    }
}
