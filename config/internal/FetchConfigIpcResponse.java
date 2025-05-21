package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.asua;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asua();
    public final int a;
    public final DataHolder b;
    public final long c;
    public final DataHolder d;

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, long j, DataHolder dataHolder2) {
        this.a = i;
        this.b = dataHolder;
        this.c = j;
        this.d = dataHolder2;
    }

    public final void a() {
        DataHolder dataHolder = this.b;
        if (dataHolder == null || dataHolder.g()) {
            return;
        }
        dataHolder.close();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.q(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, DataHolder dataHolder2) {
        this(i, dataHolder, -1L, dataHolder2);
    }
}
