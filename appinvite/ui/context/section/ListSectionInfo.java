package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.vui;
import defpackage.vuu;
import defpackage.vvb;
import defpackage.vvv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ListSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new vvv();
    private boolean q;

    public ListSectionInfo(Parcel parcel) {
        super(parcel);
        this.q = parcel.readInt() != 0;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final vuu a(vui vuiVar, int i) {
        vvb vvbVar = new vvb(vuiVar, R.layout.appinvite_contextual_selection_list_item, i, true, this.i, true);
        vvbVar.U(this.g, this.h);
        return vvbVar;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo, com.google.android.gms.appinvite.ui.context.section.SectionInfo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public ListSectionInfo(String str) {
        super(str);
    }
}
