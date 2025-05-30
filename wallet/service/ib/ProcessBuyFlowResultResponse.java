package com.google.android.gms.wallet.service.ib;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlkb;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ProcessBuyFlowResultResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dlkb();
    public final int a;
    public final int b;
    public final Intent c;
    public final boolean d;
    public final int e;

    public ProcessBuyFlowResultResponse(int i, int i2, int i3, Intent intent, boolean z) {
        this.a = i;
        this.b = i2;
        this.e = i3;
        this.c = intent;
        this.d = z;
    }

    @Override // defpackage.dlpo
    public final boolean a() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        int i2 = this.e;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeParcelable(this.c, i);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }
}
