package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clld;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ParcelableFileWithMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clld();
    public byte[] a;
    public ParcelFileDescriptor b;

    public ParcelableFileWithMetaData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableFileWithMetaData) {
            ParcelableFileWithMetaData parcelableFileWithMetaData = (ParcelableFileWithMetaData) obj;
            if (Arrays.equals(this.a, parcelableFileWithMetaData.a) && atyq.b(this.b, parcelableFileWithMetaData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public ParcelableFileWithMetaData(byte[] bArr, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = bArr;
        this.b = parcelFileDescriptor;
    }
}
