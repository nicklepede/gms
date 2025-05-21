package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dipz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SecurePaymentsPayload extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dipz();
    public final byte[] a;
    public final SecurePaymentsData[] b;

    public SecurePaymentsPayload(byte[] bArr, SecurePaymentsData[] securePaymentsDataArr) {
        this.a = bArr;
        this.b = securePaymentsDataArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.J(parcel, 3, this.b, i);
        arxc.c(parcel, a);
    }
}
