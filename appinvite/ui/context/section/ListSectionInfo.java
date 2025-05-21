package com.google.android.gms.appinvite.ui.context.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import defpackage.tyj;
import defpackage.tyv;
import defpackage.tzc;
import defpackage.tzw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ListSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new tzw();
    private boolean q;

    public ListSectionInfo(Parcel parcel) {
        super(parcel);
        this.q = parcel.readInt() != 0;
    }

    @Override // com.google.android.gms.appinvite.ui.context.section.SectionInfo
    public final tyv a(tyj tyjVar, int i) {
        tzc tzcVar = new tzc(tyjVar, R.layout.appinvite_contextual_selection_list_item, i, true, this.i, true);
        tzcVar.U(this.g, this.h);
        return tzcVar;
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
