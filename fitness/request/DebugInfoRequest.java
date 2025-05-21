package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgho;
import defpackage.bgkx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DebugInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkx();
    public final bgho a;

    public DebugInfoRequest(IBinder iBinder) {
        bgho bghoVar;
        if (iBinder == null) {
            bghoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDebugInfoCallback");
            bghoVar = queryLocalInterface instanceof bgho ? (bgho) queryLocalInterface : new bgho(iBinder);
        }
        this.a = bghoVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }
}
