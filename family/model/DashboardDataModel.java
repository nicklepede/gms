package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.family.v2.model.PageDataMap;
import defpackage.azrs;
import defpackage.epte;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DashboardDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azrs();
    public final PageDataMap a;
    public final boolean b;
    public final epte c;
    public final ViewerDataModel d;
    public final PageData e;
    public final boolean f;

    public DashboardDataModel(boolean z, PageDataMap pageDataMap, ViewerDataModel viewerDataModel, epte epteVar, PageData pageData) {
        this.a = pageDataMap;
        this.b = z;
        this.c = epteVar;
        this.d = viewerDataModel;
        this.e = pageData;
        this.f = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c.g);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.d, i);
        PageData pageData = this.e;
        parcel.writeInt(pageData != null ? 1 : 0);
        if (pageData != null) {
            parcel.writeParcelable(pageData, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }

    public DashboardDataModel(Parcel parcel) {
        this.b = parcel.readInt() == 1;
        epte b = epte.b(parcel.readInt());
        this.c = b == null ? epte.UNKNOWN_FAMILY_ROLE : b;
        this.a = (PageDataMap) parcel.readParcelable(PageDataMap.class.getClassLoader());
        this.d = (ViewerDataModel) parcel.readParcelable(ViewerDataModel.class.getClassLoader());
        if (parcel.readInt() == 1) {
            this.e = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
        } else {
            this.e = null;
        }
        this.f = parcel.readInt() == 1;
    }
}
