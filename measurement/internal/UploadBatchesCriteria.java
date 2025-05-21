package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cdsu;
import defpackage.cdvf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UploadBatchesCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdvf();
    public final List a;

    public UploadBatchesCriteria(List list) {
        this.a = list;
    }

    public static UploadBatchesCriteria a(cdsu... cdsuVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cdsuVarArr[0].g));
        return new UploadBatchesCriteria(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.E(parcel, 1, this.a);
        arxc.c(parcel, a);
    }
}
