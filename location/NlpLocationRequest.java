package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bzix;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class NlpLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bzix();
    public final WorkSource a;

    public NlpLocationRequest(WorkSource workSource) {
        eiig.x(workSource);
        this.a = workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WorkSource workSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, workSource, i, false);
        arxc.c(parcel, a);
    }
}
