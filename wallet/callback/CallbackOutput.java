package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.dkvl;
import defpackage.dkvm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkvm();
    public int a;
    public int b;
    public byte[] c;
    public String d;

    private CallbackOutput() {
    }

    public static dkvl b() {
        return new dkvl(new CallbackOutput());
    }

    public final AbstractSafeParcelable a(Parcelable.Creator creator) {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return (AbstractSafeParcelable) atzs.a(bArr, creator);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public CallbackOutput(int i, int i2, byte[] bArr, String str) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = str;
    }
}
