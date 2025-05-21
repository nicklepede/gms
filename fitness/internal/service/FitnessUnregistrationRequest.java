package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import defpackage.arxc;
import defpackage.bgja;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgja();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.c(parcel, a);
    }
}
