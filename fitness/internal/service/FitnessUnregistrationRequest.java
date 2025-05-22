package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.atzr;
import defpackage.binq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new binq();
    public final DataSource a;

    public FitnessUnregistrationRequest(DataSource dataSource) {
        this.a = dataSource;
    }

    public final String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.c(parcel, a);
    }
}
