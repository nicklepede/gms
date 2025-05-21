package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tyj;
import defpackage.tyv;
import defpackage.tyw;
import defpackage.tzu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CustomSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new tzu();
    private final int[] a;

    public CustomSectionInfo(int[] iArr) {
        this.a = iArr;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final tyv a(tyj tyjVar, int i) {
        return new tyw(tyjVar, this.a, i);
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
