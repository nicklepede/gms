package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.R;
import defpackage.vui;
import defpackage.vuu;
import defpackage.vvi;
import defpackage.vvw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SelectionSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new vvw();
    public CharSequence a;
    public boolean b;

    public SelectionSectionInfo() {
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final vuu a(vui vuiVar, int i) {
        return new vvi(vuiVar, i, vuiVar.a.getString(R.string.appinvite_recipients), this.a, this.b, false);
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final vuu d(vui vuiVar, int i) {
        return new vvi(vuiVar, i, vuiVar.a.getString(R.string.appinvite_recipients), this.a, this.b, true);
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
