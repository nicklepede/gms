package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajin;
import defpackage.ajlq;
import defpackage.atzb;
import defpackage.atzr;
import java.io.Closeable;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ParcelableBackupDataInput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new ajlq();
    public final ParcelFileDescriptor a;

    public ParcelableBackupDataInput(ParcelFileDescriptor parcelFileDescriptor) {
        atzb.s(parcelFileDescriptor);
        this.a = parcelFileDescriptor;
    }

    public final List a() {
        return ajin.a(this.a);
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
        atzr.c(parcel, a);
    }
}
