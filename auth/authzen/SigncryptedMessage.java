package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zsr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SigncryptedMessage extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zsr();
    final int a;
    public final byte[] b;

    public SigncryptedMessage(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.b;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.o(parcel, 10000, this.a);
        arxc.c(parcel, a);
    }

    public SigncryptedMessage(byte[] bArr) {
        this(1, bArr);
    }
}
