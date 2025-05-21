package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.tyj;
import defpackage.tyv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class SectionInfo implements ReflectedParcelable {
    public boolean p;

    public SectionInfo() {
    }

    public abstract tyv a(tyj tyjVar, int i);

    public tyv d(tyj tyjVar, int i) {
        return a(tyjVar, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p ? 1 : 0);
    }

    public SectionInfo(Parcel parcel) {
        this.p = parcel.readInt() != 0;
    }
}
