package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bacj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PageDataMap implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bacj();
    private final SparseArray a = new SparseArray();

    public PageDataMap() {
    }

    public final PageData a(int i) {
        return (PageData) this.a.get(i);
    }

    public final void b(int i, PageData pageData) {
        this.a.put(i, pageData);
    }

    public final boolean c(int i) {
        return this.a.get(i) != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        parcel.writeInt(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            parcel.writeInt(keyAt);
            ((PageData) sparseArray.get(keyAt)).writeToParcel(parcel, i);
        }
    }

    public PageDataMap(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(parcel.readInt(), (PageData) PageData.CREATOR.createFromParcel(parcel));
        }
    }
}
