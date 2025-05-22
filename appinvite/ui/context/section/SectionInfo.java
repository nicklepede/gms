package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.vui;
import defpackage.vuu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class SectionInfo implements ReflectedParcelable {
    public boolean p;

    public SectionInfo() {
    }

    public abstract vuu a(vui vuiVar, int i);

    public vuu d(vui vuiVar, int i) {
        return a(vuiVar, i);
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
