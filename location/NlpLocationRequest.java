package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbro;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class NlpLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cbro();
    public final WorkSource a;

    public NlpLocationRequest(WorkSource workSource) {
        ekvl.y(workSource);
        this.a = workSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WorkSource workSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, workSource, i, false);
        atzr.c(parcel, a);
    }
}
