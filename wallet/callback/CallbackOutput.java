package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.dikb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dikb();
    public int a;
    public int b;
    byte[] c;
    public String d;

    public CallbackOutput() {
    }

    public final AbstractSafeParcelable a(Parcelable.Creator creator) {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return (AbstractSafeParcelable) arxd.a(bArr, creator);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public CallbackOutput(int i, int i2, byte[] bArr, String str) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = str;
    }
}
