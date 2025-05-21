package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (arxb.d(readInt) != 2) {
                arxb.C(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) arxb.m(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        arxb.A(parcel, h);
        return new LargeParcelTeleporter(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LargeParcelTeleporter[i];
    }
}
