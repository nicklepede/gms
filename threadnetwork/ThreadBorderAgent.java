package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dffz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ThreadBorderAgent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dffz();
    private final byte[] a;

    public ThreadBorderAgent(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
    }

    public final byte[] a() {
        return (byte[]) this.a.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, a(), false);
        arxc.c(parcel, a);
    }
}
