package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.biqq;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourceChangesResult extends AbstractSafeParcelable implements Closeable, atau {
    public static final Parcelable.Creator CREATOR = new biqq();
    public final DataHolder a;

    public DataSourceChangesResult(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.atau
    public final Status a() {
        return new Status(this.a.f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataHolder dataHolder = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataHolder, i, false);
        atzr.c(parcel, a);
    }
}
