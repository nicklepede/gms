package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vui;
import defpackage.vuu;
import defpackage.vuv;
import defpackage.vvt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CustomSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new vvt();
    private final int[] a;

    public CustomSectionInfo(int[] iArr) {
        this.a = iArr;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final vuu a(vui vuiVar, int i) {
        return new vuv(vuiVar, this.a, i);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeIntArray(this.a);
    }

    public CustomSectionInfo(Parcel parcel) {
        super(parcel);
        this.a = parcel.createIntArray();
    }
}
