package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlbk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SecurePaymentsPayload extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dlbk();
    public final byte[] a;
    public final SecurePaymentsData[] b;

    public SecurePaymentsPayload(byte[] bArr, SecurePaymentsData[] securePaymentsDataArr) {
        this.a = bArr;
        this.b = securePaymentsDataArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.J(parcel, 3, this.b, i);
        atzr.c(parcel, a);
    }
}
