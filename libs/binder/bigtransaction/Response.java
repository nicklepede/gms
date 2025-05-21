package com.google.android.gms.libs.binder.bigtransaction;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqoh;
import defpackage.fvbo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class Response extends AbstractSafeParcelable implements AutoCloseable {
    public static final Parcelable.Creator CREATOR = new bqoh();
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
        fvbo.f(parcel, "dest");
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
