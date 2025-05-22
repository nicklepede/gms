package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajin;
import defpackage.ajio;
import defpackage.ajlr;
import defpackage.atzb;
import defpackage.atzr;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ParcelableBackupDataOutput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new ajlr();
    public final ParcelFileDescriptor a;
    public final int b;

    public ParcelableBackupDataOutput(ParcelFileDescriptor parcelFileDescriptor, int i) {
        atzb.s(parcelFileDescriptor);
        this.a = parcelFileDescriptor;
        this.b = i;
    }

    public final void a(ajio ajioVar) {
        ajin.b(ajioVar, this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, parcelFileDescriptor, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
