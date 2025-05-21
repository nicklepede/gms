package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.R;
import defpackage.tyj;
import defpackage.tyv;
import defpackage.tzj;
import defpackage.tzx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SelectionSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new tzx();
    public CharSequence a;
    public boolean b;

    public SelectionSectionInfo() {
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final tyv a(tyj tyjVar, int i) {
        return new tzj(tyjVar, i, tyjVar.a.getString(R.string.appinvite_recipients), this.a, this.b, false);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final tyv d(tyj tyjVar, int i) {
        return new tzj(tyjVar, i, tyjVar.a.getString(R.string.appinvite_recipients), this.a, this.b, true);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public SelectionSectionInfo(Parcel parcel) {
        super(parcel);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt() != 0;
    }
}
