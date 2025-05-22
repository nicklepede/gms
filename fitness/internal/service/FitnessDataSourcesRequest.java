package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.binp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new binp();
    private final List a;

    public FitnessDataSourcesRequest(List list) {
        this.a = list;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataTypes", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, DesugarCollections.unmodifiableList(list), false);
        atzr.c(parcel, a);
    }
}
