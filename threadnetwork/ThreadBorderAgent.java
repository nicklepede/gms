package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhrg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ThreadBorderAgent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhrg();
    private final byte[] a;

    public ThreadBorderAgent(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
    }

    public final byte[] a() {
        return (byte[]) this.a.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, a(), false);
        atzr.c(parcel, a);
    }
}
