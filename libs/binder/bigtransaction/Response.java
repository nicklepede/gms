package com.google.android.gms.libs.binder.bigtransaction;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bsvx;
import defpackage.fxxm;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class Response extends AbstractSafeParcelable implements AutoCloseable {
    public static final Parcelable.Creator CREATOR = new bsvx();
    public final int a;
    public final byte[] b;
    public final ParcelFileDescriptor c;

    public Response(int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = bArr;
        this.c = parcelFileDescriptor;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.c;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
