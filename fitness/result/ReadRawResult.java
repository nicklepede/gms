package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.bgmj;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ReadRawResult extends AbstractSafeParcelable implements Closeable, aqyf {
    public static final Parcelable.Creator CREATOR = new bgmj();
    public final DataHolder a;

    public ReadRawResult(DataHolder dataHolder) {
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
        arxc.y(parcel, 2, null, false);
        arxc.c(parcel, a);
    }

    public ReadRawResult(DataHolder dataHolder, List list) {
        this.a = dataHolder;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((DataHolder) it.next()).close();
            }
        }
    }
}
