package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglf;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PurgeDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglf();
    public final bgiw a;
    public final List b;

    public PurgeDataSourcesRequest(IBinder iBinder, List list) {
        bgiw bgiuVar;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.a = bgiuVar;
        this.b = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bgiw bgiwVar = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, bgiwVar.asBinder());
        arxc.x(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
