package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cgbs;
import defpackage.cged;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class UploadBatchesCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cged();
    public final List a;

    public UploadBatchesCriteria(List list) {
        this.a = list;
    }

    public static UploadBatchesCriteria a(cgbs... cgbsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cgbsVarArr[0].g));
        return new UploadBatchesCriteria(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.E(parcel, 1, this.a);
        atzr.c(parcel, a);
    }
}
