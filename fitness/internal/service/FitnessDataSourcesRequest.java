package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.bgiz;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgiz();
    private final List a;

    public FitnessDataSourcesRequest(List list) {
        this.a = list;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataTypes", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, DesugarCollections.unmodifiableList(list), false);
        arxc.c(parcel, a);
    }
}
