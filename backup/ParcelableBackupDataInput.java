package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahhx;
import defpackage.ahla;
import defpackage.arwm;
import defpackage.arxc;
import java.io.Closeable;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ParcelableBackupDataInput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new ahla();
    public final ParcelFileDescriptor a;

    public ParcelableBackupDataInput(ParcelFileDescriptor parcelFileDescriptor) {
        arwm.s(parcelFileDescriptor);
        this.a = parcelFileDescriptor;
    }

    public final List a() {
        return ahhx.a(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, parcelFileDescriptor, i, false);
        arxc.c(parcel, a);
    }
}
