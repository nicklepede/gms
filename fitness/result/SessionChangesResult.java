package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.bgmk;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionChangesResult extends AbstractSafeParcelable implements Closeable, aqyf {
    public static final Parcelable.Creator CREATOR = new bgmk();
    public final DataHolder a;

    public SessionChangesResult(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.aqyf
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataHolder, i, false);
        arxc.c(parcel, a);
    }
}
